package com.cucei.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import com.cucei.clases.Tools;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Encapsulamiento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	public int actionCombo;

	/**
	 * INNER CLASS BLOCK
	 */
	
	class MiFecha{
		
		private int dia;
		private int mes;
		private int anio;
		
		public int getDia() {
			return dia;
		}
		public void setDia(int dia) {
			this.dia = dia;
		}
		public int getMes() {
			return mes;
		}
		public void setMes(int mes) {
			this.mes = mes;
		}
		public int getAnio() {
			return anio;
		}
		public void setAnio(int anio) {
			this.anio = anio;
		}
//		private boolean verificaDia( int dia, int mes, int anio ){
//			
//		}
	}
	
	/*********************/
	
	/**
	 * Launch the application.
	 */
	public void execute(  ){
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				
				try {
					Encapsulamiento frame = new Encapsulamiento();
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
	public Encapsulamiento() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 353, 338);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblDateValidator = new JLabel("Date Validator");
		
		textField = new JTextField();
		textField.setColumns(10);
		final JComboBox comboBox = new JComboBox();
	
		JButton btnValidate = new JButton("Validate");
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tools tool = new Tools( );
				
				if( tool.inputValidator( textField.getText( ) ) ){
					
				} else{
					JOptionPane.showMessageDialog( null, "El valor debe ser entero" );
				}
			}
		});
		
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionCombo = comboBox.getSelectedIndex( );
				actionCombo++;
				JOptionPane.showMessageDialog(null, ""+actionCombo);
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Day", "Mes", "Anio"}));
		comboBox.setMaximumRowCount(3);
		
		JLabel lblInitialDate = new JLabel("Initial Date");
		
		JLabel labelDate = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(236, Short.MAX_VALUE)
					.addComponent(btnValidate)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(105)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDateValidator))
					.addContainerGap(133, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(41)
							.addComponent(lblInitialDate)
							.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
							.addComponent(labelDate, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addGap(92)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(20, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblDateValidator)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblInitialDate)
						.addComponent(labelDate))
					.addPreferredGap(ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
					.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(33)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(45)
					.addComponent(btnValidate)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
}
