package com.nissan.bean;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AssetRegistration {

	public static Scanner scanner = new Scanner(System.in);

	public static void getInput() {
		String[] computerName = new String[5];
		String[] brand = new String[5];
		Date[] manufacturingDate = new Date[5];
		boolean[] isAvailable = new boolean[5];
		int quantity[] = new int[5];

		char choice = 'n';
		int i = 0;

		try {

			do {

				System.out.print("Enter Computer Name : ");
				computerName[i] = setValidComputerName(scanner.nextLine());

				System.out.print("Enter Brand Name : ");
				brand[i] = setValidBrandName(scanner.nextLine());

				System.out.println("Enter Manufacturing Date : ");
				String manfDate = scanner.nextLine();
				manufacturingDate[i] = convertStringToUtil(manfDate);

				System.out.println("Is available (true/false) : ");
				isAvailable[i] = scanner.nextBoolean();

				if (!isAvailable[i]) {
					quantity[i] = 0;
				} else {
					System.out.println("Enter Quantity : ");
					scanner.nextLine();
					quantity[i] = setQuantity(scanner.nextInt());
				}

				// increment
				i++;

				System.out.println("Do you want to continue (y/n) : ");
				choice = scanner.next().charAt(0);
				scanner.nextLine();

			} while (choice == 'y' || choice == 'Y');

		} catch (Exception e) {
			System.out.println("invalid process...");
		} finally {
			displayOutPut(computerName, brand, manufacturingDate, isAvailable,
					quantity);
		}

	}

	private static String setValidComputerName(String _computerName) {
		try {

			BufferedReader brRead = new BufferedReader(new InputStreamReader(
					System.in));

			// Creating pattern by using regular expression
			Pattern objPat = Pattern.compile("[^A-Za-z ]");

			do {
				// Matches
				Matcher matcher = objPat.matcher(_computerName);
				boolean finder = matcher.find();
				// System.out.println("---------"+finder);

				if (finder) {
					System.out
							.println("Name must contain only Alphabets. Enter name again");
					_computerName = brRead.readLine();
				} else if (_computerName.length() < 2) {
					System.out
							.println("Name should contain minimum 2 characters. Enter name again");
					_computerName = brRead.readLine();
				} else if (_computerName.length() > 30) {
					System.out
							.println("Name contains more than 30 characters. Enter name again");
					_computerName = brRead.readLine();
				} else {
					break;
				}
			} while (true);

			return _computerName;

		} catch (Exception e) {
			System.out.println("Invalid Entry in Computer name....");
		}
		return _computerName;
	}

	private static String setValidBrandName(String _brand) {
		try {

			BufferedReader brRead = new BufferedReader(new InputStreamReader(
					System.in));

			// Creating pattern by using regular expression
			Pattern objPat = Pattern.compile("[^A-Za-z ]");
			do {
				// Matches
				Matcher matcher = objPat.matcher(_brand);
				boolean finder = matcher.find();
				// System.out.println("---------"+finder);
				if (finder) {
					System.out
							.println("Name must contain only Alphabets. Enter name again");
					_brand = brRead.readLine();
				} else if (_brand.length() < 2) {
					System.out
							.println("Name should contain minimum 2 characters. Enter name again");
					_brand = brRead.readLine();
				} else if (_brand.length() > 20) {
					System.out
							.println("Name contains more than 30 characters. Enter name again");
					_brand = brRead.readLine();
				} else {
					break;
				}
			} while (true);

			return _brand;

		} catch (Exception e) {
			System.out.println("Invalid Entry in Brand name....");
		}
		return _brand;
	}

	private static Date convertStringToUtil(String _manfDate)
			throws ParseException {

		Date utilDate = new SimpleDateFormat("dd/MM/yyyy").parse(_manfDate);

		// System.out.println(utilDate);
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

		return sqlDate;
	}

	private static int setQuantity(int nextInt) {
		
		int quantity = nextInt;
		if(quantity<=0)
		{
			System.out.println("Quantity cannot be zero... Please Enter quantity again: ");
			quantity = setQuantity(scanner.nextInt());
		}
		
		return quantity;

	}

	
	private static void displayOutPut(String[] _computerName, String[] _brand,
			Date[] _manufacturingDate, boolean[] _isAvailable, int _quantity[]) {
		try {
			System.out.println("Press x key to see customer details...");
			try {

				char pressKey = scanner.nextLine().charAt(0);
				if (pressKey == 'x')
					scanner.close();
				System.out.println(String
						.format("%-20s%20s%20s%20s%20s%n", "_computerName"," _brand", "_manufacturingDate","_isAvailable", "_quantity"));
				System.out.println("---------------------------------------------------------------------------------------------------------------------------------");

				for (int i = 0; i < _quantity.length; i++) {
					System.out.println(String.format("%-20s%20s%20s%20s%20s%n",
							_computerName[i], _brand[i], _manufacturingDate[i],
							_isAvailable[i], _quantity[i]));
				}
			} catch (StringIndexOutOfBoundsException s) {
				System.out.println("Thank You For Choosing");
				System.exit(0);
			}

		} catch (Exception e) {
			System.out.println("Application is existing...");
			System.exit(0);
		}

	}

}
