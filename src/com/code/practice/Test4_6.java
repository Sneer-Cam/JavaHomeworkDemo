package com.code.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test4_6 
{

	public static void main(String[] args) throws IOException
	{
		int a=0,b=1,n,num;
		String str;
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("������һ����������");
		str = buf.readLine();
		num = Integer.parseInt(str);
		while (b<num) {
			n=a+b;
			a=b;
			b=n;
		}
		if (num==b)System.out.println(num+"��Fibonacci��"); 
		else System.out.println(num+"����Fibonacci��");
			
		
	}

}