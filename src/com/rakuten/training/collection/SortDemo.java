package com.rakuten.training.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo
{
	public static String[] strings = {"this", "is", "a", "bunch", "of", "bizzare", "words", "like", "xylophone"};
	
	public static void main(String[] args)
	{
		demoSimpleSortOfStrings();
	}
	
	private static void demoSimpleSortOfStrings()
	{
		List<String> wordList = new ArrayList<>(Arrays.asList(strings));
//		System.out.println(strings);
		
//		System.out.println(wordList);
//		Arrays.sort(strings);
//		System.out.println(Arrays.asList(strings));
		Collections.sort(wordList);
		System.out.println(wordList);
		for(String word : strings)
			System.out.println(word);
	}
}
