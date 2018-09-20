package com.code.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo5_4 
{

	public static void main(String[] args)throws IOException
	{
		int[][] nums = new int[4][5];
		int i=0,j=0,min,max,row1=0,row2=0,col1=0,col2=0;
		System.out.print("输入一个四行五列的矩阵：");
		System.out.println();
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++){
				System.out.println("请输入第"+(i+j+1)+"个矩阵的元素：");
			    BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
			    nums[i][j] = Integer.parseInt(input.readLine());
			}
		}
		min = Integer.MAX_VALUE;
		max = Integer.MIN_VALUE;
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++) {
				if (nums[i][j]<min) {
					min = nums[i][j];
					row1 = i;
					col1 = j;
				}
				if (nums[i][j]>max) {
					max = nums[i][j];
					row2 = i;
					col2 = j;
				}
			}
		}
		System.out.print("最小数是："+min);
		System.out.println(",在【"+(row1+1)+"】行【"+(col1+1)+"】列");
		System.out.print("最大数是："+max);
		System.out.println(",在【"+(row2+1)+"】行【"+(col2+1)+"】列");
	}

}
