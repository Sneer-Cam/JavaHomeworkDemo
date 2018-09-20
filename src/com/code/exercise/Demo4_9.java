package com.code.exercise;

import java.util.Scanner;

public class Demo4_9
{

	public static void main(String[] args)
	{
		int z;
		float x,y;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a float number");
		x = input.nextFloat();
		z=(int)x;
		y=x-z;
		System.out.println("该浮点数的整数部分为："+z);
		System.out.println("该浮点数的小数部分为："+y);
	}

}
