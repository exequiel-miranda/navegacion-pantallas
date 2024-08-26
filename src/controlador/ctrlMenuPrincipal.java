package controlador;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import vista.frmMenuPrincipal;
import vista.panelAmarillo;
import vista.panelRojo;
import vista.panelVerde;

//3- Heredar de la clase MouseListener
public class ctrlMenuPrincipal implements MouseListener{
   
    //1-Mandar a llamar a las demas capas
    frmMenuPrincipal vista;
    
    //2-Constructor
    public ctrlMenuPrincipal(frmMenuPrincipal Vista){
        this.vista = Vista;
        
        vista.btnverde.addMouseListener(this);
        vista.btnAmarillo.addMouseListener(this);
        vista.btnRojo.addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
      
        if(e.getSource() == vista.btnverde){
            //1-Creo un objeto del panel que quiero mostrar
            panelVerde objVerde = new panelVerde();
            
            //2- Limpio el panel contendor (por si acaso)
            vista.jpContenedor.removeAll();
            //3- muestro el panel que quiero
            vista.jpContenedor.add(objVerde);
            
            //4- Refrescar todo
            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
        }
        
        if(e.getSource() == vista.btnAmarillo){
            panelAmarillo objAmarillo = new panelAmarillo();
            
            vista.jpContenedor.removeAll();
            vista.jpContenedor.add(objAmarillo);
            
            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
        }
        
        if(e.getSource() == vista.btnRojo){
            panelRojo objRojo = new panelRojo();
            
            vista.jpContenedor.removeAll();
            vista.jpContenedor.add(objRojo);
            
            vista.jpContenedor.revalidate();
            vista.jpContenedor.repaint();
        }
        
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
    
   
    
}
