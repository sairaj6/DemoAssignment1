package com.nissan.app;

import java.util.Scanner;

/*
4. Rewrite the above program using switch-case
-------------------------

*/
public class Q4 {

	public static void main(String[] args) {
		monthSeason();
	}
	
	public static void monthSeason()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Month (1 to 12)");
		int month = sc.nextInt();
		try {
			switch (month) {
			case 1:
				System.out.println("Month comes under Winter Season");
				break;
			case 2:
				System.out.println("Month comes under Winter Season");
				break;
			case 3:
				System.out.println("Month comes under Spring Season");
				break;
			case 4:
				System.out.println("Month comes under Spring Season");
				break;
			case 5:
				System.out.println("Month comes under Spring Season");
				break;
			case 6:
				System.out.println("Month comes under Summer Season");
				break;
			case 7:
				System.out.println("Month comes under Summer Season");
				break;
			case 8:
				System.out.println("Month comes under Summer Season");
				break;
			case 9:
				System.out.println("Month comes under Autum Season");
				break;
			case 10:
				System.out.println("Month comes under Autum Season");
				break;
			case 11:
				System.out.println("Month comes under Autum Season");
				break;
			case 12:
				System.out.println("Month comes under Winter Season");
				break;
			default:
				System.out.println("Enter valid Month");
				break;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
