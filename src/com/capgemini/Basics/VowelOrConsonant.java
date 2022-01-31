package com.capgemini.Basics;
import java.util.*;
public class VowelOrConsonant 
{
	public static void main(String [] args)
	{
		char a;
		Scanner sc = new Scanner(System.in);
		a = sc.next().charAt(0);
		if(a == 'a' || a == 'e' || a == 'i' || a == 'o' || a == 'u' || a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U' )
			System.out.println("The character is a vowel");
		else
			System.out.println("The character is a character");
	}
}
