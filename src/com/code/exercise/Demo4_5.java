package com.code.exercise;

import java.util.Scanner;

public class Demo4_5 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);		
		System.out.println("Please input a number:");
		int n,i,j,x=-1;
		float y,k,sum=0;
		n = input.nextInt();
		for (i = 1; i <= n; i++) {
			x = x*(-1);
			y = 1;
			for(j = 1; j <= i;j++){
				y = y*j;
				k = 1/y;
				sum = sum+x*k;
			}
		}
		System.out.println("sum="+sum);
	}

}
