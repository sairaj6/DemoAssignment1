package com.nissan.app;

import java.util.Scanner;
/*
3. Read two numbers, divide the first number by the second and print the quotient and remainder.
You can set the status of your assignment here.

*/

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value of first number");
		int firstNumber = sc.nextInt();
		System.out.println("Enter value of second");
		int secondNumber = sc.nextInt();
		
		System.out.println("Quotent is:  "+ quotent(firstNumber, secondNumber) + " Remainer is: "+ remainder(firstNumber, secondNumber));
		
		
	}
	
	public static float quotent(int firstNumber, int secondNumber)
	{
		return (firstNumber / secondNumber);
	}
	
	public static float remainder(int firstNumber, int secondNumber)
	{
		return (firstNumber % secondNumber);
	}

}
