package com.code.practice;
class Cylinder07
{
	private double radius;
	private int height;
	private double pi = 3.14;
	private String color;
	public double setCylinder(double r,int h)
	{
		radius = r;
		height = h;
		return r+h;
	}
	public void setCylinder(String str)
	{
		color = str;
	}
	public void show()
	{
		System.out.println("Բ������ɫΪ:"+color);
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
public class Test7_3
{

	public static void main(String[] args)
	{
		double r_h;
		Cylinder07 volu = new Cylinder07();
		r_h = volu.setCylinder(2.5, 5);
		volu.setCylinder("��ɫ");
		System.out.println("Բ���װ뾶�͸�֮��="+r_h);
		System.out.println("Բ�������="+volu.volume());
		volu.show();
	}

}