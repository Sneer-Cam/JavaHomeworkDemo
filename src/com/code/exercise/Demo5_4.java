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
		System.out.print("����һ���������еľ���");
		System.out.println();
		for (i = 0; i < 4; i++) {
			for (j = 0; j < 5; j++){
				System.out.println("�������"+(i+j+1)+"�������Ԫ�أ�");
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
		System.out.print("��С���ǣ�"+min);
		System.out.println(",�ڡ�"+(row1+1)+"���С�"+(col1+1)+"����");
		System.out.print("������ǣ�"+max);
		System.out.println(",�ڡ�"+(row2+1)+"���С�"+(col2+1)+"����");
	}

}
