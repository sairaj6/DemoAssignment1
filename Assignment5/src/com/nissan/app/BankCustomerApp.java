package com.nissan.app;

import static com.nissan.util.BankCustomerUtil.depositMoney;
import static com.nissan.util.BankCustomerUtil.loadBankCustomerDetails;
import static com.nissan.util.BankCustomerUtil.showBalance;
import static com.nissan.util.BankCustomerUtil.transferAmount;
import static com.nissan.util.BankCustomerUtil.withdrawMoney;

import java.util.List;
import java.util.Scanner;

import com.nissan.pojo.BankCustomer;
import com.nissan.util.BankCustomerValidation;

public class BankCustomerApp {

	public static void main(String[] args) {
		try(Scanner scan = new Scanner(System.in)) {
			System.out.println("Welcome to Bank Management System!!!"); 
			
			List<BankCustomer> bankCustomerList = loadBankCustomerDetails();
			boolean loop = true;
			
			String accNumber;
			
			while(loop) {
				System.out.println("Press 1 to add amount");
				System.out.println("Press 2 to deposit amount");
				System.out.println("Press 3 to withdraw amount");
				System.out.println("Press 4 to see balance");
				System.out.println("Press 5 to transfer amount");
				System.out.println("Press 6 to exit");
				System.out.print("Enter your choice: ");
				int choice = scan.nextInt();
				
				switch (choice) {
				case 1: 
					  String customerName;
					  String accountNumber;
					  double balance;
					  String panNumber;
					  
					  System.out.println("Enter customer name");
					  customerName = scan.next();
					  System.out.println("Enter account Number");
					  accountNumber = scan.next();
					  System.out.println("Enter Opening Balance");
					  balance = scan.nextDouble();
					  System.out.println("Enter PAN Number");
					  panNumber = scan.next();
					  
					  bankCustomerList.add(BankCustomerValidation.validateBankCustomer(customerName, accountNumber, balance, panNumber));
					
					break;
				case 2:
					System.out.println("Enter account number: ");
					scan.nextLine();
					accNumber = scan.nextLine();
					depositMoney(accNumber, bankCustomerList);
					break;
					
				case 3:
					System.out.println("Enter account number: ");
					scan.nextLine();
					accNumber = scan.nextLine();
					withdrawMoney(accNumber, bankCustomerList);
					break;
					
				case 4:
					System.out.println("Enter account number: ");
					scan.nextLine();
					accNumber = scan.nextLine();
					showBalance(accNumber, bankCustomerList);
					break;

				case 5:
//					System.out.println("In progress!!!");
					System.out.println("Enter depositor's account number: ");
					scan.nextLine();
					String senderAccNumber = scan.nextLine();
					System.out.println("Enter beneficiary's account number: ");
					String beneficiaryAccNumber = scan.nextLine();
					System.out.println(transferAmount(senderAccNumber, beneficiaryAccNumber, bankCustomerList));
					break;
					
				case 6:
					loop = false;
					break;
					
				default:
					System.out.println("Not a valid choice");
					break;
				}
			}
			scan.nextLine();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
