package com.code.exercise;
class Mbank
{
	public static int balance = 0;
	public synchronized static void deposit(int b)
	{
		int temp = balance;
		temp += b;
		try {
			Thread.sleep((int)(Math.random()*1000));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		balance = temp;
		System.out.println("»ã¿îºó"+balance);
	}
	
}
class Customer extends Thread
{
	public void run()
	{
		for (int i = 0; i < 3; i++) {
			Mbank.deposit(100);
		}
	}
}
public class Demo11_8
{

	public static void main(String[] args)
	{
		Customer c1 = new Customer();
		Customer c2 = new Customer();
		c1.start();
		c2.start();
	}

}
