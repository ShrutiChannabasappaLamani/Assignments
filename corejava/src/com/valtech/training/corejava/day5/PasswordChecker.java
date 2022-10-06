package com.valtech.training.corejava.day5;

import java.util.Comparator;
import java.util.Random;

public class PasswordChecker  {
	 public static boolean charLowerCase(String password) {	 
		  for(int i=0;  i < password.length(); i++)
	         {
	            char ch = password.charAt(i);
	            if(Character.isLowerCase(ch))
	               
	          return true;
              }
		  return false;
	 }
	
	 public static boolean charUpperCase(String password) {
	   	  
		 for(int i=0;  i < password.length(); i++)
        {
           char ch = password.charAt(i);
           if(Character.isUpperCase(ch))
              return true;
          }
	  
		  return false;
	   } 
	 	 
	 public static int checkNumber(String password) {
		 
		 int countDigit = 0; int Number1st = 0;
		 for(int i=0;  i < password.length(); i++)
        {
			
			
			char ch = password.charAt(i);
           if(Character.isDigit(ch)) {
	               countDigit++;
           }
           
        }		 		 
     if(countDigit > 0) {
	    	  
	    	  Number1st = 5;
	      }     
	      int totalNumber= (countDigit-1) + Number1st;
           
		 return totalNumber;
	 }	 
	 public static int checkSpecial(String password) {
		
		int countSpecial = 0; int SpecialCount = 0;;
		 
		 for (int i = 0; i < password.length(); i++) {
					int asciiVal = (int) password.charAt(i);
					 if ((asciiVal >= 32 && asciiVal <= 47) || (asciiVal >= 58 && asciiVal <= 64)
						|| (asciiVal >= 91 && asciiVal <= 96) || (asciiVal >= 123 && asciiVal <= 126)) {
						countSpecial++;
						}				
					}
		 if(countSpecial>0) {
	    	  SpecialCount = 5;
	      }
	      
	      SpecialCount+=(countSpecial-1)*2;
		 
		 return SpecialCount;       
		 }
}