package com.code.practice;
class Cylinder13
{
	private static int num = 0;
	private static double pi = 3.14;
	private double radius;
	private int height;
	public Cylinder13(double r,int h)
	{
		radius = r;
		height = h;
		num++;
	}
	public static void count()
	{
		System.out.println("创建了"+num+"个对象：");
	}
	double area()
	{
		return pi*radius*radius;
	}
	double volume()
	{
		return area()*height;
	}
}
public class Test7_9 
{

	public static void main(String[] args)
	{
		Cylinder13.count();
		Cylinder13 volu1 = new Cylinder13(2.5, 3);
		volu1.count();
		System.out.println("圆柱1的体积="+volu1.volume());
		Cylinder13 volu2 = new Cylinder13(1.0, 2);
		Cylinder13.count();
		System.out.println("圆柱2的体积="+volu2.volume());
	}

}
