package com.nissan.app;

import java.util.Random;
import java.util.Scanner;

/*
 11.
 You have been asked to develop a Java application for railway department, 
 which will automate the seat booking process for a particular train. In the existing 
 scenario, passengers fill the booking request form with the following details.
 a) Train id
 b) Train Name
 c) Passenger Name
 Based on the availability, the railway officer reserves the seat and gives seat 
 conformation. Write a java program that will show the process of seat conformation 
 for the passengers of a particular train.
 In this task, you will create the SeatReservation class, in which train id is given
 by the user at the runtime, and the train name and passenger name are given at the
 compile time. After compiling and executing the SeatReservation class, the method 
 of the SeatReservation class will show seat conformation or non-conformation on the
 basis of the train id given by the user.
 */
public class Q11 {

	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the passenger details");
		System.out.println("Enter the train name");
		String trainName = sc.next();
		System.out.println("Enter the passenger name");
		String passengerName = sc.next();
		TrainReservation trainReservation = new TrainReservation(trainName,
				passengerName);
		TrainReservation[] arr = new TrainReservation[10];
		for (int i = 0; i < arr.length; i++) {
			// TrainReservation trainReservation=new
			// TrainReservation(trainName,passengerName);
			arr[i] = trainReservation;
		}
		int Id = trainReservation.trainId;
		System.out.println(check(Id));

	}

	private static String check(int trainId) {
		System.out.println("please enter your train id");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		if (x == trainId) {
			return "seat is reserved";
		} else {
			return "unserved";
		}
	}
}

class TrainReservation {
	Random random = new Random();
	int trainId = random.nextInt();
	String trainName;
	String passengerName;

	public TrainReservation(String trainName, String passengerName) {
		super();
		System.out.println("your train Id number after booking is " + trainId);
		this.trainName = trainName;
		this.passengerName = passengerName;
	}

	public int getTrainId() {
		return trainId;
	}

	public void setTrainId(int trainId) {
		this.trainId = trainId;
	}

	public String getTrainName() {
		return trainName;
	}

	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}

	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String toString() {
		return "TrainReservation [trainId=" + trainId + ", trainName="
				+ trainName + ", passengerName=" + passengerName + "]";
	}

}