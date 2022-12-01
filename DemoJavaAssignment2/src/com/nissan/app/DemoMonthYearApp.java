package com.nissan.app;

import java.util.Scanner;

public class DemoMonthYearApp {

	public static void main(String[] args) {
		getInputFromUser();
	}

	// step 1 getInputFromUser
	private static void getInputFromUser() {
		char inputYesNo = 'n';

		do {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter number (1 to 12)");
			int month = sc.nextInt();

			System.out.println("Enter Year");
			int year = sc.nextInt();

			// check conditions
			String monthsName = getMonthName(month);

			int daysInMonth = getDaysInMonth(month, year);

			System.out.println("Month: " + monthsName + "\nDays: "
					+ daysInMonth + "\nYear: " + year);

		} while (inputYesNo == 'y' || inputYesNo == 'Y');
	}

	// step 2 getMonthName
	private static String getMonthName(int month) {

		switch (month) {
		case 1:
			return "January";
		case 2:
			return "February";
		case 3:
			return "March";
		case 4:
			return "April";
		case 5:
			return "May";
		case 6:
			return "June";
		case 7:
			return "July";
		case 8:
			return "August";
		case 9:
			return "September";
		case 10:
			return "October";
		case 11:
			return "November";
		case 12:
			return "December";
		}

		return "Valid Month";

	}

	// step 3 getDaysOfMonth
	private static int getDaysInMonth(int month, int year) {
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
				|| month == 10 || month == 12)
			return 31;
		else if (month == 4 || month == 6 || month == 9 || month == 11)
			return 30;
		else if (findLeapYear(year))
			return 29;
		else
			return 28;

	}

	// step 4 Find LeapYear
	private static boolean findLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0)
			return true;
		else if (year % 400 == 0)
			return true;
		else
			return false;
	}

}
