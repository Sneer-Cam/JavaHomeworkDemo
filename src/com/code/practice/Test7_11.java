package com.code.practice;
class Cylinder15
{
	private static double pi = 3.14;
	private double radius;
	private int height;
	public Cylinder15(double r,int h)
	{
		radius = r;
		height = h;
	}	
	public void compare(Cylinder15 volu)
	{
		if (this == volu) {
			System.out.println("这两个对象相等");
		}else {
			System.out.println("这两个对象不相等");
		}
	}
}
public class Test7_11
{

	public static void main(String[] args)
	{
		Cylinder15 volu1 = new Cylinder15(1.0, 2);
		Cylinder15 volu2 = new Cylinder15(1.0, 2);
		Cylinder15 volu3 = volu1;
		volu1.compare(volu2);
		volu1.compare(volu3);
	}

}
