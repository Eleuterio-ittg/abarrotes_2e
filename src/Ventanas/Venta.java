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
public class Venta extends javax.swing.JPanel{
    
    public Venta(){
        this.setLayout(null);
        this.setSize(800, 600);
        this.setBackground(java.awt.Color.yellow);
        CintilloVenta opcion = new CintilloVenta();
        opcion.setLocation(0, 0);
        this.add(opcion);
    }
    
    javax.swing.JButton buscar = null;
    javax.swing.JButton cantidad = null;
    javax.swing.JButton remover = null;
    javax.swing.JButton caja = null;
    javax.swing.JButton cliente = null;
    javax.swing.JButton compra = null;
    javax.swing.JButton regresar = null;
    
    
    class CintilloVenta extends javax.swing.JPanel{
        public CintilloVenta(){
            this.setSize(800, 700);
            this.setLayout(null);
            this.setLayout(null);
            agregarControles();
        }
        
        public void agregarControles(){
            
            javax.swing.JScrollPane scroll = new javax.swing.JScrollPane();
            scroll.setSize(590, 70);
            scroll.setLocation(200, 4);
            scroll.setBackground(java.awt.Color.red);
            botones(scroll, buscar, "buscar");
            botones(scroll, cantidad, "cantidad");
            botones(scroll, remover, "remover");
            botones(scroll, caja, "caja");
            botones(scroll, cliente, "cliente");
            botones(scroll, compra, "compra");
            botones(scroll, regresar, "regresar");
            add(scroll);
        }
        
        public int avance = 0;
        
        public void botones(javax.swing.JScrollPane barra, javax.swing.JButton boton, String texto){
            boton = new javax.swing.JButton();
            boton.setSize(100, 70);
            boton.setText(texto);
            boton.setLocation((10 * avance) + (avance * ((avance == 0)? 0: 80)), 0);
            ++avance;
            barra.add(boton);
        }
        
    }    
    
    
}
