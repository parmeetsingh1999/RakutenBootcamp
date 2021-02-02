package com.rakuten.training.basics;
// Question 1

import java.util.*;

public class Assignment1
{
	public static int findDOW(int year, int month, int day)
	{
	    int res = (year - 1900) * 365;
	    res += (int)(year - 1990) / 4;
	    if(((year % 4 == 0) || (year % 100 == 0) || (year % 400 == 0)) && ((month == 1) || (month == 2)))
	    {
	    	res--;
	    }
	    switch(month)
	    {
	    	case 2:
	    		res += 31;
	    		break;
	    	case 3:
	    		res += 59;
	    		break;
	    	case 4:
	    		res += 90;
	    		break;
	    	case 5:
	    		res += 120;
	    		break;
	    	case 6:
	    		res += 151;
	    		break;
	    	case 7:
	    		res += 181;
	    		break;
	    	case 8:
	    		res += 31;
	    		break;
	    	case 9:
	    		res += 31;
	    		break;
	    	case 10:
	    		res += 30;
	    		break;
	    	case 11:
	    		res += 31;
	    		break;
	    }
	    res += day;
	    return res % 7;
	}
	public static void main(String[] args)
	{
		int year, month, day;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the year = ");
		year = sc.nextInt();
		System.out.println("Enter the month = ");
		month = sc.nextInt();
		System.out.println("Enter the day = ");
		day = sc.nextInt();
		int weekDay = findDOW(year, month, day);
		switch(weekDay)
		{
		case 0: 
			System.out.println("Tuesday");
			break;
		case 1: 
			System.out.println("Wednesday");
			break;
		case 2: 
			System.out.println("Thursday");
			break;
		case 3: 
			System.out.println("Friday");
			break;
		case 4: 
			System.out.println("Saturday");
			break;
		case 5: 
			System.out.println("Sunday");
			break;
		case 6: 
			System.out.println("Monday");
			break;
		}
	}
}