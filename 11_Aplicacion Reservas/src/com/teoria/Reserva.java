package com.teoria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Reserva {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Reserva window = new Reserva();
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
	public Reserva() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hola bro");
		lblNewLabel.setBounds(125, 114, 65, 14);
		lblNewLabel.setFont(new Font("Source Code Pro", Font.PLAIN, 11));
		frame.getContentPane().add(lblNewLabel);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"valencia", "sevilla", "madrid", "la coru\u00F1a", "cordoba"}));
		comboBox.setBounds(194, 47, 79, 22);
		frame.getContentPane().add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(245, 111, 65, 20);
		frame.getContentPane().add(spinner);
		
		JTextArea textArea = new JTextArea();
		textArea.setBackground(Color.PINK);
		textArea.setBounds(83, 173, 152, 77);
		frame.getContentPane().add(textArea);
		
		JButton btnNewButton = new JButton("Reservar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ciudad= (String) comboBox.getSelectedItem();
				int noches = (int) spinner.getValue();
				textArea.setText("Destino elegido "+ciudad+"\nNoches reservadas "+noches);
			}
		});
		btnNewButton.setBounds(83, 139, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		
	}
}
