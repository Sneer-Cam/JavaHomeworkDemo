package com.code.practice;
class Cylinder01
{
	double radius;
	int height;
	double pi=3.14;
	void area()
	{
		System.out.println("�����="+pi*radius*radius);
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
		System.out.println("��Բ�뾶="+volu.radius);
		System.out.println("Բ���ĸ�="+volu.height);
		System.out.print("Բ��");
		volu.area();
		System.out.println("Բ�������="+volu.volume());
	}

}
