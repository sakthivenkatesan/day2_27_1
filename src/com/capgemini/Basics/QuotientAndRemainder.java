package com.capgemini.Basics;
import java.util.*;
public class QuotientAndRemainder {
	
	public static void main(String [] args)
	{
		int a, b;
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		System.out.println("Quotient" + (a/b));
		System.out.println("Remainder" + (a%b));
	}
}
