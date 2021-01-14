
package Enlaces;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;


public class EnlacePrimario {
    
    static String baseDato = "bd_ventas";
    static String usuario = "abarrotes2e";
    static String contrasena = "Abarrotes2E";
    static String url = "jdbc:mysql://localhost/";
    static String puerto = "";
    static String zona = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    
    java.sql.Connection con;
    
    public EnlacePrimario(){
        
        try {
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url + puerto + baseDato + zona, usuario, contrasena);
            JOptionPane.showMessageDialog(null, "Coneccion establecida");
        } catch (Exception e) {
            System.err.println("---Error:---  " + e);
        }
        
    }
    public static void main(String[] args) {
        
        EnlacePrimario cn = new EnlacePrimario();
        
    }

}
