package com.code.practice;
class Cylinder11
{
	private double radius;
	private int height;
	private double pi = 3.14;
	String color;
	public Cylinder11()
	{
		System.out.println("�޲ι��췽����������");
	}
	public Cylinder11(double r,int h,String str)
	{
		this();
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
public class Test7_7
{

	public static void main(String[] args) 
	{
		Cylinder11 volu = new Cylinder11(2.5,5,"��ɫ");
		System.out.println("Բ�������="+volu.area());
		System.out.println("Բ�������="+volu.volume());
		volu.show();
	}

}