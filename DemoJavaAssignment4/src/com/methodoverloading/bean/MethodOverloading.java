package com.methodoverloading.bean;

import java.util.Scanner;

/*
 * Write a java program to perform the arithmetic operations using the concept of method
 overloading. Get two inputs Integer and the output must be a float. Get two inputs Float and
 the output must be an Integer.
 */
public class MethodOverloading {

	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		// accept first number from user
		System.out.println("Enter first number : ");
		int number1 = input.nextInt();
		// accept second number from user
		System.out.println("Enter second number : ");
		int number2 = input.nextInt();
		float result = sum(number1, number2);
		System.out.println("Sum : " + result);

		System.out.println("Enter first float number : ");
		float firstnum = input.nextFloat();

		System.out.println("Enter second float number : ");
		float secondnum = input.nextFloat();

		int sum = sum(firstnum, secondnum);
		System.out.println("Sum : " + sum);

		System.out.println("\n\n");
		input.close();
	}

	public static float sum(int number1, int number2) {

		System.out.println("accepting two integer and given sum as float..");
		float sum = number1 + number2;
		return sum;
	}

	public static int sum(float number1, float number2) {

		System.out.println("accepting two float and given sum as int..");
		int sum = (int) (number1 + number2);
		return sum;
	}

}
