package com.code.exercise;

public class Demo5_5 
{

	public static void main(String[] args) 
	{
		int[] num = new int[8];
		int temp;
		System.out.println("�����������Ϊ��");
		for (int i = 0; i < num.length; i++) {
			num[i] = (int)(100*Math.random());
			System.out.print("  "+num[i]);
		}
		for (int i = 0; i < num.length-1; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
			System.out.println("\n�����");
			for (i = 0; i < num.length; i++) {
				System.out.print("  "+num[i]);
			}
		}
	}

}
