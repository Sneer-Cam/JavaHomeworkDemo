package com.code.exercise;

import java.util.Scanner;

public class Demo4_4 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int i,n,t=1,sum=0;
		System.out.println("Please input a number:");
		n = input.nextInt();
		for (i = 1; i <= n; i++) 
		{
			t = t*i;
			sum = sum+t;
		}
		System.out.println("sum="+sum);
	}

}
