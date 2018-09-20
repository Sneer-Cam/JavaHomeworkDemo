package com.code.exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo5_11 
{

	public static void main(String[] args)throws IOException
	{
		String str;
		BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ÇëÊäÈë×Ö·û´®£¬ÊäÈëexitÍË³ö£º");
		do {
			str = buf.readLine();
			System.out.println(str);
		} while (!str.equals("exit"));
	}

}
