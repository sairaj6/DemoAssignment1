package com.nissan.app;

import java.util.Scanner;

/*
1. For 10 oranges we have to pay Rs.45 what will be the price of 1 orange.
You can set the status of your assignment here.
*/
public class Q1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Eneter Quantity");
		int qtyOranges = sc.nextInt();
		System.out.println("Enete Price");
		float priceOrange = sc.nextFloat();
		
		
		System.out.println("Price of one Orange is: "+ priceOfOrange(qtyOranges,priceOrange));
		
		
		
	}
	
	public static double priceOfOrange(int qtyOranges, float priceOrange)
	{
		return (double)(priceOrange / qtyOranges);
	}

}
