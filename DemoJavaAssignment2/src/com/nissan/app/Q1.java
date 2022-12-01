package com.nissan.app;

import java.util.Scanner;

/*
 a. Consider an electricity billing calculation. There are two types of customers. 
 Domestic and Industry. If it is domestic, the slabs are like this,
 The reading in the range,
 0-100 then amt=units* Rs.1

 100-200amt=units*1.5

 200-500amt=units*2

 >500amt = units*5

 If it is industrial, the amt =units*10.

 */

public class Q1 {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		calculateBill();

	}

	public static double enterUnits() {

		System.out.println("Enter no. of units");
		double units = sc.nextDouble();
		
		return units;
	}
	
	public static void calculateBill()
	{
		double amount;
		boolean flag= false;
		int customer;
		

		
		do {
			System.out.println("\nSelect Customer Type\n 1. Domestic\n 2. Industrial\n 3. to Exit");
			customer = sc.nextInt();
			int choice = customer;
			switch (choice) 
			{
				case 1:
					double units = enterUnits();
					
					if(units>=0 && units<100)
						System.out.print("Electricity Bill is: "+ units*1);
					else if(units>=100 && units<200)
						System.out.print("Electricity Bill is: "+ units*1.5);
					else if(units>=200 && units<500)
						System.out.print("Electricity Bill is: "+ units*2);
					else
						System.out.println("Electricity Bill is: "+ units*5);
					
					break;
					
				case 2: 
					
					amount = enterUnits() * 10;
					System.out.print("Electricity Bill is: "+ amount);
					break;
	
				case 3:
					flag = true;
					break;
			}
		} while (!flag);
		 
		
		
	}
	

}
