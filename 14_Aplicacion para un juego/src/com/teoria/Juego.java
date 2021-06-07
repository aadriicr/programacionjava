package com.teoria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Juego {

	private JFrame frame;
	private int puntuacion=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego window = new Juego();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Juego() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Campus FP\\Downloads\\bmw.png"));
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Juego superchungo");
		lblNewLabel.setBounds(32, 61, 94, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Puntuacion");
		lblNewLabel_1.setBounds(336, 61, 53, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblPuntuacion = new JLabel(puntuacion+" puntos");
		lblPuntuacion.setBounds(435, 61, 46, 14);
		frame.getContentPane().add(lblPuntuacion);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.YELLOW);
		panel.setBounds(10, 99, 494, 166);
		frame.getContentPane().add(panel);
		panel.setLayout(new GridLayout(1, 0, 0, 0));
		
		
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u00BFCual es la mascara de red en una red de clase C?");
		panel_1.add(lblNewLabel_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("255.0.0.0");
		panel_1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("255.255.0.0");
		panel_1.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("255.255.255.0");
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("192.168.1.0");
		panel_1.add(rdbtnNewRadioButton);
		
		ButtonGroup grupo= new ButtonGroup();
		grupo.add(rdbtnNewRadioButton);
		grupo.add(rdbtnNewRadioButton_1);
		grupo.add(rdbtnNewRadioButton_2);
		grupo.add(rdbtnNewRadioButton_3);
		
		
		
		JButton btnNewButton = new JButton("Responder");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()) {
					JOptionPane.showMessageDialog(btnNewButton, "Has conseguido 1 punto");
					puntuacion++;
					lblPuntuacion.setText(puntuacion+" puntos");
				}	
			}
		});
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
	}
}
