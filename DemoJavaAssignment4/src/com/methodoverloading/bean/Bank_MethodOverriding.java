package com.methodoverloading.bean;

import com.methodoverloading.bean.AXIS;
import com.methodoverloading.bean.ICICI;
import com.methodoverloading.bean.SBI;

public class Bank_MethodOverriding {

	/*
	 * Write a java program to perform the concept of method
       overriding for calculatingsimple interest of 3 banks A,B,C. using dynamic method dispatch
       Bank A’s rate of interest-10%, Bank’s B rate of interest-9%, Bank’C rate of interest -7%
	 */
	public static void main(String[] args) {
		
		SBI s=new SBI();
		ICICI i=new ICICI();
		AXIS a=new AXIS();
		System.out.println("SBI Rate of Interest: "+s.getRateOfInterest());
		System.out.println("ICICI Rate of Interest: "+i.getRateOfInterest());
		System.out.println("AXIS Rate of Interest: "+a.getRateOfInterest());
	}

}
