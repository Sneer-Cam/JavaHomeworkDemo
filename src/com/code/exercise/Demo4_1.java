package com.code.exercise;

import java.util.Scanner;

public class Demo4_1 
{

	public static void main(String[] args)
	{
		int grade;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input 1~100:");
		grade = input.nextInt();
		switch (grade/10) {
		case 9:
				System.out.println("���ĳɼ�Ϊ��");
			break;
		case 8:
				System.out.println("���ĳɼ�Ϊ��");
			break;
		case 7:
				System.out.println("���ĳɼ�Ϊ��");
			break;
		case 6:
				System.out.println("���ĳɼ�Ϊ����");
			break;			
		default:
			System.out.println("���ĳɼ�Ϊ������");
			break;
		}
	}

}
