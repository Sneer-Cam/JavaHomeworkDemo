package com.code.exercise;

import java.util.Scanner;

public class Demo5_8 
{

	public static void main(String[] args)
	{
		System.out.println("请输入一个字符串：");
		String str = new Scanner(System.in).nextLine();
		System.out.println("请输入子串开始位置：");
		int str1 = new Scanner(System.in).nextInt();
		System.out.println("请输入子串的长度：");
		int str2 = new Scanner(System.in).nextInt();
		System.out.println(str.substring(str1, str1+str2));
	}

}
