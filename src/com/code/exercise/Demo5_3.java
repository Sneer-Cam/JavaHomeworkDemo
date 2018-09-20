package com.code.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo5_3 
{

	public static void main(String[] args)throws IOException
	{
		int array[][] = new int[3][3];
		int sum;
		System.out.println("请依次输入3*3矩阵的元素：");
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println("请输入第"+(i+j+1)+"个矩阵的元素：");
				BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
				array[i][j] = Integer.parseInt(input.readLine());
			}
		}
		sum = array[0][0]+array[1][1]+array[2][2];
		System.out.println("这个矩阵的对角线元素之和为："+sum);
	}

}
