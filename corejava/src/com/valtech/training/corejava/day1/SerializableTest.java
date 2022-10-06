package com.valtech.training.corejava.day1;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import org.junit.Test;

public class SerializableTest {

	@Test
	public void test() throws Exception, IOException {
		ObjectOutputStream oos = new ObjectOutputStream (new FileOutputStream(new File("objects.txt")));
		point p = new point(2,3);
		point p1 = new point3D(1,2,3);
		oos.writeObject(p);
		oos.writeObject(p1);
		oos.flush();
		oos.close();
		ObjectInputStream ois = new ObjectInputStream (new FileInputStream(new File("objects.txt")));
		point r = (point)ois.readObject();
		point3D r1 = (point3D)ois.readObject();
		assertEquals(p,r);
		assertEquals(p1,r1);
		assertEquals(p.hashCode(),r.hashCode());
		assertFalse(p == r);
		
	}
}