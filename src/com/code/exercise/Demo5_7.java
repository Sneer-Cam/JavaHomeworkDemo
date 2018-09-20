package com.code.exercise;

import java.util.Scanner;

public class Demo5_7 
{
	public static String str[] = new String[2];
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please input any words:");
		for (int i = 0; i < str.length; i++) {
			str[i] = input.nextLine();
		}
		if (str[0].equals(str[1])) {
			System.out.println("相等");
		}else {
			System.out.println("不相等");
		}
	}

}
