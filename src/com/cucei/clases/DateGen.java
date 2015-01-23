package com.cucei.clases;

import java.util.Random;

public class DateGen {
	
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
	
	public String genDate( ){
		int day 	= 0;
		int month 	= 0;
		int year 	= 0;
		int min		= -30000;
		int max		= 30000;
		String result = "";
		year = (int) new Random( ).nextInt( (max - min) +1 ) + 1;
		month = (int) new Random( ).nextInt( (12 - 1) ) + 1;
		day = (int) new Random( ).nextInt( (31 - 1) ) + 1;
		if( day > 28 && month == 2 ){
			
		}
		return result;
	}
}
