package com.code.exercise;

import java.util.Scanner;

public class Demo5_8 
{

	public static void main(String[] args)
	{
		System.out.println("������һ���ַ�����");
		String str = new Scanner(System.in).nextLine();
		System.out.println("�������Ӵ���ʼλ�ã�");
		int str1 = new Scanner(System.in).nextInt();
		System.out.println("�������Ӵ��ĳ��ȣ�");
		int str2 = new Scanner(System.in).nextInt();
		System.out.println(str.substring(str1, str1+str2));
	}

}
