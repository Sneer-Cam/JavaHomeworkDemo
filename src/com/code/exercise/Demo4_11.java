package com.code.exercise;

public class Demo4_11 
{

	public static void main(String[] args)
	{
		int k=1,l=1,m=1,n=1;
		for (int i = 1; i <= 5; i++) {
			l=m;
			for (int j = 1; j <= 6-i; j++) {
				System.out.print(m+" ");
				n++;
				m=m+n;
			}
			m=l+k;
			k++;
			n=k;
			System.out.println();
		}
	}

}
