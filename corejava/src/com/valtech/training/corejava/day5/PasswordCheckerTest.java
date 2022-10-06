package com.valtech.training.corejava.day5;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class PasswordCheckerTest {


	@Test
	public void test() {
	PasswordChecker p = new PasswordChecker();
	String password="Shruti@!2000";
	assertEquals(true,p.charLowerCase(password));
	assertEquals(true,p.charUpperCase(password));
	assertEquals(8,p.checkNumber(password));
    assertEquals(7,p.checkSpecial(password));	
	}	
}
