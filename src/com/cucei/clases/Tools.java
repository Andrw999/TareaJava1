package com.cucei.clases;

import javax.swing.JOptionPane;

public class Tools {
	public boolean inputValidator( String val ){
		boolean flag = false;
		try{
			if( (Integer.parseInt( val ) >= 0) || ( Integer.parseInt(val) <= 0) ){
				flag = true;
			}
			else{
				flag = false;
			}
		} catch( NumberFormatException fe ){
			JOptionPane.showMessageDialog(null, fe.toString( ));
		}
		
		return flag;
	}
}
