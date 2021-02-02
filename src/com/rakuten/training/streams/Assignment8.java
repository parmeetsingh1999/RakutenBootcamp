package com.rakuten.training.streams;

import java.util.Arrays;
import java.util.List;

public class Assignment8
{
	public static void main(String[] args)
	{
		List<String> words = Arrays.asList("hi", "hello", "hey");
		//Problem 1
		String concat1 = words.stream().reduce("", (s1, s2) -> s1.toUpperCase() + s2.toUpperCase());
		System.out.println(concat1);
		//Problem 2
		String concat2 = words.stream().map(c -> c.toUpperCase()).reduce("", String::concat);
		System.out.println(concat1);
		//Problem 3
		String concat3 = words.stream().reduce((s1, s2) -> s1 + ",");
		System.out.println(concat3);
	}
}