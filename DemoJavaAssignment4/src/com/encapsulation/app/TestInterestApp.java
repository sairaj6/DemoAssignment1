package com.encapsulation.app;

import java.util.Scanner;

import com.encapsulation.bean.FixedDeposit;
import com.encapsulation.bean.SavingAccount;

public class TestInterestApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the type of account"
				+ "\n choose f for fixed deposit type and s for savings acc.");
		char choice = input.next().charAt(0);
		if (choice == 'f') {
			try {
				FixedDeposit customer = new FixedDeposit();
				System.out.println("Enter principle number:");
				customer.setPrinciple(input.nextDouble());
				System.out.println("Enter time in years:");
				customer.setTimeinYear(input.nextInt());
				System.out.println("Interest Rate is "
						+ customer.getInterestRate());
				System.out.println("Your interest is :"
						+ calculateInterest(customer.getPrinciple(),
								customer.getTimeinYear(), customer.getRate()));
			} catch (Exception e) {
				System.out.println("Exception occured");
			}

		} else if (choice == 's') {
			try {
				SavingAccount customer = new SavingAccount();
				System.out.println("Enter principle number:");
				customer.setPrinciple(input.nextDouble());
				System.out.println("Enter time in years:");
				customer.setTimeinYear(input.nextInt());
				System.out.println("Interest Rate is "
						+ customer.getInterestRate());
				System.out.println("Your interest is :"
						+ calculateInterest(customer.getPrinciple(),
								customer.getTimeinYear(), customer.getRate()));
			} catch (Exception e) {
				System.out.println("Exception occured");
			}

		} else {
			System.out
					.println("Wrong choice please select correct account type");
		}

	}

	public static double calculateInterest(double principle, int time,
			double rate) {
		return (principle * time * rate);
	}

}
