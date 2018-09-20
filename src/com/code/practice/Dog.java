package com.code.practice;

public class Dog 
{
	private static int count=0;
	public Dog()
	{
		count++;
	}
	public static void displayCount() 
	{
		System.out.println("当前狗的数量是："+count);

	}

}
