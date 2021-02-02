package com.rakuten.training.basics;

public class AssignmentFinal
{
	public static void main(String[] args)
	{
		Assignment3ExtExt user = new Assignment3ExtExt();
		Assignment3Ext s = new Assignment3Ext(9);
		user.fill10(s);
		Assignment3Ext user1 = new Assignment3Ext(10);
		user1.push(1);
		System.out.println(user1.pop());
	}
}