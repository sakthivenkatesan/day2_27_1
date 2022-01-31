package com.capgemini.Basics;
import java.util.*;
public class SimpleInterest {
	
	public static void main(String [] args)
	{
		int pa, t;
		float r;
		double si;
		Scanner sc = new Scanner(System.in);
		pa = sc.nextInt();
		r = sc.nextFloat();
		t = sc.nextInt();
		si = (pa * r * t)/100;
		System.out.println(si);
	}
}
