package com.cucei.clases;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Random;

public class DateGen {
	public Calendar date;
	
	public boolean mod4( int year ){
		if( (year % 4 == 0) ){
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean mod100( int year ){
		if( year % 100 == 0 ){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean mod400( int year ){
		if( year % 400 == 0 ){
			return true;
		}else{
			return false;
		}
	}
	
	public String dateGenerator( ){
		int negativeYear = -2000;
		int maxYear = 2000;
//		int negativeYear = Integer.MIN_VALUE;
//		int maxYear = Integer.MAX_VALUE;
		Random random = new Random( );
		SimpleDateFormat simpleDF;
		date = Calendar.getInstance( );
		date.set( random.nextInt( (maxYear - negativeYear)+1 ), random.nextInt( (12 - 1) ) + 1, random.nextInt( (31 - 1) ) + 1 );
		simpleDF = new SimpleDateFormat( "dd/MM/yyyy" );
		
		return simpleDF.format( date.getTime( ) );
	}
	
}
