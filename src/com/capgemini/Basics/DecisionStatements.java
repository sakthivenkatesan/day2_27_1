package com.capgemini.Basics;

public class DecisionStatements 
{
	public static void main(String [] args)
	{
		//if statement
		int a = -10;
		if(a>=0)
			System.out.println("The number is positive");
		//if else statement
		if(a>=0)
			System.out.println("The number is positive");
		else
			System.out.println("The number is negative");
		//if else ladder
		int b = 3;
		if(b == 1)
			System.out.println("Sunday");
		else if(b == 2)
			System.out.println("Monday");
		else if(b == 3)
			System.out.println("Tuesday");
		else if(b == 4)
			System.out.println("Wednesday");
		else if(b == 5)
			System.out.println("Thursday");
		else if(b == 6)
			System.out.println("Friday");
		else if(b == 7)
			System.out.println("Saturday");
		else
			System.out.println("Day Unknown");
		//Nested if
		int a1 = 8674, b1 = 6462, c1 = 7682;
		if(a1 > b1)
		{
			if(a1>c1)
				System.out.println(a1);
			else
				System.out.println(c1);
		}
		else
		{
			if(b1 > c1)
				System.out.println(b1);
			else
				System.out.println(c1);
		}
	}
}
