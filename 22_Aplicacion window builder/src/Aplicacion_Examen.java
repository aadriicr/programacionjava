import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JList;
import java.awt.List;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Aplicacion_Examen {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Aplicacion_Examen window = new Aplicacion_Examen();
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
	public Aplicacion_Examen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.ORANGE);
		frame.setBounds(100, 100, 710, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(263, 117, 111, 92);
		frame.getContentPane().add(scrollPane);
		
		JList list = new JList();
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"camisa", "pantalon", "chaqueta", "sombrero"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setToolTipText("");
		scrollPane.setViewportView(list);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"urgente", "normal", "recogida en tienda"}));
		comboBox.setBounds(142, 141, 115, 23);
		frame.getContentPane().add(comboBox);
		
		JSpinner spinner = new JSpinner();
		spinner.setBounds(219, 116, 38, 20);
		frame.getContentPane().add(spinner);
		
		JLabel lblNewLabel = new JLabel("Introduce tu correo electronico");
		lblNewLabel.setBounds(31, 22, 156, 23);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(41, 42, 138, 23);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(210, 235, 130, 83);
		frame.getContentPane().add(textPane);
		
		
		JButton btnNewButton = new JButton("Comprar");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = (String) list.getSelectedValue();
				textPane.setText("El producto que has comprado es: "+texto);
			}
		});
		btnNewButton.setEnabled(false);
		btnNewButton.setBounds(142, 201, 89, 23);
		frame.getContentPane().add(btnNewButton);
		JCheckBox chckbxNewCheckBox = new JCheckBox("Acepto la pol\u00EDtica de privacidad");
		chckbxNewCheckBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					if(chckbxNewCheckBox.isSelected()) {
						btnNewButton.setEnabled(true);
					}
					else {
						btnNewButton.setEnabled(false);
					}
				}
			
			
		});
		chckbxNewCheckBox.setBounds(84, 171, 173, 23);
		frame.getContentPane().add(chckbxNewCheckBox);
		float precio=0;
		
		JButton btnNewButton_1 = new JButton("Calcular");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
float precio = 0f;
				
				if (list.getSelectedValue().equals("camisa")){
					precio = 7.95f;
				} else if (list.getSelectedValue().equals("pantalon")) {
					precio = 15.95f;
				} else if (list.getSelectedValue().equals("chaqueta")) {
					precio = 25.50f;
				} else {
					precio = 9.99f;
				}
			}
		});
		btnNewButton_1.setBounds(229, 328, 111, 46);
		frame.getContentPane().add(btnNewButton_1);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(468, 272, 156, 102);
		frame.getContentPane().add(textPane_1);
		
		JButton btnNewButton_2 = new JButton("Finalizar Compra");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
					
				int urgencia;
				String texto2= (String) comboBox.getSelectedItem();
				if (texto2.equals("urgente")){
					urgencia = (int) 9.99f;
				} else {
					urgencia = 0;
				}
				int compra = (int) ((int) precio-(precio*0.21)+urgencia);
				textPane_1.setText("El precio total es: "+compra);
			}
		});
		btnNewButton_2.setBounds(459, 201, 165, 60);
		frame.getContentPane().add(btnNewButton_2);
		
		
		
		
	}
}
