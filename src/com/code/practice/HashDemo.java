package com.code.practice;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class HashDemo 
{

	public static void main(String[] args) 
	{
		File outputfile = new File("D:\\test.txt");
		
		writerFile01(outputfile);
	}

	private static void writerFile01(File outputfile) {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(outputfile);
			String str = "One Direction!!!";
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
				if (fos!=null) {
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
