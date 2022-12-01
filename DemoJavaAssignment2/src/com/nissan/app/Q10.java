package com.nissan.app;

import java.time.Month;
import java.util.Scanner;

/*
 10.
 Create a small application that reads a month in number and print it in words.
 */
public class Q10 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the number: ");
			int monthNumber = sc.nextInt();

			System.out.println(findMonth(monthNumber));

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	static Month findMonth(int monthNum) {
		return Month.of(monthNum);
	}
}
