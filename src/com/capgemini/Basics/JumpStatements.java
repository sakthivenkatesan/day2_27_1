package com.capgemini.Basics;

public class JumpStatements 
{
	public static void main(String [] args)
	{
		for(int i=0; i<100; i++)
		{
			System.out.println(i);
			if(i==55)
				break;
		}
		System.out.println();
		for(int i=0; i<50; i++)
		{
			if(i%2 == 0)
				continue;
			System.out.println(i);
		}
	}
}
