/*



*/


package Enlaces;

public class EnlacePrimarioMySQL {
    
    static String baseDato = "bd_ventas";
    static String usuario = "abarrotes2e";
    static String contrasena = "Abarrotes2E";
    static String url = "jdbc:mysql://localhost/";
    static String puerto = "";
    static String zona = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    java.sql.Connection enlaceSQL = null;
    
    public EnlacePrimarioMySQL(){
        
        try {
            //Cargar en memoria la clase de MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            enlaceSQL = java.sql.DriverManager.getConnection(url + puerto + baseDato + zona, usuario, contrasena);
            System.out.println("Coneccion establecida");
        
        } catch (Exception e) {
            
            System.err.println("---Error:---  " + e);
            
        }
        
    }
    
    public java.sql.Connection getEnlaceSQL(){
        return this.enlaceSQL;
    }
    
    public void cerrarEnlaceSQL(){
        try{
            if(this.enlaceSQL.isClosed()){
                this.enlaceSQL.close();
                System.out.println("---Enlace cerrado----");
            }
        }
        catch(Exception e){
            System.out.println("---Error en la funcion cerrar ----");
        }
    }
    public static void main(String [] ars){
        try{
            EnlacePrimarioMySQL ele = new EnlacePrimarioMySQL();
        }catch(Exception e){
            
        }
    }
    

}

