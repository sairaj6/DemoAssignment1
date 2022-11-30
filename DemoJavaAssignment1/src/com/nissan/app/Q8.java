package com.nissan.app;

import java.util.Scanner;

public class Q8 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number to at location i");
		int atLocationI = sc.nextInt();
		System.out.println("Enter Number to at location j");
		int atLocationJ = sc.nextInt();
		
		sc.close();
		System.out.println("Before Interchange:\n I: "+atLocationI+" J: "+atLocationJ);
	
	
		atLocationI = atLocationJ + atLocationI;
		atLocationJ = atLocationI - atLocationJ;
		atLocationI = atLocationI - atLocationJ;
		
		System.out.println("After Interchange:\n I: "+atLocationI+" J: "+atLocationJ);
	}

}
