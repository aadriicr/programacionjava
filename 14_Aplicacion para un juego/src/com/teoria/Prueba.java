package com.teoria;

import java.awt.EventQueue;

import javax.swing.JFrame;

import java.awt.Button;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.AbstractListModel;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JToggleButton;
import javax.swing.JTextPane;
import javax.swing.JSlider;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class Prueba {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prueba window = new Prueba();
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
	public Prueba() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.GRAY);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		panel.setBounds(56, 50, 250, 144);
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		
		JButton btnNewButton = new JButton("New button");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		panel.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Getafe", "Alcocer", "Miravete", "Chillon"}));
		panel.add(comboBox);
		
		JSplitPane splitPane = new JSplitPane();
		splitPane.setBounds(100, 233, 179, 25);
		frame.getContentPane().add(splitPane);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel_1.setBounds(372, 50, 389, 223);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JToggleButton tglbtnNewToggleButton = new JToggleButton("Inscribeme");
		tglbtnNewToggleButton.setEnabled(false);
		tglbtnNewToggleButton.setSelected(true);
		tglbtnNewToggleButton.setBounds(234, 22, 121, 23);
		panel_1.add(tglbtnNewToggleButton);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto la politica de privacidad");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(chckbxNewCheckBox.isSelected()) {
					tglbtnNewToggleButton.setEnabled(true);
				}
				else {
					tglbtnNewToggleButton.setEnabled(false);
				}
			}
		});
		chckbxNewCheckBox.setBounds(6, 54, 180, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Deseo recibir informacion comercial");
		chckbxNewCheckBox_1.setBounds(6, 82, 193, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JLabel lblNewLabel = new JLabel("\u00BFQu\u00E9 cursar?");
		lblNewLabel.setBounds(10, 116, 63, 14);
		panel_1.add(lblNewLabel);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(216, 355, 104, 58);
		frame.getContentPane().add(textPane);
		
		ButtonGroup grupo= new ButtonGroup();
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("DAM");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton.isSelected()) {
					textPane.setText("Tu horario es de 9am-3pm");
				}
				
			}
		});
		rdbtnNewRadioButton.setBounds(10, 137, 55, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("DAW");
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_1.isSelected()) {
					textPane.setText("Tu horario es de 8am-2pm");
				}
			}
		});
		rdbtnNewRadioButton_1.setBounds(10, 163, 55, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("ASIR");
		rdbtnNewRadioButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rdbtnNewRadioButton_2.isSelected()) {
					textPane.setText("Tu horario es de 10am-4pm");
				}
			}
		});
		rdbtnNewRadioButton_2.setBounds(10, 189, 55, 23);
		panel_1.add(rdbtnNewRadioButton_2);
		grupo.add(rdbtnNewRadioButton_2);
		
		grupo.add(rdbtnNewRadioButton);
		grupo.add(rdbtnNewRadioButton_1);
		grupo.add(rdbtnNewRadioButton_2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(244, 56, 111, 92);
		panel_1.add(scrollPane);
		
		JList list = new JList();
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				switch(list.getSelectedValue().toString()) {
				case "Java", "Python","C#":
					JOptionPane.showMessageDialog(null, "Existe certificacion opcional");
				break;
				default:
					break;
			}
				
			}
		});
		scrollPane.setViewportView(list);
		
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"Java", "Python", "TypeScript", "JavaScript", "VisualBasic.net", "Php", "C#"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		
		
		
		
		
		JLabel lblNewLabel_1 = new JLabel("Observaciones");
		lblNewLabel_1.setBounds(208, 330, 71, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(779, 32, 256, 256);
		frame.getContentPane().add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\Campus FP\\Downloads\\bmw.png"));
		
		JSlider slider = new JSlider();
		slider.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				lblNewLabel_2.setBounds(779, 32, slider.getValue()*3, slider.getValue()*3);
			
			}
		});
		
		slider.setBounds(835, 315, 200, 26);
		frame.getContentPane().add(slider);
		
		
	
	
		

		

		
	

		frame.setBounds(100, 100, 1061, 463);
		
		
		
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
