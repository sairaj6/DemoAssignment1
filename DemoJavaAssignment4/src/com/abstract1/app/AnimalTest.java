package com.abstract1.app;

import java.util.Scanner;

import com.abstract1.bean.MyAnimal;

public class AnimalTest {

	public static void main(String[] args) {
		
		MyAnimal myanimal = new MyAnimal();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Body Temperature");
		myanimal.setBodyTemp(input.nextInt());
			System.out.println("Body Temperature is : "+ myanimal.getBodyTemp());
	}
	
	
}
