package com.teoria;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JToggleButton;
import javax.swing.JSlider;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ficha {

	private JFrame frame;
	private JTextField txtEmail;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ficha window = new Ficha();
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
	public Ficha() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.setBounds(100, 100, 885, 447);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setEnabled(true);
		tabbedPane.setVisible(false);
		tabbedPane.setBackground(Color.YELLOW);
		tabbedPane.setBounds(328, 215, 341, 182);
		frame.getContentPane().add(tabbedPane);
		
		JPanel Productos = new JPanel();
		tabbedPane.addTab("Productos", null, Productos, null);
		Productos.setLayout(null);
		
		JSlider slider = new JSlider();
		slider.setBounds(47, 101, 200, 26);
		Productos.add(slider);
		
		JPanel Clientes = new JPanel();
		tabbedPane.addTab("Clientes", null, Clientes, null);
		Clientes.setLayout(null);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(100, 11, 96, 20);
		Clientes.add(txtEmail);
		txtEmail.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("email");
		lblNewLabel_1.setBounds(44, 14, 46, 14);
		Clientes.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("contrase\u00F1a");
		lblNewLabel_1_1.setBounds(22, 40, 68, 14);
		Clientes.add(lblNewLabel_1_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(99, 37, 96, 20);
		Clientes.add(textField);
		
		JButton btnNewButton = new JButton("Acceder");
		btnNewButton.setBounds(128, 93, 89, 23);

Clientes.add(btnNewButton);
		
		JPanel Carrito = new JPanel();
		tabbedPane.addTab("Carrito", null, Carrito, null);
		Carrito.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Normal");
		rdbtnNewRadioButton_1.setBounds(56, 5, 109, 23);
		Carrito.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Urgente");
		rdbtnNewRadioButton.setBounds(56, 31, 109, 23);
		Carrito.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnPremium = new JRadioButton("Premium");
		rdbtnPremium.setBounds(56, 58, 109, 23);
		Carrito.add(rdbtnPremium);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.MAGENTA);
		panel.setBounds(10, 131, 308, 227);
		frame.getContentPane().add(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("TIENDA LOS FAROLES");
		lblNewLabel.setBackground(Color.LIGHT_GRAY);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblNewLabel, BorderLayout.NORTH);
		
		JList list = new JList();
		list.setValueIsAdjusting(true);
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Guadalajara", "Sig\u00FCenza", "Brihuega", "Saced\u00F3n", "Alcocer", "Pastrana"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setToolTipText("");
		panel.add(list, BorderLayout.CENTER);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Mostrar");
		tglbtnNewToggleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tabbedPane.setVisible(false);
				if(tglbtnNewToggleButton.isSelected()==true) {
					tabbedPane.setVisible(true);
				}
			}
		});
		panel.add(tglbtnNewToggleButton, BorderLayout.WEST);
	}
}
