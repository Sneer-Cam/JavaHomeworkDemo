package com.code.practice;

public class Test5_3_2 
{

	public static void main(String[] args)
	{
		final int N = 13,S = 3,M = 5;
		int[] p = new int[N];
		int[] q = new int[N];
		int i,j,k,n=0;
		k = S-2;
		for (i = 1; i <= N; i++) {
			for (j = 1; j <= M; j++) {
				if (k == N-1)
					k = 0;
				else
					k++;
				if (p[k] == 1)
					j--;
			}
			p[k] = 1;
			q[n++] = k+1;
		}
		System.out.println("����˳��Ϊ��");
		for (i = 0; i < N; i++) 
			System.out.print(q[i]+"   ");
	}

}
