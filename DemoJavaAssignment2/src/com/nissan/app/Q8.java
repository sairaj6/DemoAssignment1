package com.nissan.app;

import java.util.Scanner;

/*
 8.
 Create a parameterized constructor in the above
 Box class to initialize the instance variables. 
 Then calculate the volume and print it.
 */
public class Q8 {
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter width, height and depth of Box 1");
			int widthOfBox1 = sc.nextInt();
			int heightOfBox1 = sc.nextInt();
			int depthOfBox1 = sc.nextInt();

			System.out.println("Enter width, height and depth of Box 2");
			int widthOfBox2 = sc.nextInt();
			int heightOfBox2 = sc.nextInt();
			int depthOfBox2 = sc.nextInt();

			Box box1 = new Box(widthOfBox1, heightOfBox1, depthOfBox1);
			Box box2 = new Box(widthOfBox2, heightOfBox2, depthOfBox2);

			System.out.println("Volume of Box 1: " + box1.getVolume());
			System.out.println("Volume of Box 2: " + box2.getVolume());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
