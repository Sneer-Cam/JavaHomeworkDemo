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
		System.out.println("��Բ�뾶="+volu.radius);
		System.out.println("Բ���ĸ�="+volu.height);
		System.out.print("Բ��");
		System.out.println("�����="+volu.area());
		System.out.println("Բ�������="+volu.volume());
	}

}
