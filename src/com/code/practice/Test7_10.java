package com.code.practice;
class Cylinder14
{
	private static double pi = 3.14;
	private double radius;
	private int height;
	public Cylinder14(double r,int h)
	{
		radius = r;
		height = h;
	}
	public void setCylinder14(double r,int h)
	{
		radius = r;
		height = h;
	}
	double volume()
	{
		return pi*radius*radius*height;
	}
}

public class Test7_10
{

	public static void main(String[] args) 
	{
		Cylinder14 volu1,volu2;
		volu1 = new Cylinder14(2.5, 5);
		System.out.println("圆柱1体积="+volu1.volume());
		volu2 = volu1;
		volu2.setCylinder14(1.0, 2);
		System.out.println("圆柱2体积="+volu2.volume());
	}

}