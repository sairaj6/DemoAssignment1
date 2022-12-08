package com.nissan.model;

import java.util.ArrayList;
import java.util.HashSet;

public class Q3 {
	/*
	 * 3. Retrive data from HashSet 
	 * and store it in an ArrayList and
		display from ArrayList.
	 */
	public static void main(String[] args)
	{
		HashSet<Integer> set=new HashSet<Integer>();
		set.add(3);
		set.add(43);
		set.add(02);
		set.add(99);
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i:set)
		{
			list.add(i);
		}
		for(int j :list)
		{
			System.out.println(j);
		}
		
		ArrayList<Integer> listToSet=new ArrayList<Integer>(set);
		//HashSet to List
		System.out.println("HashSet to List");
		for(int j :listToSet)
		{
			System.out.println(j);
		}
		
	}
}
