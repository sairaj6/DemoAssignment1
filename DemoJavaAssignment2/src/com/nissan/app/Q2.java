package com.nissan.app;

import java.util.Scanner;
/*
b. You are a Software developer in XYZ Company and you are asked to 
create a program to verify a user’s PIN code when a user visits an ATM. 
To implement this concept, you must use decisional statements to make appropriate 
decisions when a use’s PIN code matches with the pin code assigned to that user. 
For that, you have created a class named Verify, in which a user has to enter some 
numeric value as the PIN code during runtime. Apart from that, you have initialized 
a variable y with some numeric value and compare the value stored in the variable y 
with the value accepted from a user.

*/

public class Q2 {
	static Scanner sc =  new Scanner(System.in);
	
	public static void main(String[] args) {
		validatePin();
	}
	
	private static void validatePin()
	{
		System.out.println("Enter Pin");
		int pin = sc.nextInt();
		
		int uPin = 1234;
		
		if(pin == uPin)
			System.out.println("Welcome");
		else
			System.out.println("Please enter correct PIN");
		
	}

}
