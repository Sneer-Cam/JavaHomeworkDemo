package com.code.practice;
class Cylinder10
{
	private double radius;
	private int height;
	private double pi = 3.14;
	String color;
	public Cylinder10()
	{
		this(2.5,5,"红色");
		System.out.println("无参构造方法被调用了");
	}
	public Cylinder10(double r,int h,String str)
	{
		System.out.println("有参构造方法被调用了");
		radius = r;
		height = h;
		color = str;
	}
	public void show()
	{
		System.out.println("圆柱底半径为："+radius);
		System.out.println("圆柱体的高为："+height);
		System.out.println("圆柱的颜色为："+color);
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
		System.out.println("圆柱底面积="+volu.area());
		System.out.println("圆柱体体积="+volu.volume());
		volu.show();
	}

}
