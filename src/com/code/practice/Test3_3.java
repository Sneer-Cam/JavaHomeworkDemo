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
		System.out.println("ÇëÊäÈë×Ö·û´®£º");
		str=buf.readLine();
		System.out.println("ÄúÊäÈëµÄ×Ö·û´®ÊÇ£º"+str);
	}

}
