package com.code.exercise;

public class Demo4_10
{

	public static void main(String[] args) 
	{
		int length = 3000,day = 0;
		while (length<=3000&&length>=5) {
			length = length-length/2;
			day+=1;
		}
		System.out.println(day+"������ӵĳ���С��5��");
	}

}
