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
import com.cucei.clases.DateGen;
import com.cucei.clases.Tools;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class Encapsulamiento extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	public int actionCombo;
	public DateGen dateG;
	public JLabel labelDate;

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
		
		public boolean fijaDia( int dia ){
			if( dia >= 1 && dia <= 31 ){
				return true;
			} else{
				return false;
			}
		}
		
		public boolean fijaMes( int mes ){
			if( mes >= 1 && mes <= 12 ){
				return true;
			} else{
				return false;
			}
		}
		
		public boolean fijaAnio( int year ){
			if( year >= Integer.MIN_VALUE && year <= Integer.MAX_VALUE ){
				return true;
			} else{
				return false;
			}
		}
		
		private boolean verificaFecha( int dia, int mes, int anio ){
			boolean flag = false;
			if( (anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0)) ){
				switch( mes ){
				case 1:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Enero en este año");
					break;
				case 2:
					if( dia > 29){
						JOptionPane.showMessageDialog(null, "Fecha Equivocada Febrero solo tiene 29 dias en anio bisiesto");
					} else{
						flag = true;
						JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Febrero");
					}
					break;
				case 3:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Marzo en este año");
					break;
				case 4:
					if( dia > 30){
						JOptionPane.showMessageDialog(null, "Fecha Equivocada Abril solo tiene 30");
					} else{
						flag = true;
						JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Abril");
					}
					break;
				case 5:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Mayo en este año");
					break;
				case 6:
					if( dia > 30){
						JOptionPane.showMessageDialog(null, "Fecha Equivocada Junio solo tiene 30");
					} else{
						flag = true;
						JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Junio en este año");
					}
					break;
				case 7:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Julio en este año");
					break;
				case 8:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Agosto en este año");
					break;
				case 9:
					if( dia > 30){
						JOptionPane.showMessageDialog(null, "Fecha Equivocada Septiembre solo tiene 30");
					} else{
						flag = true;
						JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Septiembre en este año");
					}
					break;
				case 10:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Octubre en este año");
					break;
				case 11:
					if( dia > 30){
						JOptionPane.showMessageDialog(null, "Fecha Equivocada Noviembre solo tiene 30");
					} else{
						flag = true;
						JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Noviembre en este año");
					}
					break;
				case 12:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Diciembre en este año");
					break;
				}
			} else{
				switch( mes ){
				case 1:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Enero en este año");
					break;
				case 2:
					if( dia > 28){
						JOptionPane.showMessageDialog(null, "Fecha Equivocada Febrero solo tiene 29 dias en anio bisiesto");
					} else{
						flag = true;
						JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Febrero");
					}
					break;
				case 3:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Marzo en este año");
					break;
				case 4:
					if( dia > 30){
						JOptionPane.showMessageDialog(null, "Fecha Equivocada Abril solo tiene 30");
					} else{
						flag = true;
						JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Abril");
					}
					break;
				case 5:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Mayo en este año");
					break;
				case 6:
					if( dia > 30){
						JOptionPane.showMessageDialog(null, "Fecha Equivocada Junio solo tiene 30");
					} else{
						flag = true;
						JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Junio en este año");
					}
					break;
				case 7:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Julio en este año");
					
					break;
				case 8:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Agosto en este año");
					
					break;
				case 9:
					if( dia > 30){
						JOptionPane.showMessageDialog(null, "Fecha Equivocada Septiembre solo tiene 30");
					} else{
						flag = true;
						JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Septiembre en este año");
					}
					break;
				case 10:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Octubre en este año");
					break;
				case 11:
					if( dia > 30){
						JOptionPane.showMessageDialog(null, "Fecha Equivocada Noviembre solo tiene 30");
					} else{
						flag = true;
						JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Noviembre en este año");
					}
					break;
				case 12:
					flag = true;
					JOptionPane.showMessageDialog(null, "Fecha Correcta para el mes de Diciembre en este año");
					break;
				}
			}
			
			return flag;
		}
	}
	
	/*********************/
	
	/**
	 * Launch the application.
	 */
	
	public MiFecha miFecha(){
		return new MiFecha();
	}
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Encapsulamiento frame = new Encapsulamiento();
					frame.setVisible(true);
					DateGen dg = new DateGen( );
					String date = dg.dateGenerator( );
					Encapsulamiento.MiFecha fecha =  frame.miFecha( );
					fecha.setAnio( Integer.parseInt( date.split("/")[2] ) );
					fecha.setMes( Integer.parseInt( date.split("/")[1] ) );
					fecha.setDia( Integer.parseInt( date.split("/")[0] ) );
					frame.labelDate.setText( date );
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
		JLabel lblInitialDate = new JLabel("Initial Date");
		lblInitialDate.setFont(new Font("Dialog", Font.BOLD, 14));
		labelDate = new JLabel("");
		labelDate.setFont(new Font("Dialog", Font.BOLD, 14));
		
		textField = new JTextField();
		textField.setColumns(10);
		final JComboBox comboBox = new JComboBox();
		this.actionCombo = 1;
	
		JButton btnValidate = new JButton("Validate");
		btnValidate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Tools tool = new Tools( );
				int dateField = 0, dia, mes, anio;
				String dateTest = labelDate.getText( );
				if( tool.inputValidator( textField.getText( ) ) ){
					Encapsulamiento.MiFecha fecha =  new Encapsulamiento().miFecha( );
					switch(actionCombo){
					case 1:
						dateField = Integer.parseInt( textField.getText( ) );
						if(fecha.fijaDia(dateField)){
							mes = Integer.parseInt( dateTest.split("/")[1] );
							anio = Integer.parseInt( dateTest.split("/")[2] );
							if(fecha.verificaFecha( dateField, mes, anio ))
							{
								labelDate.setText( dateField+"/"+mes+"/"+anio );
							}
						} else{
							JOptionPane.showMessageDialog(null, "Valo invalido para el dia");
						}
						break;
					case 2:
						dateField = Integer.parseInt( textField.getText() );
						if(fecha.fijaMes(dateField)){
							dia = Integer.parseInt( dateTest.split("/")[0] );
							anio = Integer.parseInt( dateTest.split("/")[2] );
							if(fecha.verificaFecha( dia, dateField, anio )){
								labelDate.setText( dia+"/"+dateField+"/"+anio );
							}
						} else{
							JOptionPane.showMessageDialog(null, "Valor invalido para el mes: ");
						}
						break;
					case 3:
						dateField = Integer.parseInt( textField.getText( ) );
						if(fecha.fijaAnio(dateField)){
							dia = Integer.parseInt( dateTest.split("/")[0] );
							mes = Integer.parseInt( dateTest.split("/")[1] );
							if(fecha.verificaFecha( dia, mes, dateField )){
								labelDate.setText( dia+"/"+mes+"/"+dateField );
							}
						} else{
							JOptionPane.showMessageDialog(null, "Valor invalido para el anio: ");
						}
						break;
					default:
						break;
					}
				} else{
				}
			}
		});
		
		
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				actionCombo = comboBox.getSelectedIndex( );
				actionCombo++;
			}
		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Day", "Month", "Year"}));
		comboBox.setMaximumRowCount(3);
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
