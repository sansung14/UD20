package Ejercicio4;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class AppGrafica extends JFrame {

	private JPanel contentPane;

	protected static JTextArea textArea;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppGrafica frame = new AppGrafica();
			        frame.addEventos(new OyenteVentana(frame));
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AppGrafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 346, 305);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Eventos:");
		lblNewLabel.setBounds(10, 119, 46, 14);
		contentPane.add(lblNewLabel);
		
		textArea = new JTextArea();
		textArea.setBounds(66, 11, 254, 244);
		contentPane.add(textArea);
	}
	
	public void addEventos(OyenteVentana oyente) {
        this.addWindowListener(oyente);
    }
	
}
