package com.rakuten.training.collection;

import java.util.*;

public class TreeSetDemo
{
	public static void main(String[] args)
	{
		demoSimpleTreeMap();
	}
	
	private static void demoSimpleTreeMap()
	{
		Set<String> uniqueWords = new TreeSet<>();
		try(Scanner sc = new Scanner(System.in))
		{
			while(true)
			{
				System.out.println("Enter a word - ");
				String word = sc.nextLine();
				if(word.equalsIgnoreCase("quit"))
					break;
				if(!uniqueWords.add(word))
					System.out.println("That's a duplicate !");
			}
			for(String s : uniqueWords)
				System.out.println(s);
		}
	}
}
