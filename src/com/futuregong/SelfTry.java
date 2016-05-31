package com.futuregong;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SelfTry {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Downloads\\test.txt");
		byte[] c = new byte[1024];
		int hasRead=0;
		while((hasRead = fis.read(c))>0)
		{
			System.out.println(new String(c,0,hasRead));
		}
		fis.close();
		
	}
}
