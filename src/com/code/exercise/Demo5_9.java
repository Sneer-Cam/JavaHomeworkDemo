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
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		str = input.nextLine();
		System.out.println("ÇëÊäÈëÓûÉ¾³ı×Ö·û£º");
		sChar = (char)System.in.read();
		n = str.length();
		for (int i = 0; i < n; i++) {
			cChar = str.charAt(i);
			if (cChar != sChar) {
				newStr = newStr+cChar;
			}
		}
		System.out.println("ĞÂ×Ö·û´®ÊÇ£º"+newStr);
	}

}
