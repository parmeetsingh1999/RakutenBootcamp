package com.rakuten.training.basics;

public class Assignment3ExtExt
{
	public void fill10(Assignment3 obj)
	{
		for(int i=0; i<10; i++)
		{
			obj.push(i);
			System.out.println("Pushed -> " + i);
		}
	}
}