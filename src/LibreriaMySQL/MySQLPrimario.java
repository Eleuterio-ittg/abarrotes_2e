
package LibreriaMySQL;

import Enlaces.EnlacePrimarioMySQL;
import java.sql.ResultSet;
import java.sql.Statement;


public class MySQLPrimario {
    
    /*
    Herramienta para crear las tablas que se van a usar en este programa
    */    
    public void CreacionTabla(){
        
        EnlacePrimarioMySQL enlace = new EnlacePrimarioMySQL();
        Statement consulta;
        ResultSet rs;
        
        try {
            consulta = enlace.getEnlaceSQL().createStatement();
            consulta.executeUpdate(
                    "create table `usuario` "
                            + "("
                            + "`np` INT(10) not null auto_increment, "
                            + "`nombre` VARCHAR(100) , "
                            + "`apellidos` VARCHAR(100), "
                            + "`domicilio` VARCHAR(100), "
                            + "`ciudad` VARCHAR(100), "
                            + "`Telefono` INT(12), "
                            + "`celular` INT(12), "
                            + "`e-mail` VARCHAR(100), "
                            + "`fecha_nacimiento` DATE, "
                            + "PRIMARY KEY (`np`)"
                            + ")"
                            + " ENGINE = InnoDB "
                            + "COLLATE utf32_spanish2_ci;"
            );             
            System.out.println("tabla creada");
            enlace.cerrarEnlaceSQL();
        } catch (Exception e) {
            System.err.println("---Error:---  " + e);
        }
        
    }
    
    //Cuando se utiliza la opcion auto incrementable se debe de colocar como llave primaria
    public void CreacionTabla(String tabla, String [] columnas){
        EnlacePrimarioMySQL enlace = new EnlacePrimarioMySQL();
        Statement consulta;
        if(verificadorContenido(tabla) && verificadorContenido(arrayAString(columnas))){
            try {
                consulta = enlace.getEnlaceSQL().createStatement();
                
                consulta.executeUpdate(
                        "create table `"+tabla+"` "
                                + "("
                                + arrayAString(columnas)
                                + ")"
                                + " ENGINE = InnoDB "
                                + "COLLATE utf32_spanish2_ci;"
                );             
                System.out.println("tabla creada");
                enlace.cerrarEnlaceSQL();
            } catch (Exception e) {
                System.err.println("---Error:---  " + e);
            }
        }
        else{
        System.out.println("---Error al crear la tabla con atributos");
        }
        
    }
    
    public void agregarRegistro(String tabla,String [] columnas2, String [] contenido2){
        String [] columnas = {"`nombre`"};
        String [] contenido = {"'ele'"};
        EnlacePrimarioMySQL enlace = new EnlacePrimarioMySQL();
        Statement consulta;
        if(verificadorContenido(tabla) && verificadorContenido(arrayAString(contenido))){
            try {
                consulta = enlace.getEnlaceSQL().createStatement();
                consulta.executeUpdate(
                        "insert into `"
                                + tabla
                                +"`  ("
                                + arrayAString(columnas)
                                + ") VALUES"
                                + "("
                                + arrayAString(contenido)
                                + ")"
                );             
                System.out.println("Insertar texto");
                enlace.cerrarEnlaceSQL();
            } catch (Exception e) {
                System.err.println("---Error:---  " + e);
            }
        }
        else{
        System.out.println("---Error al insertar texto en tabla " + tabla);
        }
        
    }
    
    //Aun no elimina, checando
    public void eliminarRegistro(String tabla, String columna, int numero){
        EnlacePrimarioMySQL enlace = new EnlacePrimarioMySQL();
        Statement consulta;
        if(verificadorContenido(tabla) && verificadorContenido(tabla) && numero == 0){
            try {
                consulta = enlace.getEnlaceSQL().createStatement();
                consulta.executeUpdate(
                        "delete from `"
                                + tabla
                                +"`  where `"
                                + columna
                                + "` ="
                                + numero
                );             
                System.out.println("restro eliminado");
                enlace.cerrarEnlaceSQL();
            } catch (Exception e) {
                System.err.println("---Error:---  " + e);
            }
        }
        else{
        System.out.println("---Error al eliminar registro " + tabla);
        }
    }
    
    public void imprimirContenido(String tabla){
        EnlacePrimarioMySQL enlace = new EnlacePrimarioMySQL();
        Statement consulta;
        ResultSet respuesta;
        
        try {
            consulta=enlace.getEnlaceSQL().createStatement();
            respuesta=consulta.executeQuery("select * from " + tabla);
            while (respuesta.next()) {                
                System.out.println(respuesta.getInt("np")+" " +respuesta.getString("nombre"));
            }
            enlace.cerrarEnlaceSQL();
        } catch (Exception e) {
            System.err.println("---Error:---  " + e);
        }
    }
    
    
    
    //Otras funciones
    public String arrayAString(String valores []){
        String valorTotal = "";
        if(!(valores.length == 0) || !(valores == null)){
            for(int ele = 0 ; ele < valores.length ; ele++){
                        valorTotal += valores[ele];
                        if(!(ele == valores.length-1)){
                            valorTotal += " , ";
                        }
                    }
//                    System.out.println(valorTotal);
        }
    return valorTotal;
    }
    
    public boolean verificadorContenido(String texto){
        if (!(texto == null || texto == "")){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
    
    public static void main (String [] args){
        String array [] = {"ee"};
        //new MySQLPrimario().eliminarRegistro("tabla", "np", 1);
        
    }
    
    
    
    
}
