package com.nissan.app;

import java.util.Scanner;

/*
 9.
 Accept a real constant value from user and typecast this value into integer and print the result.

 */
public class Q9 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		acceptNumber();
	}
	
	private static void acceptNumber()
	{
		System.out.println("Enter Real Constant");
		float realConstant = sc.nextFloat();
		convertToInt(realConstant);
		
	}
	
	private static void convertToInt(float realConstant)
	{
		int intNumber = (int)realConstant;
		
		System.out.println(intNumber);
		
	}
}
