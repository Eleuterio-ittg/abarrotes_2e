
package Ventanas;

import LibreriaMySQL.MySQLPrimario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JTextField;




public class Articulo extends javax.swing.JFrame{
    
    public static void main (String [] args) {
        new Articulo();
    }
    
    public Articulo(){
//        this.setSize(600, 550);
        this.setVisible(true);
        java.awt.Toolkit recursos = java.awt.Toolkit.getDefaultToolkit();
        java.awt.Dimension resolusion = recursos.getScreenSize();
        this.setBounds(((resolusion.width-600)/2),((resolusion.height-530)/2),600,530);
        this.setTitle("Agregar Articulo");
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
        PanelArticulo ele =  new PanelArticulo();
//        ele.setLocation(0, 0);
//        iniciarElementos();
        this.add(ele);
        
    }
    
    
        
        private void salir(){
            dispose();
        }
        
        public JTextField codigo = new JTextField();
        public JTextField descripcion = new JTextField();
        public JTextField localizacion = new JTextField();
        public JTextField observacion = new JTextField();
        public JTextField factor = new JTextField();
        public JTextField precioCompra = new JTextField();
        public JTextField utilidad = new JTextField();
        public JTextField precioVenta = new JTextField();
        
        private JComboBox categoria = new javax.swing.JComboBox();
        private JComboBox departamento = new javax.swing.JComboBox();
        private JComboBox unidadCompra = new javax.swing.JComboBox();
        private JComboBox unidadVenta = new javax.swing.JComboBox();
        
        private JCheckBox sinFoto = new javax.swing.JCheckBox();
        
    
        
    class PanelArticulo  extends javax.swing.JPanel{
        
        
        private JButton agregarFoto = new javax.swing.JButton("Agregar foto");
        private JButton eliminarFoto = new javax.swing.JButton("Eliminar foto");
        private JButton cancelar = new javax.swing.JButton("Cancelar");
        private JButton guardar = new javax.swing.JButton("Guardar");
        
        
        public PanelArticulo(){
            this.setSize(700, 600);
            this.setLocation(0, 0);
            this.setBackground(java.awt.Color.white);
            this.setLayout(null);
            agregarEtiquetas();
            codigo.setBounds(297, 48, 278, 30);
            this.add(codigo);
            descripcion.setBounds(19,212,556,30);
            this.add(descripcion);
            localizacion.setBounds(17,265,267,30);
            this.add(localizacion);
            observacion.setBounds(310,265,267,30);
            this.add(observacion);
            factor.setBounds(398,324, 182, 30);
            this.add(factor);
            precioCompra.setBounds(17, 384, 171, 30);
            this.add(precioCompra);
            utilidad.setBounds(213, 384, 171, 30);
            this.add(utilidad);
            precioVenta.setBounds(408,384,171,30);
            this.add(precioVenta);
            agregarFoto.setBounds(162,43,101,40);
            this.add(agregarFoto);
            agregarFoto.setEnabled(false);
            eliminarFoto.setBounds(162, 92, 101, 40);
            this.add(eliminarFoto);
            eliminarFoto.setEnabled(false);
            cancelar.setBounds(133, 428, 137, 45);
            cancelar.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    salir();
                }
            });
            this.add(cancelar);
            guardar.setBounds(331,428,137,45);
            guardar.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    MySQLPrimario ele = new MySQLPrimario();
                    String [] columnas = new String [] { "codigo",
                        "descripcion", "categoria", "departamento", "localizacion",
                        "precio_compra", "precio_venta", "utilidad", "unidad_compra",
                        "unidad_venta", "factor", "observacion"
                    };
                    String [] contenido = new String [] { codigo.getText(),
                        descripcion.getText(), categoria.getSelectedItem().toString(),
                        departamento.getSelectedItem().toString(), localizacion.getText(),
                        precioCompra.getText(), precioVenta.getText(), utilidad.getText(), 
                        unidadCompra.getSelectedItem().toString(),
                        unidadVenta.getSelectedItem().toString(), 
                        factor.getText(), observacion.getText()
                    };
                    ele.agregarRegistro("articulo_1", columnas, contenido);
                    salir();
                }
            }
            );
            this.add(guardar);
            categoria.setBounds(297, 101, 279, 30);
            categoria.setEditable(true);
//            categoria.addItem("General");
            this.add(categoria);
            departamento.setBounds(297,162,279,30);
            departamento.setEditable(true);
//            departamento.addItem("General");
            this.add(departamento);
            unidadCompra.setBounds(17,325,171,30);
            unidadCompra.setEditable(true);
//            unidadCompra.addItem("Pieza");
            this.add(unidadCompra);
            unidadVenta.setBounds(212, 324, 171, 30);
            unidadVenta.setEditable(true);
//            unidadVenta.addItem("Pieza");
            this.add(unidadVenta);
            sinFoto.setBounds(167,159,90,22);
            sinFoto.setText("Sin foto");
            sinFoto.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    if(sinFoto.isSelected()){
                        agregarFoto.setEnabled(false);
                        eliminarFoto.setEnabled(false);
                    }
                }
            }
            );
            sinFoto.setSelected(true);
            this.add(sinFoto);
        }
        
        
        
        private void agregarEtiquetas(){
            Ventanas.Herramienta.Utilidades1 ele = new Ventanas.Herramienta.Utilidades1();
            ele.etiqueta(this, "Codigo", 313, 28, 68, 24, java.awt.Color.white);
            ele.etiqueta(this, "Categoria", 314, 80, 84, 24, java.awt.Color.white);
            ele.etiqueta(this, "Departamento", 313, 139, 125, 24, java.awt.Color.white);
            ele.etiqueta(this, "Descripcion", 51, 194, 136, 24, java.awt.Color.white);
            ele.etiqueta(this, "Localiacion", 42, 246, 109, 24, java.awt.Color.white);
            ele.etiqueta(this, "Observacion", 335, 246, 109, 24, java.awt.Color.white);
            ele.etiqueta(this, "Unidad de Compra", 25, 304, 155, 24, java.awt.Color.white);
            ele.etiqueta(this, "Unidad de Venta", 220, 303, 155, 24, java.awt.Color.white);
            ele.etiqueta(this, "Factor", 422, 304, 101, 24, java.awt.Color.white);
            ele.etiqueta(this, "Precio de compra", 17, 363, 171, 24, java.awt.Color.white);
            ele.etiqueta(this, "Utilidad (%)", 213, 362, 171, 24, java.awt.Color.white);
            ele.etiqueta(this, "Precio de venta", 408, 362, 171, 24, java.awt.Color.white);
        }

        
        
        
        
        
        
        
    }
    
}
