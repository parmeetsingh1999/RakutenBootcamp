package com.rakuten.training.collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDemo 
{
	public static void main(String[] args)
	{
		demohashset();
	}
	
	private static void demohashset()
	{
		Set<String> uniqueWords = new HashSet<>();
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
