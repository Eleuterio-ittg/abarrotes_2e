
package principal;

import LibreriaMySQL.MySQLPrimario;


public class Principal {
    
    public static void main (String [] args){
        System.out.println("Bienvenido al sistema");
        System.out.println("conectamos una la base");
        MySQLPrimario ele = new MySQLPrimario();
        System.out.println("crearemos una tabla");
        String [] columnas = {"`np` INT(10) not null auto_increment","`nombre` VARCHAR(100)", "PRIMARY KEY (`np`)"};
        ele.CreacionTabla("eleuterio1", columnas);
        System.out.println("ingresamos algunos datos");
        String columas [] =  {"`nombre`"};
        String datos [] = {"'eleuterio'"};
        ele.agregarRegistro("eleuterio", columnas, datos);
        columas [0] =  "`nombre`";
        datos [0] = "'esteban'";
        ele.agregarRegistro("eleuterio", columnas, datos);
        columas [0] =  "`nombre`";
        datos [0] = "'elizabeth'";
        ele.agregarRegistro("eleuterio", columnas, datos);
        columas [0] =  "`nombre`";
        datos [0] = "'estrella'";
        ele.agregarRegistro("eleuterio", columnas, datos);
        columas [0] =  "`nombre`";
        datos [0] = "'eliza'";
        ele.agregarRegistro("eleuterio", columnas, datos);
        System.out.println("=========================");
        System.out.println("=========================");
        ele.imprimirContenido("eleuterio");
        System.out.println("=========================");
        System.out.println("=========================");
        System.out.println("");
        System.out.println("");
    }
    
    
}
