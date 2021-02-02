package com.rakuten.training.iostreams;

import java.io.*;

public class FileDemo
{
	public static void main(String[] args) throws Exception
	{
		File file = new File("FileDemo.java");
		if(file.exists())
		{
			System.out.println("The file exists!");
		}
		else
		{
			System.out.println("The file doesn't exists! Creating a new file...");
			file.createNewFile();
		}
		System.out.println("Absolute path of the file " + file.getAbsolutePath());
	}
}
