package com.rakuten.training.iostreams;

import java.io.*;

public class FileInputStreamDemo
{
	public static void main(String[] args) throws Exception
	{
		File sourceFile = new File("C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\RakutenBootcamp\\MyText.txt");
		FileInputStream in = new FileInputStream(sourceFile);
		File targetFile = new File("C:\\Users\\user\\Documents\\workspace-spring-tool-suite-4-4.9.0.RELEASE\\RakutenBootcamp\\NewText.txt");
		FileOutputStream out = new FileOutputStream(targetFile);
		for(int c = in.read(); c != -1; c = in.read())
		{
			out.write(c);
		}
		in.close();
		out.close();
	}
}