package com.nissan.app;

import java.util.Scanner;

/*
4. The distance between two cities (KM) is input through the keyboard. Write a
program to convert and print this distance in meters, feet, inches and centimeters.
*/

public class Q4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter distance in KM");
		int distance = sc.nextInt();
		convertDistance(distance);
		
		sc.close();
	}
	
	public static void convertDistance(int distance)
	{
		System.out.println("KM to meter = " + distance*1000);
		System.out.println("KM to feet = " + distance*3280.84);
		System.out.println("KM to inches = " + distance*39370.079);
		System.out.println("KM to centimeter = " + distance*100000);



	}

}
