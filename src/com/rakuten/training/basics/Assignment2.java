package com.rakuten.training.basics;
//Assignment 2

public class Assignment2
{
	private String symbolicName, name;
	private int atomicNumber;
	
	public int getAtomicNumber()
	{
		return atomicNumber;
	}

	static boolean[] alkaliMetals = new boolean[120];
	
	static 
	{
		alkaliMetals[3] = true;
		alkaliMetals[11] = true;
		alkaliMetals[19] = true;
		alkaliMetals[37] = true;
		alkaliMetals[55] = true;
		alkaliMetals[87] = true;
	}
	
	public Assignment2(String name, String symbolicName, int atomicNumber)
	{
		this.name = name;
		this.symbolicName = symbolicName;
		this.atomicNumber = atomicNumber;
	}
	
	public boolean isAlkaliMetal()
	{
		return alkaliMetals[atomicNumber];
	}
	
	public boolean isTransitMetal()
	{
		return (atomicNumber >= 21 && atomicNumber <= 31) 
				|| (atomicNumber >= 39 && atomicNumber <= 48) 
				|| (atomicNumber >= 72 && atomicNumber <= 80) 
				|| (atomicNumber >= 104 && atomicNumber <= 112);
	}
	
	public static void main(String[] args)
	{
		
	}
}
