package com.rakuten.training.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Assignment6
{
	public static <T> List<T> allMatches(List<T> list, Predicate<T> matcher)
	{
		List<T> matches = new ArrayList<>();
		for(T aPossibleMatch : list)
		{
			if(matcher.test((aPossibleMatch)))
				matches.add(aPossibleMatch);
		}
		return matches;
	}
	
	public static void main(String[] args)
	{
		List<Integer> nums = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800);
		List<Integer> bigNums = allMatches(nums, n -> n >= 500);
		System.out.println(bigNums);
	}
//	List<String> words = Arrays.asList("hi", "hello", "hey");
//	List<String> shortWords = StringUtils.allMatches(words, s -> s.length() < 4);
//	List<String> wordsWithB = StringUtils.allMatches(words, s -> s.contains("b"));
//	List<String> evenlengthWords = StringUtils.allMatches(words, s -> (s.length() % 2) == 0);
//	List<Integer> nums = Arrays.asList(1, 10, 100, 1000, 10000);
//	List<Integer> bigNums = ElementsUtils.allMatches(nums, n -> n > 500);
//	List<String> excitingWords = StringUtils.transformed(words, s -> s + "!");
//	List<String> eyeWords = StringUtils.transformed(words, s -> s.replace("i", "eye"));
//	List<String> upperCaseWords = StringUtils.transformedList(words, String::toUpperCase);
//	List<Integer> wordlengths = ElementUtils.transformedList(words, String::length);
}
