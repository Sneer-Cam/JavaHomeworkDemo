package com.code.practice;
class Cylinder08
{
	private double radius;
	private int height;
	private double pi = 3.14;
	public Cylinder08(double r,int h)
	{
		radius = r;
		height = h;
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
public class Test7_4 
{

	public static void main(String[] args) 
	{
		Cylinder08 volu = new Cylinder08(3.5, 8);
		System.out.println("Բ�������="+volu.area());
		System.out.println("Բ�������="+volu.volume());
	}

}
