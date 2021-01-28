
package Ventanas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Operaciones extends javax.swing.JPanel implements java.awt.event.ActionListener {

    public Operaciones(){
        this.setSize(800, 450);
        this.setLayout(null);
        this.setBackground(java.awt.Color.white);
        this.panel();
    }

    public void panel(){
        javax.swing.JButton ventas = new javax.swing.JButton("ventas"); 
        ventas.setSize(215, 114);
        ventas.setLocation(50, 46);
        ventas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Venta();
            }
        });
        ventas.setEnabled(false);
        this.add(ventas);
        javax.swing.JButton compras = new javax.swing.JButton("compras"); 
        compras.setSize(215, 114);
        compras.setLocation(282, 46);
        compras.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Compra();
            }
        });
        compras.setEnabled(false);
        this.add(compras);
        javax.swing.JButton pedidos = new javax.swing.JButton("pedidos"); 
        pedidos.setSize(215, 114);
        pedidos.setLocation(513, 46);
        pedidos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new pedido();
            }
        });
        pedidos.setEnabled(false);
        this.add(pedidos);
        javax.swing.JButton usuario = new javax.swing.JButton("usuario"); 
        usuario.setSize(215, 114);
        usuario.setLocation(50, 175);
        usuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Usuario();
            }
        });
        pedidos.setEnabled(false);
        this.add(usuario);
        javax.swing.JButton inventario = new javax.swing.JButton("inventario"); 
        inventario.setSize(215, 114);
        inventario.setLocation(282, 175);
        inventario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Inventario();
            }
        });
        inventario.setEnabled(false);
        this.add(inventario);
        javax.swing.JButton proveedores = new javax.swing.JButton("proveedores"); 
        proveedores.setSize(215, 114);
        proveedores.setLocation(513, 175);
        proveedores.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Articulo();
            }
        });
        proveedores.setEnabled(false);
        this.add(proveedores);
        javax.swing.JButton clientes = new javax.swing.JButton("clientes"); 
        clientes.setSize(215, 114);
        clientes.setLocation(50, 305);
        clientes.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Cliente();
            }
        });
        clientes.setEnabled(false);
        this.add(clientes);
        javax.swing.JButton articulo = new javax.swing.JButton("articulo"); 
        articulo.setSize(215, 114);
        articulo.setLocation(282, 305);
        articulo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Articulo();
            }
        });
        articulo.setEnabled(true);
        this.add(articulo);
        javax.swing.JButton corteCaja = new javax.swing.JButton("Corte de Caja"); 
        corteCaja.setSize(215, 114);
        corteCaja.setLocation(513, 305);
        corteCaja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Articulo();
            }
        });
        corteCaja.setEnabled(false);
        this.add(corteCaja);
    }
    
    public void actionPerformed(java.awt.event.ActionEvent e) {
        System.out.println("ejecution normal");
        
    }
    
}
