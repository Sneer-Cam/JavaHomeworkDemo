package com.code.practice;
class Cylinder06
{
	private double radius;
	private int height;
	private double pi = 3.14;
	public void setCylinder(double r,int h)
	{
		if (r>0 && h>0) {
			radius = r;
			height = h;
		}else {
			System.out.println("���������д��󣡣�");
		}
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
public class Test7_2
{

	public static void main(String[] args) 
	{
		Cylinder06 volu = new Cylinder06();
		volu.setCylinder(2.5, -5);
		System.out.println("Բ�������="+volu.area());
		System.out.println("Բ�������="+volu.volume());
	}

}
