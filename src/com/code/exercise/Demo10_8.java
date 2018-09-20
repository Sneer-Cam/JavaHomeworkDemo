package com.code.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo10_8 
{

	public static void main(String[] args)
	{
		File file = new File("D:\\file1.txt");
		
		readerFile02(file);
	}

	private static void readerFile02(File file) 
	{
		FileReader fr = null;
		
		try {
			fr = new FileReader(file);
			int c = -1;
			while((c = fr.read())!=-1){
				System.out.print((char)c);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (fr != null) {
					fr.close();
					fr = null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
