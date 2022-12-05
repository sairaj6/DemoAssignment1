package com.methodoverloading.bean;

public class Bank {

	int getRateOfInterest(){return 0;}
	}

	class SBI extends Bank{
	int getRateOfInterest(){return 10;}
	}

	class ICICI extends Bank{
	int getRateOfInterest(){return 9;}
	}
	class AXIS extends Bank{
	int getRateOfInterest(){return 7;}
	
}