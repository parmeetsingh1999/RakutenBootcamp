package com.rakuten.training.basics;

public class Assignment3Ext implements Assignment3
{
	private Object[] contents;
	private int top = -1;
	
	public Assignment3Ext(int capacity)
	{
		contents = new Object[capacity];
	}
	
	@Override
	public void push(Object element)
	{
		try
		{
			contents[++top] = element;
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			--top;
			throw e;
		}
		
		contents[++top] = element;
	}
	
	@Override
	public Object pop()
	{
		return contents[top--];
	}
}