package com.rakuten.training.collection;

import java.util.*;

public class ListDemo
{
	public static void main(String[] args)
	{
		demoHeterogeneousList();
	}
	
	public static void demoHeterogeneousList()
	{
		List l = new ArrayList();
		l.add("Hello");
		l.add(0, "first");
		l.get(1);
		Iterator<String> it = l.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
		}
	}
}
