package com.practica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import java.awt.BorderLayout;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;

public class Salario {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Salario window = new Salario();
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
	public Salario() {
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
		
		JLabel lblNewLabel = new JLabel("Salario");
		lblNewLabel.setBounds(40, 28, 97, 30);
		frame.getContentPane().add(lblNewLabel);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(139, 28, 53, 30);
		frame.getContentPane().add(spinner);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"indefinido", "practicas", "temporal"}));
		comboBox.setBounds(139, 69, 97, 30);
		frame.getContentPane().add(comboBox);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.setBounds(147, 152, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de contrato");
		lblNewLabel_1.setBounds(40, 69, 79, 30);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Resultado");
		lblNewLabel_2.setBounds(40, 211, 77, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(139, 203, 108, 47);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Estas desempleado?");
		chckbxNewCheckBox.setBounds(139, 106, 123, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
	}
}
