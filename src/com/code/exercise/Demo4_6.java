package com.code.exercise;

public class Demo4_6
{

	public static void main(String[] args) 
	{
		int i,y1,y2,y3;
		for (i = 100; i < 1000; i++)
		{
			y1 = i/100;
			y2 = i/10%10;
			y3 = i%10;
			if (((y1*y1*y1)+(y2*y2*y2)+(y3*y3*y3))==i) 
			{
				System.out.println(i);
			}
		}
	}

}
