package com.nissan.app;
/*
 
-------------------------
6.
 Create the following output using for loop
..........

.........

........

.......

......

.....

....

...

..

.

 */
public class Q6 {
	public static void main(String[] args) {
		pattern();
	}

	private static void pattern() {
		int num = 10;
		for(int i = 10; i>=0; i--)
		{
			for(int j = i; j>=0; j--)
			{
				System.out.print(".");
			}
			System.out.println();
		}
		
		
	}

}
