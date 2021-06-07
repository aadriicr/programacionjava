package com.teoria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;

public class LayoutEventos {

	private JFrame frame;
	private JTextField textFieldMail;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutEventos window = new LayoutEventos();
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
	public LayoutEventos() {
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
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(84, 56, 72, 28);
		frame.getContentPane().add(lblNewLabel);
		
		/*añadir JDatePicker*/
		
		UtilDateModel modelo= new UtilDateModel();
		modelo.setValue(new Date());
		JDatePanelImpl implementacion= new JDatePanelImpl(modelo);
		JDatePickerImpl datePicker= new JDatePickerImpl(implementacion, null);
		datePicker.setBounds(160, 200, 150, 50);
		
		frame.getContentPane().add(datePicker);
		
		
		textFieldMail = new JTextField();
		textFieldMail.setBackground(Color.PINK);
		textFieldMail.setBounds(177, 64, 86, 20);
		frame.getContentPane().add(textFieldMail);
		textFieldMail.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("...");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblNewLabel_1.setBounds(10, 166, 350, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		JButton btnNewButton = new JButton("Registrar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel_1.setText("Su correo "+textFieldMail.getText()+" ha sido registrado");
			}
		});
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(177, 95, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("He leido la politica de privacidad");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnNewButton.setEnabled(true);
			}
		});
		chckbxNewCheckBox.setBounds(6, 125, 189, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		
		datePicker.addActionListener(new  ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date fecha= (Date) datePicker.getModel().getValue();
				lblNewLabel_1.setText("CAMBIO");
				
				
				
			}
		});
	}
}
