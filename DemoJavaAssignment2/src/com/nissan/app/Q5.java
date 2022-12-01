package com.nissan.app;

import java.util.Scanner;

/*

 5.
 Create a menu driven program using do-while and switch-case which implements a help system for Java’s selection and iteration statements. 
 You have to display the syntax of selected control statement.
Help on:

1. if

2. switch

3. while

4. do-while

5. for

Choose one:

4

The do-while:

do {

statement;

 } while (condition);




*/

public class Q5 {
	
	public static void main(String[] args) {
		helpSystem();
		
	}
	
	private static void helpSystem()
	{
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		
		do {
			int choice;
			
			System.out.println("1. if");
			System.out.println("2. switch");
			System.out.println("3. while");
			System.out.println("4. do-while");
			System.out.println("5. for");
			System.out.println("6. exit");
			System.out.println("-----------------------");
			System.out.println("Enter Choice: ");
			choice = sc.nextInt();
			System.out.println("-----------------------");
			
			switch (choice) {
			case 1:
				System.out.println("if(condition)\n   statement;");
				break;
			case 2:
				System.out.println("switch (key) {\n  case value:\n  \tbreak;\n  default:\n  \tbreak\n}");
				
				break;
			case 3:
				System.out.println("while(condition)\n{\n\tstatement;\n}");
							
				break;
			case 4:
				System.out.println("do\n{\n\tstatement\n}\nwhile(condition);");
				
				break;
			case 5:
				System.out.println("for(initilization; condition; increment;)\n{\n\tstatement;\n}");

				break;
			case 6:
				flag = true;
				break;
	

			default:
				break;
			}
			
			
		} while (!flag);
		
		
		
		
		
	}

}
