import java.awt.*;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 * Created by bp0413 on 13/11/2019.
 */
public class Vista extends java.awt.Canvas implements IVista, PropertyChangeListener{
    private Graphics2D g2d;
    private Tablero modelo;
    private int[][] tablero;
    public Vista(Tablero modelo){
        this.modelo=modelo;
        tablero = modelo.getTablero();
    }
    public void paint(java.awt.Graphics g){
        g2d=(Graphics2D)g;
        dibujaTablero();
    }
    private void dibujaTablero(){
        int tamanio= modelo.getTamanio();
        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {

            }

        }
    }
    public void propertyChange(java.beans.PropertyChangeEvent evt){
        System.out.println("Vista.propertyChange()\n");
        tablero= (int[][])evt.getNewValue();
        repaint();
    }

}
