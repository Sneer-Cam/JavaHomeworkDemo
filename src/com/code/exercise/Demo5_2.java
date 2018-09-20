package com.code.exercise;

import java.util.Scanner;

public class Demo5_2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please input some numbers:");
		int n = input.nextInt();
		int max = Integer.MIN_VALUE,min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			System.out.println("Please input the NO."+(i+1)+" number：");
			int temp = input.nextInt();
			if (temp > max) {
				max = temp;
			}
			if (temp < min) {
				min = temp;
			}
		}
		System.out.println("最大值为："+max+"\n"+"最小值为："+min);
	}

}
