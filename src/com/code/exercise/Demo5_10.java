package com.code.exercise;

import java.util.Scanner;

public class Demo5_10 
{

	public static void main(String[] args)
	{
		String s;
		char c = ' ';
		int nDig,nChar,nOther;
		nDig = nChar = nOther = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入字符串：");
		s = input.nextLine();
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c >= 'a' && c <= 'z') {
				nChar++;
			}else if (c >= '0' && c <= '9') {
				nDig++;
			}else {
				nOther++;
			}
		}
		System.out.println("字符串中含有字母："+nChar+"个");
		System.out.println("字符串中含有数字："+nDig+"个");
		System.out.println("字符串中含有其他符号："+nOther+"个");
	}

}
