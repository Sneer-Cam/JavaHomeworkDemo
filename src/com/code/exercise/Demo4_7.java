package com.code.exercise;

import java.util.Scanner;

public class Demo4_7 
{

	public static void main(String[] args) 
	{
		int i,x,y=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a number:");
		x = input.nextInt();
		for (i = 1; i <= x/2; i++) {
			if (x%i==0) {
				y+=i;
			}
		}
		if (y==x) {
			System.out.println(x+"是完全数");
		}else {
			System.out.println(x+"不是完全数");
		}
	}

}
