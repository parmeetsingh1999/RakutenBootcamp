package com.rakuten.training.collection;

import java.util.ArrayList;
import java.util.List;

public class CopyUtils
{
	public static <T> void copyFromFirsttoSecond(List<T> from, List<? super T> to)
	{
		
	}
	
	public static void main(String[] args)
	{
		List<Object> oList = new ArrayList<Object>();
		List<Integer> iList = new ArrayList<>();
		List<Number> nList = new ArrayList<>();
		copyFromFirsttoSecond(iList, nList);
	}
}
