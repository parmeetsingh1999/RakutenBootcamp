package com.rakuten.training.streams;
import java.util.Arrays;
import java.util.List;

public class Assignment7
{
	public static void main(String[] args)
	{
		List<String> words = Arrays.asList("hi", "hello", "hey");
		//Problem 1
		for(String c : words)
		{
			System.out.print(c + "  ");
		}
		//Problem 2
		System.out.println();
		words.forEach(c -> System.out.println(c));
		//Problem 3
		//Problem 4
	}
}
