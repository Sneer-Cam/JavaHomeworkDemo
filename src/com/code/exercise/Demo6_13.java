package com.code.exercise;

import java.util.Scanner;

public class Demo6_13
{

	public static void main(String[] args) 
	{
		String temp;
		int chinese=0,math=0,english=0,sum,n;
		double avg;
		Scanner input = new Scanner(System.in);
		Student volu = new Student();
		System.out.println("������ѧ��������");
		n = input.nextInt();
		String[][] person = new String[n][4];
		for (int i = 0; i < person.length; i++) {
			temp = input.nextLine();
			System.out.println("*************************");
			System.out.print("�������"+(i+1)+"��ѧ����ѧ�ţ�");
			person[i][0] = input.nextLine();
			System.out.print("�������"+(i+1)+"��ѧ����������");
			person[i][1] = input.nextLine();
			System.out.print("�������"+(i+1)+"��ѧ�����Ա�");
			person[i][2] = input.nextLine();
			System.out.print("�������"+(i+1)+"��ѧ���ǰ�ɲ���");
			person[i][3] = input.nextLine();
			System.out.print("�������"+(i+1)+"��ѧ�������ĳɼ���");
			chinese = input.nextInt();
			System.out.print("�������"+(i+1)+"��ѧ������ѧ�ɼ���");
			math = input.nextInt();
			System.out.print("�������"+(i+1)+"��ѧ����Ӣ��ɼ���");
			english = input.nextInt();
		}
		for (int i = 0; i < person.length; i++) {
			System.out.println("*************************");
			System.out.println("ѧ�ţ�"+person[i][0]);
			System.out.println("������"+person[i][1]);
			System.out.println("�Ա�"+person[i][2]);
			System.out.println("��ɲ���"+person[i][3]);
			System.out.println("�ܷ��ǣ�"+volu.total(chinese,math,english));
			System.out.println("ƽ�����ǣ�"+volu.score());
			
		}
	}

}
class Student{
	int sum;
	double avg;
	int total(int chinese,int math,int english){
		sum = chinese+math+english;
		avg = (double)sum/3;
		return sum;
	}
	double score(){
		avg = (double)sum/3;
		return avg;
	}
}