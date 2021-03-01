package Ejercicio1;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class AppGrafic extends JFrame{


	
	private JPanel contentPane;
	
	public static void main(String[] args) {
		AppGrafic ventana = new AppGrafic();
	}
	
	
	//Aplicacion para editar el tamaño de ventana.
	public AppGrafic() {
		
		setTitle("Titulo de la ventana");
		setBounds(400, 400, 300, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		setContentPane(contentPane);
		JLabel etiqueta = new JLabel("Cambiar tamaño ventana:");
		etiqueta.setBounds(60, 20,200,20);
		JTextField textField = new JTextField("600");
		textField.setBounds(60, 40,180,20);
		JTextField textField2 = new JTextField("400");
		textField2.setBounds(60, 60,180,20);
		JButton btnPulsame = new JButton("editar tamaño");
		btnPulsame.setBounds(75, 120, 150, 20);
		
		contentPane.add(btnPulsame);
		contentPane.add(textField);
		contentPane.add(textField2);
		contentPane.add(etiqueta);
		setVisible(true);

		//Objeto para saludar cogiendo el nombre introducido.
		btnPulsame.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	int ancho = Integer.parseInt(textField.getText());
            	int vertical = Integer.parseInt(textField2.getText());
            	setBounds(400, 400, ancho, vertical);   
            }

		});
	}
	
	
	
}
