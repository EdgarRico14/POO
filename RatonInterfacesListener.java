/*
 * Demostración de los eventos de ratón.*
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RastreadorRaton extends JFrame implements MouseListener, MouseMotionListener {
    private JLabel barraEstado;
    
    // configurar GUI y registrar manejadores de eventos de ratón
    public RastreadorRaton()
    {
        super( "Demostración de los eventos de ratón" );
        barraEstado = new JLabel();
        getContentPane().add( barraEstado, BorderLayout.SOUTH );
        
        addMouseListener( this ); // escucha sus propios eventos de ratón
        addMouseMotionListener( this ); // y de movimiento de ratón
        setSize( 300, 125 );
        setVisible( true );
    }
    
    // Manejadores de eventos de MouseListener
    // manejar el evento cuando el botón del ratón se suelta inmediatamente después deoprimir
    public void mouseClicked( MouseEvent evento )
    {
        barraEstado.setText( "Se hizo clic en [" + evento.getX() +
                            ", " + evento.getY() + "]" );
    }
    // manejar evento cuando se oprime el botón del ratón
    public void mousePressed( MouseEvent evento )
    {
        barraEstado.setText( "Se oprimió en [" + evento.getX() +
                            ", " + evento.getY() + "]" );
    }
    // manejar evento cuando se suelta el ratón después de arrastrar
    public void mouseReleased( MouseEvent evento )
    {
        barraEstado.setText( "Se soltó en [" + evento.getX() +
                            ", " + evento.getY() + "]" );
    }
    
    // manejar el evento cuanddo el ratón entra al área
    public void mouseEntered( MouseEvent evento )
    {
        barraEstado.setText( "Ratón entro en [" + evento.getX() +
                            ", " + evento.getY() + "]" );
        getContentPane().setBackground( Color.GREEN );
    }
    // manejar evento cuando el ratón sale del área
    public void mouseExited( MouseEvent evento )
    {
        barraEstado.setText( "Ratón fuera de la ventana" );
        getContentPane().setBackground( Color.WHITE );
    }
    
    // Manejadores de eventos de MouseMotionListener
    // manejar el evento cuando el usuario arrastra el ratón con el botón oprimido
    public void mouseDragged( MouseEvent evento )
    {
        barraEstado.setText( "Se arrastró en [" + evento.getX() +
                            ", " + evento.getY() + "]" );
    }
    // manejar el evento cuando el usuario mueve el ratón
    public void mouseMoved( MouseEvent evento )
    {
        barraEstado.setText( "Se movió en [" + evento.getX() +
                            ", " + evento.getY() + "]" );
    }
  
} // fin de la clase RastreadorRaton

public class RatonInterfacesListener{
        public static void main( String args[] )
        {
            RastreadorRaton aplicacion = new RastreadorRaton();
            aplicacion.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        }
}


