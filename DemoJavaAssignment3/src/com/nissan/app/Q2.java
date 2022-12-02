package com.nissan.app;

/*
Create an array having 10 elements. Try to print the element in the 11th position. Catch the appropriate exception.

*/
public class Q2 {
	public static void main(String[] args) {
			
		arrayElements();
		
	}

	private static void arrayElements() {
		
		int[] arrayElements = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		try {
			
			for (int i = 0; i <= arrayElements.length; i++) {
				
				System.out.println(arrayElements[i]);
			}
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Array out of bound ");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
