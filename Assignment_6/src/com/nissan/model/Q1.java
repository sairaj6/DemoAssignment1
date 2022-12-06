package com.nissan.model;

import java.util.ArrayList;
import java.util.Scanner;

public class Q1 {
	/*1. Create an array with duplicate values. 
	 * Using collections to print all duplicate values.*/
	
	public static Scanner input=new Scanner(System.in);
	
	public static void main(String[] args)
	{
		//Creating Array
		int[] array=new int[5];
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		ArrayList<Integer> duplicates=new ArrayList<Integer>();
		System.out.println("Enter Array of integer : ");
		//checking for duplicate values
		for(int i=0;i<array.length;i++)
		{
			array[i]=input.nextInt();
			if(list.contains(array[i]))
			{
				//Checking if duplicate is already present in array or not
				if(!duplicates.contains(array[i]))
				duplicates.add(array[i]);
			}
			else
			{
				list.add(array[i]);
			}
		}
		
		//printing all duplicate elements
		System.out.println("Duplicates are: "+duplicates);
		for(int element: duplicates)
		{
			System.out.println(element);
		}
		
	}
}