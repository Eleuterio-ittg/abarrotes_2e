/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

/**
 *
 * @author USUARIO
 */
public class Superior extends javax.swing.JPanel {
    
    public javax.swing.JPanel botones= null;
    public javax.swing.JButton operaciones = new javax.swing.JButton();
    public javax.swing.JButton configuraciones = new javax.swing.JButton();
    public javax.swing.JButton informacion = new javax.swing.JButton();
    public int numero = 0;
    
    public Superior (){
        this.setSize(800, 78);
        this.setBackground(java.awt.Color.yellow);
        botones = new javax.swing.JPanel();
        botones.setSize(650, 70);
        botones.setBackground(java.awt.Color.yellow);
        botones.setLocation(150, 4);
        botones.setLayout(null);
        this.add(botones);
        this.agregarBotones();
    }
    
    public Superior(javax.swing.JPanel cambio){
        cambio.removeAll();
        cambio = this;
        
        
    }
    
    
    public void agregarBotones(){
        this.operaciones.setText("Operaciones");
        this.operaciones.setSize(150, 80);
        this.operaciones.addActionListener(new Operaciones());
        this.operaciones.doClick();
        this.botones.add(this.operaciones);
        this.configuraciones.setText("configuraciones");
        this.configuraciones.setSize(150, 80);
        this.configuraciones.setLocation(200, 0);
        this.botones.add(this.configuraciones);
        this.informacion.setText("Informacion");
        this.informacion.setSize(150, 80);
        this.informacion.setLocation(400, 0);
        this.botones.add(this.informacion);
    }
    
    
    
}
