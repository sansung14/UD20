package Ejercicio5;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Ejercicio4.OyenteVentana;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class AppGrafica extends JFrame {

	protected static JTextArea textArea;
	private JPanel contentPane;
	private static String text = "";

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppGrafica frame = new AppGrafica();
					addEventos();
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
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(null);
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("Limpiar");
		btnNewButton.setBounds(172, 11, 89, 23);
		contentPane.add(btnNewButton);
		
		textArea = new JTextArea();
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(10, 47, 414, 203);
		contentPane.add(textArea);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textArea.setText("");
				text = "";
			}
		});
	}
	
	
	public static void addEventos() {
		textArea.addMouseListener(new MouseListener() {

			public void mouseClicked(MouseEvent e) {
				//Se llama cuando clicas el mouse.
				text +="Has presionado el boton\n";
				textArea.setText(text);
			}


			public void mousePressed(MouseEvent e) {
				//Muestra las coordenadas al clicar.
				text += "Coordenadas: (" + e.getX() + "," + e.getY() + ")\n";
				textArea.setText(text);

			}

			public void mouseReleased(MouseEvent e) {
				// se llama cuando has dejado de presionar el boton del mouse.
				text += "Has dejado de presionar el boton del mouse\n";
				textArea.setText(text);

			}

			public void mouseEntered(MouseEvent e) {
				// se llama cuando el mouse entra a los limites del componente.
				// Cuando sale y entra de la ventana (en este caso).
				text += "Acabas de entrar al area del componente\n";
				textArea.setText(text);

			}

			
			public void mouseExited(MouseEvent e) {
				// se llama cuando el cursor sale de los limites del componente.
				text += "Acabas de salir del area del componente\n";
				textArea.setText(text);
			}

		});
	}
}

