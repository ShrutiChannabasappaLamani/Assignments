package com.valtech.training.corejava.day1;

public class Outer {
	public void Outernew() {
		System.out.println("Print outer");
		
	}
	private static class Inner extends Outer {
		public void print() {
			System.out.println("Hello World");
		}
	}
	public static void main(String[] args) {
		Inner i = new Inner();
		i.print();
		i.Outernew();
	}
}

