package com.capgemini.Basics;
import java.util.*;
public class CompoundInterest {
	
	public static void main(String [] args)
	{
		int pa, t;
		float r;
		double ci;
		Scanner sc = new Scanner(System.in);
		pa = sc.nextInt();
		r = sc.nextFloat();
		t = sc.nextInt();
		ci = pa *(Math.pow((1 + r / 100), t));
		System.out.println(ci);
	}
}
