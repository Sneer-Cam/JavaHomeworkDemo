package com.code.exercise;

import java.util.Scanner;

public class Demo6_14 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int i,j;
		int m,n;
		System.out.print("��������M=");
		m = input.nextInt();
		System.out.print("��������N=");
		n = input.nextInt();
		int[][] a = new int[m][n];
		int[] col = new int[n];
		System.out.println("�����롾"+m+"*"+n+"�����������");
		for (i = 0; i < m; i++) {
			for (j = 0; j < n; j++) {
				a[i][j] = input.nextInt();
			}
		}
		SumNum sumnum = new SumNum();
		col = sumnum.colnum(a);
		for (i = 0; i < col.length; i++) {
			System.out.println("��"+(i+1)+"�����ĺ�="+col[i]);
		}
	}

}
class SumNum{
	int[] colnum(int[][] array){
		int[] temp = new int[array[0].length];
		for (int j = 0; j < array[0].length; j++) {
			for (int i = 0; i < array.length; i++) {
				temp[j] += array[i][j];
			}
		}
		return temp;
	}
}