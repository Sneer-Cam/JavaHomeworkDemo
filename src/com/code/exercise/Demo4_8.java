package com.code.exercise;

import java.util.Scanner;

public class Demo4_8 
{

	public static void main(String[] args)
	{
		int i,a,sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number");
		a = input.nextInt();
		for (i = 10; a > 0; i++) {
			sum+=a%10;
			a/=10;
		}
		System.out.println("sum="+sum);
	}

}
