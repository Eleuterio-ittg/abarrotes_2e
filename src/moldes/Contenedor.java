
package moldes;




public class Contenedor extends javax.swing.JFrame{
    
    public Contenedor(){
        this.setLayout(null);
        this.setSize(800, 600);
        this.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
    
    public Contenedor getContenedor(){
        return this;
    }
    
    public static javax.swing.JPanel eleSuperior = null;
    public static javax.swing.JPanel eleCentro = null;
    
    public void setVentanaSuperior(javax.swing.JPanel panelSuperior){
        eleSuperior = panelSuperior;
        eleSuperior.setLocation(0, 0);
        this.add(eleSuperior);
        this.repaint();
    }
    
    public void eliminarVentanaSuperior(){
        this.remove(eleSuperior);
    }
    
    public void setVentanaCentro(javax.swing.JPanel panelCentro){
        eleCentro = panelCentro;
        eleCentro.setLocation(0, 100);
        this.add(eleCentro);
        this.repaint();
    }
    
    public void eliminarVentanaCentro(){
        this.remove(eleCentro);
    }
    
    public void setContenedor(Contenedor marco){
    }
    
    public void eliminar(){
        this.dispose();
    }
}
