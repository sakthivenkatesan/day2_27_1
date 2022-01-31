package com.capgemini.Basics;

public class IterationStatements 
{
	public static void main(String [] args)
	{
		int i;
		for(i = 0; i <= 10; i++)
		{
			System.out.println("For Loop " + i);
		}
		System.out.println();
		i=0;
		while(i<15)
		{
			System.out.println("While loop " + i);
			i++;
		}
		i=0;
		System.out.println();
		do
		{
			System.out.println("Do while Loop " + i);
			i++;
		}
		while(i<10);
	}
}
