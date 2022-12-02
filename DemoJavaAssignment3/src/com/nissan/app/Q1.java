package com.nissan.app;

import java.util.Scanner;

/*
 Write a program that collects information of employees in an organization. When the user gives 
 the input make sure that employee’s age should be between 18 and 60. If otherwise, throw exception.

*/
public class Q1 {

	public static void main(String[] args) {
		getAge();
	}
	
	
	public static void getAge()
	{
		Scanner scanner = new Scanner(System.in);
		
		String name;
		int age;
		

		System.out.println("Enter name: ");
		name = scanner.nextLine();
		System.out.println("Enter Age:");
		age = scanner.nextInt();
		
		try {
			do {
				if(age< 18 )
				{
					System.out.println("Age Should Be greater than 18");
					age = scanner.nextInt();
				}
				else if(age>60)
				{
					System.out.println("Age Should Be less than 60");
					age = scanner.nextInt();
				}
				else {
					break;
				}
				
			} while (true);
			
			System.out.println("Name: "+name+"\nAge: "+age);
			
			
		} catch (Exception e) {
			System.out.println("Enter valid age");
			// TODO: handle exception
		}
	}
	
	
}
