
package moldes;


public class Operaciones extends javax.swing.JPanel implements java.awt.event.ActionListener {

    public Operaciones(){
        this.setSize(800, 450);
        this.setLayout(null);
        this.setBackground(java.awt.Color.white);
        this.panel();
    }

    public void panel(){
        javax.swing.JButton ventas = new javax.swing.JButton("ventas"); 
        ventas.setSize(200, 100);
        ventas.setLocation(10, 10);
        this.add(ventas);
        javax.swing.JButton compras = new javax.swing.JButton("compras"); 
        compras.setSize(200, 100);
        compras.setLocation(230, 10);
        this.add(compras);
        javax.swing.JButton pedidos = new javax.swing.JButton("pedidos"); 
        pedidos.setSize(200, 100);
        pedidos.setLocation(450, 10);
        this.add(pedidos);
        javax.swing.JButton usuario = new javax.swing.JButton("usuario"); 
        usuario.setSize(200, 100);
        usuario.setLocation(10, 220);
        this.add(usuario);
        javax.swing.JButton inventario = new javax.swing.JButton("inventario"); 
        inventario.setSize(200, 100);
        inventario.setLocation(230, 220);
        this.add(inventario);
        javax.swing.JButton proveedores = new javax.swing.JButton("proveedores"); 
        proveedores.setSize(200, 100);
        proveedores.setLocation(450, 220);
        this.add(proveedores);
        javax.swing.JButton clientes = new javax.swing.JButton("clientes"); 
        clientes.setSize(200, 100);
        clientes.setLocation(10, 3300);
        this.add(clientes);
        
        this.add(ventas);
    }
    
    public void actionPerformed(java.awt.event.ActionEvent e) {
        System.out.println("ejecution normal");
        
    }
    
}
