package com.valtech.training.corejava.day4;

import com.valtech.training.corejava.day1.point;

public class Arithmetic<E extends Number> {
//	public int add(int a,int b)
	
	public<F> void print(F obj) {
		System.out.println("Recd ... Classc"+obj.getClass().getName()+" "+obj);
	}
	
	public double add(E a,E b) {
		return a.doubleValue()+b.doubleValue();
	}
	public static void main(String[] args) {
		Arithmetic<Integer> a = new Arithmetic<>();
		System.out.println(a.add(2, 3));
		System.out.println(new Arithmetic<Double>().add(2.3, 4.6));
		a.print("HEllo");
		a.print(5);
		//System.out.println(new Arithmetic<point>().add(new point(2,3),new point(3,5)));
	}

}
