package com.valtech.training.corejava.day5;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DateTest {
//	DateFormat df = new SimpleDateFormat("dd-MM-YYYY HH:mm:SS");
	
//	@Test
//	public void testDate() {
//		
//	Date date = new Date();
//	System.out.println(date);
//	/*
//	 * HH -  Hour 
//	 * mm - Minute
//	 * SS - MilliSeconds
//	 * YY / YYYY - Year
//	 * MM / MMM - Month
//	 * dd - Day
//	 */
//	//DateFormat df = new SimpleDateFormat("dd-MM-YYYY HH:mm:SS");
//	System.out.println(df.format(date));
//		
//	}
//	
//	@Test
//	public void testDateOldWay() {
//	    Date date = new Date(47,7,15);
//	    System.out.println(date);
//	    System.out.println(df.format(date));
//	}
//	
//	
//	@Test
//	public void testDateWithCal() {
//		Calendar cal = Calendar.getInstance();
//		cal.set(Calendar.YEAR,1947);
//		cal.set(Calendar.MONTH, 8);
//		cal.set(Calendar.DATE,15);
//		Date date = cal.getTime();
//		System.out.println(date);
//		System.out.println(df.format(date));
//	}
//	
	
	@Test
	public void testDateFromString() throws Exception {
		DateFormat df = new SimpleDateFormat("dd-mm-yyyy");
		Date date = df.parse("15-08-1947");
		System.out.println(date);
		
	}
}
