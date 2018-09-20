package com.code.exercise;

public class Demo5_6 
{

	public static void main(String[] args)
	{
		int[] a = new int[31];
		int i,j,k=1;
		for (i = 1; i <= 13; i++) {
			for (j = 1; j <= 13; j++,k++) {
				if (k > 30) {
					k = 1;
				}while (a[k] != 0) {
					if (++k > 30) {
						k = 1;
					}
				}
			}
			a[k-1] = 1;
		}
		for (i = 1; i <= 30; i++)
			System.out.print(" "+a[i]);
			System.out.println("\n  1:表示红球，0:表示绿球");
	}

}
