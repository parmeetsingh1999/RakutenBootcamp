package com.rakuten.training.streams;

import java.util.*;
import java.util.function.*;

public class Assignment6StringUtils 
{
	public static List<String> allMatches(List<String> candidates, Predicate<String> matchFunction)
	{
		List<String> results = new ArrayList<>();
		for(String possibleMatch : candidates)
		{
			if(matchFunction.test(possibleMatch)) results.add(possibleMatch);
		}
		return(results); 
}
	
	public static List<String> transformedList(List<String> originals, Function<String, String> transformer)
	{
		List<String> results = new ArrayList<>();
		for(String original : originals) results.add(transformer.apply(original));
		return(results); 
	}
	
	private Assignment6StringUtils() {} // Uninstantiatable class
}