package com.code.practice;
class Cylinder10
{
	private double radius;
	private int height;
	private double pi = 3.14;
	String color;
	public Cylinder10()
	{
		this(2.5,5,"��ɫ");
		System.out.println("�޲ι��췽����������");
	}
	public Cylinder10(double r,int h,String str)
	{
		System.out.println("�вι��췽����������");
		radius = r;
		height = h;
		color = str;
	}
	public void show()
	{
		System.out.println("Բ���װ뾶Ϊ��"+radius);
		System.out.println("Բ����ĸ�Ϊ��"+height);
		System.out.println("Բ������ɫΪ��"+color);
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
public class Test7_6 
{

	public static void main(String[] args) 
	{
		Cylinder10 volu = new Cylinder10();
		System.out.println("Բ�������="+volu.area());
		System.out.println("Բ�������="+volu.volume());
		volu.show();
	}

}
