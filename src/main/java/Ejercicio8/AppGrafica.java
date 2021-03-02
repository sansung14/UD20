package Ejercicio8;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;

public class AppGrafica extends JFrame {

	private JPanel contentPane;
	private static JTextField txtAsdf;
	private static JTextField textField;
	protected static JButton btnNewButton;
	private static DecimalFormat df = new DecimalFormat("0.0000");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AppGrafica frame = new AppGrafica();
					teclado();
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
		setTitle("Calculadora cambio  de monedas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 168);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);

		btnNewButton = new JButton("Euros a ptas");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(63, 67, 120, 23);
		contentPane.add(btnNewButton);

		JLabel lblNewLabel = new JLabel("Cantidad a convertir:");
		lblNewLabel.setBounds(24, 24, 120, 14);
		contentPane.add(lblNewLabel);

		txtAsdf = new JTextField();
		txtAsdf.setText("56");
		txtAsdf.setBounds(151, 21, 86, 20);
		contentPane.add(txtAsdf);
		txtAsdf.setColumns(10);

		JLabel lblNewLabel_1 = new JLabel("Resultado:");
		lblNewLabel_1.setBounds(247, 24, 72, 14);
		contentPane.add(lblNewLabel_1);

		JButton btnNewButton_1 = new JButton("Cambiar");
		btnNewButton_1.setBounds(193, 67, 89, 23);
		contentPane.add(btnNewButton_1);

		textField = new JTextField();
		textField.setText("234");
		textField.setEditable(false);
		textField.setBounds(316, 21, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);

		JButton btnNewButton_2 = new JButton("Borrar");
		btnNewButton_2.setBounds(287, 67, 89, 23);
		contentPane.add(btnNewButton_2);

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					if (btnNewButton.getText().equals("Euros a ptas")) {
						double resultado = Double.parseDouble(txtAsdf.getText()) * 166.386;
						textField.setText(df.format(resultado));
					} else {
						double resultado = Double.parseDouble(txtAsdf.getText()) / 166.386;
						textField.setText(df.format(resultado));
					}
				} catch (NumberFormatException er) {
					JOptionPane.showMessageDialog(null, "¡Error no has introducido un numero o as puesto una ','!");
				}

			}
		});

		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton.getText().equals("Euros a ptas")) {
					btnNewButton.setText("Ptas a Euros");
				} else {
					btnNewButton.setText("Euros a ptas");
				}
			}
		});

		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtAsdf.setText("");
				textField.setText("");
			}
		});

	}

	public static void teclado() {
		txtAsdf.addKeyListener(new KeyAdapter() {

			
		
			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void keyPressed(KeyEvent e) {
				try {
					int key = e.getKeyCode();
					if (key == KeyEvent.VK_ENTER) {
						if (btnNewButton.getText().equals("Euros a ptas")) {
							double resultado = Double.parseDouble(txtAsdf.getText()) * 166.386;
							textField.setText(df.format(resultado));
						} else {
							double resultado = Double.parseDouble(txtAsdf.getText()) / 166.386;
							textField.setText(df.format(resultado));
						}
					}
				} catch (NumberFormatException er) {
					JOptionPane.showMessageDialog(null, "¡Error no has introducido un numero o as puesto una ',' !");
				}
			}
		});

}

}
