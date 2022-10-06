package com.valtech.training.corejava.day1;

public class point3D extends point implements Comparable<point>
{
	private int z;
	public point3D() {}
	
	public point3D(int x,int y,int z) 
	{
		super(x,y);
		this.z=z;
	}
	@Override
	public double distance () 
	{
		return Math.sqrt(x*x+y*y+z*z);
	}
	
	public double distance(int x,int y,int z)
	{
		int dx = this.x-x;
		int dy = this.y-y;
		int dz = this.z-z;
		return Math.sqrt(dx*dx+dy*dy+dz*dz);
	}
	/**
	 * return -1 if the object is smaller
	 * 0 if it is equal
	 * 1 if it is greater
	 */
	public int compareTo(point3D o) {
		if(distance() < o.distance()) {
			return -1;
		}
		if(distance() == o.distance()) {
			if(x < o.x) {
			
			return -1;
		}
		if(x >o.x) return +1;
		return 0;
	
		}
		return +1;
		
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof point3D) {
		point3D p = (point3D) obj;
		return p.x == x && p.y == y && p.z == z ;
		}
		return false;
	}
	@Override
	public int hashCode() {
		
		return toString().hashCode();
	}
	@Override
	public String toString() {
		
		return new StringBuffer("X= ").append(x).append("Y = ").append(y).append("Z = ").append(z).toString();
	}
	public double distance(point3D p)
	{
		return distance(p.x,p.y,p.z);
	}

	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}
	public static void main(String[] args)
	{
		System.out.println(new point3D());
		point3D p = new point3D(10,20,30);
		System.out.println(p.distance());
	}
}


