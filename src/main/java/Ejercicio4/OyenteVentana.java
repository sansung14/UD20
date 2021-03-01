package Ejercicio4;

import java.awt.Color;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;
 
public class OyenteVentana implements WindowListener {
     
    private AppGrafica ventana;
    private String text = "";
     
    public OyenteVentana(AppGrafica ventana) {
        this.ventana = ventana;
    }
 
    @Override
    public void windowOpened(WindowEvent e) {
    	text+= "Ventana iniciada por primera vez\n";
        AppGrafica.textArea.setText(text);
    }
 
 
    @Override
    public void windowIconified(WindowEvent e) {
    	text+= "la ventana se a minimizado\n";
        AppGrafica.textArea.setText(text);
    }
 
    @Override
    public void windowDeiconified(WindowEvent e) {
    	text+= "La ventana se a maximizado\n";
        AppGrafica.textArea.setText(text);
    }
 
    @Override
    public void windowActivated(WindowEvent e) {
    	text+= "La ventana esta activa\n";
        AppGrafica.textArea.setText(text);
    }
 
    @Override
    public void windowDeactivated(WindowEvent e) {
    	text+= "La ventana no esta activa\n";
        AppGrafica.textArea.setText(text);

    }

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
         
}