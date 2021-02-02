package com.rakuten.training.basics;

public class PrimitiveVsReference
{
	static int class_level_x;
	
	public static void f1(int i)
	{
//		something
	}
	
	public static void f1(long l)
	{
//		something
	}
	public static void main(String[] args)
	{
//		int x;
//		System.out.println(x);
		System.out.println(class_level_x);
		//Primitive data type
		int i = 4;
		//Reference data type
		int[] nums = new int[10];
		//Calling the twin functions
		f1(100);
		f1(100L);
		//Calling function someFun1
		someFun1(i);
		System.out.println(i);
		//Calling function someFun2
		nums[0] = 20;
		someFun2(nums);
		System.out.println(nums[0]);
		//Wrapper class reference
		Integer intObj = i;
		System.out.println(intObj);
	}
	
	public static void someFun1(int someNum)
	{
		someNum++;
	}
	
	public static void someFun2(int[] someNums)
	{
		someNums[0]++;
	}
}
/*
//Code by Pradeep LN sir
public class PrimitiveVsReference {
	
	static int class_level_x;
	
	
	public static void f1(int i) {
		//something
	}
	
	public static void f1(long l) {
		//something else
	}

	public static void main(String[] args) {
		
		int x;
		class_level_x++;
		System.out.println(class_level_x);
		
//		x++;
		
//		System.out.println(x);
		
		int i = 4;
		
		f1(100L);
		
	//	long someLong = 100;
		
		someFun1(i);
		System.out.println(i);
//		Integer intObj = new Integer(i);
		Integer intOnj = i;
		
		int[] nums = new int[10];
		nums[0] = 20;
		someFun2(nums);
		System.out.println(nums[0]);

	}
	
	public static void someFun1(int someNum) {
		someNum++;
	}

	public static void someFun2(int someNums[]) {
		someNums[0]++;
	}
}
*/