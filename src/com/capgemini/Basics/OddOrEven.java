package com.capgemini.Basics;
import java.util.*;
public class OddOrEven 
{
	public static void main(String[] args)
	{
		int a;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		if(a%2 == 0)
			System.out.println("EVEN");
		else
			System.out.println("ODD");
	}
}
