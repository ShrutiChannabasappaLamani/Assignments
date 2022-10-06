package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import org.junit.Test;

public class CustomerTest {
	int Diamond=4;
	int Platinum =3;
	int gold=2;
	int silver=1;
	@Test
	public void test() throws Exception {
		
		Set<Customer> cust= new TreeSet<Customer>();
		
		Customer ctmr1= new Customer("Shruti",Diamond,"2001-09-22",23000);
		Customer ctmr2= new Customer("divya",Platinum,"2001-09-13",23000);
  	    Customer ctmr3= new Customer("kavya",Diamond,"2001-08-22",5400);
        Customer ctmr4= new Customer("deepa",Platinum,"2001-09-10",54000);
        Customer ctmr5= new Customer("netu",gold,"2001-10-22",5400);
        Customer ctmr6= new Customer("meghana",silver,"2001-10-22",5400);
        
   
		
		cust.add(ctmr1);
		cust.add(ctmr2);
  	    cust.add(ctmr3);
  	    cust.add(ctmr4);
  	    cust.add(ctmr5);
  	    cust.add(ctmr6);
  	    
  	 
		 System.out.println(cust.size());
		for(Customer c : cust) {
			System.out.println(c.name+" "+convert_to_string(c.type)+" "+c.date+" "+c.moneyspent);
		}
		
	}
	
	public String convert_to_string (int t) {
		switch (t) {
		case 1:
			  return "Silver";
		
		case 2:
			  return "Gold";
		
		case 3:
			  return "Paltinum";
			
		case 4:
			  return "Diamond";
			

		default:
			return "0";
		
		}
	}

}