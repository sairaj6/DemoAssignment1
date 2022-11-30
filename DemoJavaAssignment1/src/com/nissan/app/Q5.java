package com.nissan.app;

import java.util.Scanner;

/*
5. The temperature of a city in Fahrenheit is given. Write a program to convert it into Celsius.
You can set the status of your assignment here.
*/

public class Q5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Temperature in Fahrenheit");
		float temperature = sc.nextInt();
		System.out.println("Temperature in Celsius: "+convertTemperature(temperature));

		sc.close();
		
	}

	private static float convertTemperature(float temperature) {
		return (5/9)*(temperature -32);
		
	}
	
	
}
