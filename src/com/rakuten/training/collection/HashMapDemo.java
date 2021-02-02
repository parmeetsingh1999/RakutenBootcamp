package com.rakuten.training.collection;

import java.util.*;

public class HashMapDemo
{
	public static void main(String[] args)
	{
		demoSimpleMapOps();
	}
	
	private static void demoSimpleMapOps()
	{
		Map<String, Integer> runs = new HashMap<>();
		runs.put("Virat", 100);
		runs.put("Bhuvi", 45);
		runs.put("Rohit", 32);
		
		System.out.println("Is there a batsman called Rohit? " + runs.containsKey("Rohit"));
		System.out.println("Anyone scored exact 100? " + runs.containsValue(100));
		System.out.println("How many runs for Bhuvi? " + runs.get("Bhuvi"));
		System.out.println("How many runs for Jinx? " + runs.get("Jinx"));
	}
}
