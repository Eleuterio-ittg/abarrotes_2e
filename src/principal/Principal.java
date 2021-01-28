
package principal;

import LibreriaMySQL.MySQLPrimario;
import Ventanas.*;


public class Principal {
    
    public static void main (String [] args){
          Contenedor ele = new Contenedor();
        ele.setVisible(true);
        ele.setVentanaSuperior(new Superior());
        ele.setVentanaCentro(new Operaciones());
    }
    
    
}
