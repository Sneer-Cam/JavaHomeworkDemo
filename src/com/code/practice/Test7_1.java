package com.code.practice;
class Cylinder05
{
	double radius;
	int height;
	double pi = 3.14;
	double area()
	{
		return pi*radius*radius;
	}
	double volume()
	{
		return area()*height;
	}
}
public class Test7_1
{

	public static void main(String[] args) 
	{
		Cylinder05 volu;
		volu = new Cylinder05();
		volu.radius = 2.8;
		volu.height = -5;
		System.out.println("底圆半径="+volu.radius);
		System.out.println("圆柱的高="+volu.height);
		System.out.print("圆柱");
		System.out.println("底面积="+volu.area());
		System.out.println("圆柱体体积="+volu.volume());
	}

}
