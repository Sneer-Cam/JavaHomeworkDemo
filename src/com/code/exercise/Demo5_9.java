package com.code.exercise;

import java.util.Scanner;

public class Demo5_9 
{

	public static void main(String[] args) throws Exception 
	{
		String str,newStr = "";
		char sChar,cChar;
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("�������ַ�����");
		str = input.nextLine();
		System.out.println("��������ɾ���ַ���");
		sChar = (char)System.in.read();
		n = str.length();
		for (int i = 0; i < n; i++) {
			cChar = str.charAt(i);
			if (cChar != sChar) {
				newStr = newStr+cChar;
			}
		}
		System.out.println("���ַ����ǣ�"+newStr);
	}

}
