package Ejercicio2;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class AppGrafica extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppGrafica frame = new AppGrafica();
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
	//Aplicacion para editar el tamaño de ventana.
	public AppGrafica() {
		
		setTitle("Titulo de la ventana");
		setBounds(400, 400, 371, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel etiqueta = new JLabel("Has pulsado:");
		etiqueta.setBounds(10, 20,80,20);
		JLabel etiqueta2 = new JLabel();
		etiqueta2.setBounds(91, 20,74,20);
		JButton btn1 = new JButton("Boton 1");
		btn1.setBounds(163, 20, 80, 20);
		JButton btn2 = new JButton("Boton 2");
		btn2.setBounds(252, 20, 80, 20);
		
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(etiqueta);
		contentPane.add(etiqueta2);

		setVisible(true);
	
		/*
		 * Objeto para decir el boton que has pulsado.
		 */
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	etiqueta2.setText(btn1.getText());
            }
		});
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	etiqueta2.setText(btn2.getText());
            }
		});
	}

}
