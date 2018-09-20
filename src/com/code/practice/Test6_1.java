package com.code.practice;
class Cylinder01
{
	double radius;
	int height;
	double pi=3.14;
	void area()
	{
		System.out.println("底面积="+pi*radius*radius);
	}
	double volume()
	{
		return (pi*radius*radius)*height;
	}
}
public class Test6_1
{

	public static void main(String[] args) 
	{
		Cylinder01 volu;
		volu = new Cylinder01();
		volu.radius = 2.8;
		volu.height = 5;
		System.out.println("底圆半径="+volu.radius);
		System.out.println("圆柱的高="+volu.height);
		System.out.print("圆柱");
		volu.area();
		System.out.println("圆柱体体积="+volu.volume());
	}

}
