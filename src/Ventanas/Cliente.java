/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import LibreriaMySQL.MySQLPrimario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;

/**
 *
 * @author USUARIO
 */
public class Cliente  extends javax.swing.JFrame{
    
    public static void main (String [] args) {
        new Cliente();
    }
    
    public Cliente(){
        this.setVisible(true);
        java.awt.Toolkit recursos = java.awt.Toolkit.getDefaultToolkit();
        java.awt.Dimension resolusion = recursos.getScreenSize();
        this.setBounds(((resolusion.width-600)/2),((resolusion.height-530)/2),600,530);
        this.setTitle("Usuario");
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        PanelArticulo ele =  new PanelArticulo();
        this.add(ele);
    }
    
    
        
        private void salir(){
            dispose();
        }
        
        public JTextField nombre = new JTextField();
        public JTextField apellido = new JTextField();
        public JTextField domicilio = new JTextField();
        public JTextField telefono = new JTextField();
        public JTextField celular = new JTextField();
        
    class PanelArticulo  extends javax.swing.JPanel{
        
        
        private JButton guardar = new javax.swing.JButton("Guardar");
        
        
        public PanelArticulo(){
            this.setSize(700, 600);
            this.setLocation(0, 0);
            this.setBackground(java.awt.Color.white);
            this.setLayout(null);
            agregarEtiquetas();
            nombre.setBounds(54,132,439, 40);
            this.add(nombre);
            apellido.setBounds(54, 187, 439, 40);
            this.add(apellido);
            domicilio.setBounds(54, 244, 439, 40);
            this.add(domicilio);
            telefono.setBounds(54, 320, 205, 40);
            this.add(telefono);
            celular.setBounds(282, 320, 205, 40);
            this.add(celular);
            guardar.setBounds(210, 369, 111, 30);
            guardar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    MySQLPrimario ele = new MySQLPrimario();
                    String [] columnas = new String [] { "nombre",
                        "apellido", "domicilio", "telefono", "celular", "fecha"
                    };
                    String mes = (LocalDate.now().getMonthValue() < 9)? "0"+LocalDate.now().getMonthValue() : ""+LocalDate.now().getMonthValue();
                    String [] contenido = new String [] { 
                        nombre.getText(), apellido.getText(),
                        domicilio.getText(), telefono.getText(), celular.getText(),
                        LocalDate.now().getYear()+""+
                        mes    
                        +""+LocalDate.now().getDayOfMonth()
                    };
                    ele.agregarRegistro("usuario", columnas, contenido);
                    salir();
                }
            }
            );
            this.add(guardar);
        }
        
        
        
        private void agregarEtiquetas(){
            Ventanas.Herramienta.Utilidades1 ele = new Ventanas.Herramienta.Utilidades1();
            ele.etiqueta(this, "Configuraciones de usuario", 218, 80, 204, 26, java.awt.Color.white);
            ele.etiqueta(this, "Nombres", 70,  116, 76, 21, java.awt.Color.white);
            ele.etiqueta(this, "Apellidos", 70, 173,76,21, java.awt.Color.white);
            ele.etiqueta(this, "Domicilio", 70, 232, 76, 21, java.awt.Color.white);
            ele.etiqueta(this, "Telefono", 70, 286, 76, 21, java.awt.Color.white);
            ele.etiqueta(this, "Celular", 298, 289, 76, 21, java.awt.Color.white);
        }

        
        
        
        
        
        
        
    }
    
}
