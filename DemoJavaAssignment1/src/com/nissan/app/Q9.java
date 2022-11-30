package com.nissan.app;

import java.util.Scanner;

/*
9. If a five-digit number is input through the keyboard, write a program to calculate the sum of its digits.
*/

public class Q9 {
	
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a 5-digit number: ");
		int num = sc.nextInt();
	
		System.out.println("Sum of digits of " + num + " is = " + sumOfDigits(num));
		
	}
	
	private static int sumOfDigits(int num)
	{
		int digit, temp, sum;
		
		digit = 0;
		temp = num;
		sum = 0;
		int count = 0;
		
		 while(num!=0)
		    {
		        num /= 10;
		        count += 1;
		    }

		for (int i = 0; i <= count; i++)
		{
		   digit = temp % 10;
	       sum = digit + sum;
	       temp = temp/10;
		}
		
		return sum;
	}

}
