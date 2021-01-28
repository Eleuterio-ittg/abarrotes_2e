/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas.Herramienta;

/**
 *
 * @author USUARIO
 */
public class Utilidades1 {
    
    public void etiqueta(javax.swing.JPanel panel, String leyenda, int lx, int ly, int tx, int ty, java.awt.Color color){
            javax.swing.JLabel etiqueta = new javax.swing.JLabel(leyenda);
            etiqueta.setLocation(lx, ly);
            etiqueta.setSize(tx, ty);
            if(!(color == null)){
                etiqueta.setBackground(color);
            }
            panel.add(etiqueta);
        }
    
    public javax.swing.JTextField AreaTexto(javax.swing.JTextField texto, int lx, int ly, int tx, int ty){
            texto = new javax.swing.JTextField();
            texto.setLocation(lx, ly);
            texto.setSize(tx, ty);
            return texto;
        }
    
    
    
}
