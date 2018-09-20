package com.code.practice;

import java.util.Scanner;

public class Test4_8 
{

	public static void main(String[] args) 
	{
		int n,i=1,sum=0;
		Scanner buf = new Scanner(System.in);
		do{
			System.out.print("输入正整数：");
			n = buf.nextInt();
		}while(n<=0);
		while(i<=n)
			sum+=i++;
		System.out.println("1+2+...+"+n+"="+sum);
	}

}
