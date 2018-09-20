package com.code.exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Demo10_10 
{

	public static void main(String[] args)throws IOException
	{
		Demo10_10 io = new Demo10_10();
		io.getWriter();
		Integer[] arr = io.getReader_Sort();
		for (Integer s : arr) {
			System.out.println(s);
		}
	}

	private void getWriter()throws IOException 
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\file2.txt"));
		for (int i = 0; i < 15; i++) {
			bw.write(String.valueOf(new Random().nextInt(99999)+20));
			bw.newLine();
		}
		bw.close();
	}

	private Integer[] getReader_Sort()throws IOException
	{
		BufferedReader br = new BufferedReader(new FileReader("D:\\file2.txt"));
		ArrayList<Integer> list = new ArrayList<Integer>();
		String line = "";
		while ((line = br.readLine())!=null) {
			list.add(Integer.parseInt(line));
		}
		Integer[] arr = new Integer[list.size()];
		arr = list.toArray(arr);
		Arrays.sort(arr);
		return arr;
	}


}
