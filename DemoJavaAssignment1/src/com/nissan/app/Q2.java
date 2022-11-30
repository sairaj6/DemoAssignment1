package com.nissan.app;

import java.util.Scanner;

/*
2. Ramu visited the bookstore to buy books for his kid. He bought notebooks 
for Rs.100 and magic pot for Rs.50. How much money did Ramu spend in the bookstore?
*/
public class Q2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter NoteBook Price");
		int notebookPrice = sc.nextInt();
		System.out.println("Enter Magic Pot Price");
		int magicPotPrice = sc.nextInt();	
		
		System.out.println("Total prioce spent by ramu was "+ moneySpend(notebookPrice, magicPotPrice));

	}
	
	public static double moneySpend(int notebookPrice, int magicPotPrice)
	{
		return notebookPrice + magicPotPrice;
	}

}
