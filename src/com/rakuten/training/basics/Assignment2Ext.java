package com.rakuten.training.basics;

public class Assignment2Ext
{
	public static void main(String[] args)
	{
		Assignment2 h = new Assignment2("Hydrogen", "H", 1);
		System.out.println("Is Hydrogen an alkali? " + h.isAlkaliMetal());
		Assignment2 k = new Assignment2("Potassium", "K", 1);
		System.out.println("Is Potassium an alkali? " + k.isAlkaliMetal());
		
	}
}
