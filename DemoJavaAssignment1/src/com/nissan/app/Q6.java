package com.nissan.app;

import java.util.Scanner;
/*
6. Two numbers are stored in locations i and j. Write a program to interchange the numbers.
You can set the status of your assignment here.
*/

public class Q6 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number to at location i");
		int atLocationI = sc.nextInt();
		System.out.println("Enter Number to at location j");
		int atLocationJ = sc.nextInt();
		
		sc.close();
		
		System.out.println("Before Interchange:\n I: "+atLocationI+" J: "+atLocationJ);

		
		int tempLocation;
		
		tempLocation = atLocationI;
		atLocationI = atLocationJ;
		atLocationJ = tempLocation;
		
		System.out.println("After Interchange:\n I: "+atLocationI+" J: "+atLocationJ);
	}

}
