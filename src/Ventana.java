import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by bp0413 on 13/11/2019.
 */
public class Ventana extends java.awt.Frame{
     public Ventana (int tamanio){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                dispose();
                System.exit(0);
            }
        }
        );
        setSize(IVista.COMIENZO_X*2+IVista.LADO*tamanio,IVista.COMIENZO_Y*2+IVista.LADO*tamanio+20);
    }
    public void insertarVista(java.awt.Component comp){
        super.add(comp);
        setVisible(true);
    }

    }