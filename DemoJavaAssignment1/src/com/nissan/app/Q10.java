package com.nissan.app;

import java.util.Scanner;

/*
10. If a five-digit number is given, write a program to reverse the number.

*/

public class Q10 {
	
 
    // Driver code
    public static void main(String[] args)
    {
    	Scanner sc = new Scanner(System.in);
    	
		System.out.println(" Enter 5 digit Number");
        int num = sc.nextInt();
        System.out.println("Reverse of no. is " + reverseDigits(num));
        
        sc.close();
        
    }
   private static int reverseDigits(int num)
    {
        int rev_num = 0;
        while (num > 0) 
        {
        		int temp = num % 10;
                rev_num = rev_num * 10 + temp;
                num = num / 10;
        }
        return rev_num;
    }

}
