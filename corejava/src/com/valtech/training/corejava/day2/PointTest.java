package com.valtech.training.corejava.day2;

import static org.junit.Assert.*;

import org.junit.Test;

import com.valtech.training.corejava.day1.point;

public class PointTest {
	@Test
	public void testEquals() {
	point p = new point(2,3);
	point p1 = new point(2,3);
	point p2=p;
	assertTrue(p == p2);
	assertFalse(p == p1);
	assertTrue(p.equals(p1));
	assertEquals(p.hashCode(), p1.hashCode());
	
	}
	
	@Test
	public void testDistance() {
		point p = new point();
		assertEquals(0.0, p.distance(),0.00000001);
		p = new point(10,20);
		assertEquals(Math.sqrt(10*10+20*20),p.distance(),0.00000001);
	}
	
	@Test
	public void testSetGet() {
		
	point p = new point();
	p.setX(10);
	assertEquals(10, p.getX());
	p.setY(20);
	assertEquals(20, p.getY());
	}
	
	@Test
	public void test() {
		
		point p=new point();
        assertEquals(0, p.getX());
        assertEquals(0, p.getY());
        point p1=new point(2,3);
        assertEquals(2, p1.getX());
        assertEquals(3, p1.getY());
	}
}

