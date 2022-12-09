package com.yono.app;

import java.util.Scanner;

import com.yono.lib.AddCustomer;



public class BankApplication {

	public static Scanner input=new Scanner(System.in);
	public static Scanner scanner=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		char choice='n';
		do
		{
			try
			{
				System.out.println("Hello There!!!");
				System.out.println("Please select option from below: \n1.Add Customer \n2.Update Cutomer details"
						+ "\n3.Delete Customer \n4.Deposit Money \n5.Withdraw money \n6.Show Balance"
						+ "\n7.List all Customers \n8.Tranfer money to another account");
				int option=scanner.nextInt();
				switch(option)
				{
				case 1:
					AddCustomer.addCustomer();
					break;
				case 2:
					AddCustomer.updateDetails();
					break;
				case 3:
					AddCustomer.deleteCustomer();
					break;
				case 4:
					AddCustomer.depositMoney();
					break;
				case 5:
					AddCustomer.withdrawMoney();
					break;
				case 6:
					AddCustomer.showBalance();
					break;
				case 7:
					AddCustomer.listAllCustomers();
					break;
				case 8:
					AddCustomer.transferToAnother();
					break;
				default:
					System.out.println("Invalid option selected");
				}
				System.out.println("Would you like to continue (y/n)");
				choice=input.nextLine().charAt(0);
			}
			catch(Exception e)
			{
				System.out.println("Invalid Input...");
			}
		}
		while(choice=='y'||choice=='Y');
	}
}

