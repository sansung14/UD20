package Ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AppGrafica extends JFrame {

	private JPanel contentPane;
	int count1 = 0;
	int count2 = 0;
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
	public AppGrafica() {
		setTitle("Titulo de la ventana");
		setBounds(400, 400, 380, 202);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel etiqueta = new JLabel("Boton 1:");
		etiqueta.setBounds(78, 20,54,20);
		JLabel etiqueta2 = new JLabel();
		etiqueta2.setText("veces");
		etiqueta2.setBounds(162, 20,41,20);
		JButton btn1 = new JButton("Boton 1");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn1.setBounds(85, 76, 86, 38);
		JButton btn2 = new JButton("Boton 2");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btn2.setBounds(190, 76, 86, 38);
		
		contentPane.add(btn1);
		contentPane.add(btn2);
		contentPane.add(etiqueta);
		contentPane.add(etiqueta2);
		
		JLabel lblBoton = new JLabel("Boton 2:");
		lblBoton.setBounds(203, 20, 54, 20);
		contentPane.add(lblBoton);
		
		JLabel etiqueta2_1 = new JLabel();
		etiqueta2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		etiqueta2_1.setText("0");
		etiqueta2_1.setBounds(115, 20, 41, 20);
		contentPane.add(etiqueta2_1);
		
		JLabel etiqueta2_2 = new JLabel();
		etiqueta2_2.setText("veces");
		etiqueta2_2.setBounds(280, 20, 74, 20);
		contentPane.add(etiqueta2_2);
		
		JLabel etiqueta2_1_1 = new JLabel();
		etiqueta2_1_1.setText("0");
		etiqueta2_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
		etiqueta2_1_1.setBounds(233, 20, 41, 20);
		contentPane.add(etiqueta2_1_1);

		setVisible(true);
	
		/*
		 * Objeto para decir el boton que has pulsado.
		 */
		btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	count1++;
            	etiqueta2_1.setText(Integer.toString(count1));
            }
		});
		btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	count2++;
            	etiqueta2_1_1.setText(Integer.toString(count2));
            }
		});
	}
}
