package com40;
import java.util.*;
 

public class ReturnTypes4
{
	
	private static Scanner s;
	private static Scanner s2;
	private static Scanner s3;


	static void add()
	{
		int a,b;
		s3 = new Scanner(System.in);
		System.out.println("Enter the numbers");
		a=s3.nextInt();
		b=s3.nextInt();
		
		int c=a+b;
		System.out.println("Add method "+c);
	}
	static int addition()
	{
		int a,b;
		s2 = new Scanner(System.in);
		System.out.println("Enter the numbers");
		a=s2.nextInt();
		b=s2.nextInt();
		
		int c=a+b;
		return c;
	}
	static float adds()
	{
		float a,b;
		s = new Scanner(System.in);
		System.out.println("Enter the numbers");
		a=s.nextFloat();
		b=s.nextFloat();
		float c=a+b;
		return c;
	}
	static char returnchar()
	{
		return 'd';
	}
	
	
	public static void main(String[] args)
	{
		add();
		int addi=addition();
		System.out.println(addi);
		float addsmethod=adds();
		System.out.println(addsmethod);
		char d=returnchar();
		System.out.println(d);
	}
}