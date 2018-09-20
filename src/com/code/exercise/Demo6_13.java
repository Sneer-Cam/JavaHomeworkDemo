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
		System.out.println("请输入学生人数：");
		n = input.nextInt();
		String[][] person = new String[n][4];
		for (int i = 0; i < person.length; i++) {
			temp = input.nextLine();
			System.out.println("*************************");
			System.out.print("请输入第"+(i+1)+"个学生的学号：");
			person[i][0] = input.nextLine();
			System.out.print("请输入第"+(i+1)+"个学生的姓名：");
			person[i][1] = input.nextLine();
			System.out.print("请输入第"+(i+1)+"个学生的性别：");
			person[i][2] = input.nextLine();
			System.out.print("请输入第"+(i+1)+"个学生是班干部否：");
			person[i][3] = input.nextLine();
			System.out.print("请输入第"+(i+1)+"个学生的语文成绩：");
			chinese = input.nextInt();
			System.out.print("请输入第"+(i+1)+"个学生的数学成绩：");
			math = input.nextInt();
			System.out.print("请输入第"+(i+1)+"个学生的英语成绩：");
			english = input.nextInt();
		}
		for (int i = 0; i < person.length; i++) {
			System.out.println("*************************");
			System.out.println("学号："+person[i][0]);
			System.out.println("姓名："+person[i][1]);
			System.out.println("性别："+person[i][2]);
			System.out.println("班干部否："+person[i][3]);
			System.out.println("总分是："+volu.total(chinese,math,english));
			System.out.println("平均分是："+volu.score());
			
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