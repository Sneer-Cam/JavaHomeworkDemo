package com.code.exercise;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo10_9 
{

	public static void main(String[] args)
	{
		File outputfile = new File("D:\\file1.txt");
		
		writerFile03(outputfile);
	}

	private static void writerFile03(File outputfile)
	{
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(outputfile,true);
			String str = "又添加了一行文字！";
			byte[] buff = str.getBytes();
			fos.write(buff);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (fos != null) {
					fos.close();
					fos = null;
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
