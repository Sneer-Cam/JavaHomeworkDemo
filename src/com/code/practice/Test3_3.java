package com.code.practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3_3 
{

	public static void main(String[] args) throws IOException 
	{
		BufferedReader buf;
		String str;
		buf=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("�������ַ�����");
		str=buf.readLine();
		System.out.println("��������ַ����ǣ�"+str);
	}

}
