package com.valtech.training.corejava.day4;

import java.lang.reflect.Method;

import org.junit.Test;

import com.valtech.training.corejava.day1.point;

public class ReflectTest {
	@Test
	public void test() throws Exception, IllegalAccessException, NoSuchMethodException {
		point p = point.class.newInstance();
		System.out.println(p);
		Method m = point.class.getMethod("setX", int.class);
		m.invoke(p, 10);
		System.out.println(p);
	}

}
