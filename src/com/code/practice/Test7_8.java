package com.code.practice;
class Cylinder12
{
	private static int num = 0;
	private static double pi = 3.14;
	private double radius;
	private int height;
	public Cylinder12(double r,int h)
	{
		radius = r;
		height = h;
		num++;
	}
	public void count()
	{
		System.out.print("������"+num+"������");
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
public class Test7_8 
{

	public static void main(String[] args) 
	{
		Cylinder12 volu1 = new Cylinder12(2.5, 5);
		volu1.count();
		System.out.println("Բ��1�����="+volu1.volume());
		Cylinder12 volu2 = new Cylinder12(1.0, 2);
		volu2.count();
		System.out.println("Բ��2�����="+volu2.volume());
	}

}
