package com.nissan.app;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nissan.service.IVehicle;

public class VehicleApp {
	
	public static Scanner scanner = new Scanner(System.in);
	

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		int choice;
		boolean flag = true;
		
		do {
			System.out.println("Select Choice");
			System.out.println("1. BMW\n2. Tata\n3. Nissan\n4. Jaguar\n5. Exit");
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				IVehicle vehicle = context.getBean("BMW",IVehicle.class);
				System.out.println(vehicle.getService());
				break;
			case 2:
				vehicle = context.getBean("tata",IVehicle.class);
				System.out.println(vehicle.getService());
				break;
			case 3:
				vehicle = context.getBean("nissan",IVehicle.class);
				System.out.println(vehicle.getService());
				break;
			case 4:
				vehicle = context.getBean("jaguar",IVehicle.class);
				System.out.println(vehicle.getService());
				break;
			case 5:
				flag = false;
				break;

			default:
				System.out.println("Select Proper Choice");
				break;
			}
			
		} while (flag);
		
		/*
		 * IVehicle vehicle = context.getBean("BMW",IVehicle.class);
		 * System.out.println(vehicle.getService());
		 * 
		 * vehicle = context.getBean("tata",IVehicle.class);
		 * System.out.println(vehicle.getService());
		 * 
		 * vehicle = context.getBean("nissan",IVehicle.class);
		 * System.out.println(vehicle.getService());
		 * 
		 * vehicle = context.getBean("jaguar",IVehicle.class);
		 * System.out.println(vehicle.getService());
		 */
		
	}
}
