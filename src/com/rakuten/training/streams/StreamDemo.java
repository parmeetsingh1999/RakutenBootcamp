package com.rakuten.training.streams;

public class StreamDemo
{
	public static void main(String[] args)
	{
		Integer[] intObj = {1, 2, 3, 4};
		int[] ints = {1, 2, 3, 4};
		intObj[0]++;
		ints[0]++;
		System.out.println(intObj[0] + "    "  + ints[0]);
	}
}
