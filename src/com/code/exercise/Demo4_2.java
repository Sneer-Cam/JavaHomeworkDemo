package com.code.exercise;

import java.util.Scanner;

public class Demo4_2 
{

	public static void main(String[] args)
	{
		int grade,place;
		Scanner input = new Scanner(System.in);
		System.out.println("Please input 1~100:");
		grade = input.nextInt();
		if (grade>=85&&grade<=100) {
			place = 1;
		}else if (grade>=70&&grade<=84) {
			place = 2;
		}else if (grade>=60&&grade<=69) {
			place = 3;
		}else if(grade>=0&&grade<=59) {
			place = 4;
		}else {
			place = 5;
		}
		switch (place) {
		case 1:
			System.out.println("���ĳɼ�ΪA");
			break;
		case 2:
			System.out.println("���ĳɼ�ΪB");
			break;
		case 3:
			System.out.println("���ĳɼ�ΪC");
			break;	
		case 4:
			System.out.println("���ĳɼ�ΪD");
			break;
		case 5:
			System.out.println("������ĳɼ�����");
			break;
		}
	}

}
