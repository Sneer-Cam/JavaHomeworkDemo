package com.code.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3_4 
{

	public static void main(String[] args) throws IOException
	{
		float num;
		String str;
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("请输入一个实数：");
		str = buf.readLine();
		num = Float.parseFloat(str);
		System.out.println("您输入的数为："+num);

	}

}
