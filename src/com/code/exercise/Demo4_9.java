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
		System.out.println("�ø���������������Ϊ��"+z);
		System.out.println("�ø�������С������Ϊ��"+y);
	}

}
