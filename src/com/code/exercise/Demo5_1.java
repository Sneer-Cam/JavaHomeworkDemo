package com.code.exercise;

import java.util.Scanner;

public class Demo5_1 
{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please input some numbers:");
		int n = input.nextInt();
		int sum = 0;
		int[] num = new int[n];
		double avg = 0;
		for (int i = 0; i < n; i++) {
			System.out.println("Please input the NO."+(i+1)+" number£º");
			num[i] = input.nextInt();
			sum += num[i];
		}
		avg = sum/n;
		for (int i = 0; i < n; i++) {
			if (num[i] > avg) {
				System.out.print(num[i]+" ");
			}
		}
	}

}
