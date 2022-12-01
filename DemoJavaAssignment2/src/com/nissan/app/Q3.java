package com.nissan.app;

import java.util.Scanner;

/*
 3.
Write a program that uses an if-else-if ladder to determine which season a particular
Month is in.
Months 1, 2 and 12 are come under winter season.
Months 3, 4 and 5 are come under spring season.
Months 6, 7 and 8 are come under summer season.
Months 9, 10 and 11 are come under autumn season.
Accept a number for month from user and print the result accordingly.
*/

public class Q3 {
	
	public static void main(String[] args) {
		monthSeason();
	}
	
	public static void monthSeason()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Month Number");
		int month = sc.nextInt();
		
		if(month == 1 || month ==2 || month == 12)
			System.out.println("Month comes under Winter Season");
		else if(month == 3 || month == 4 || month == 5)
			System.out.println("Month comes under Spring Season");
		else if(month == 6 || month == 7 || month == 8)
			System.out.println("Month comes under Summer Season");
		else if(month == 9 || month == 10 || month == 11)
			System.out.println("Month comes under Autum Season");
		else
			System.out.println("Enter valid month");
		
		
	}
}
