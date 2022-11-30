package com.nissan.app;

import java.util.Scanner;

/*
Raju’s basic salary is given. His dearness allowance is 40% of the basic salary and 
house rent allowance is 20%. Calculate his total salary.

*/
public class Q7 {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter basic salary: ");
		int basicSalary=sc.nextInt();
		
		sc.close();
		
		System.out.println("Total salary is: "+totalSalary(basicSalary));
	}
	
	private static double totalSalary(int basicSalary)
	{
		double dearnessAllowance=basicSalary*0.4;
		double hra=basicSalary*0.2;
		double result=(basicSalary+dearnessAllowance+hra);
		return result;
	}
}

