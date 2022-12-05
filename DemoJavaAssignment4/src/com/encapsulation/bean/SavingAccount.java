package com.encapsulation.bean;

public class SavingAccount {
	/*
	 * A bank has two kinds of accounts, savings and fixed deposit. The interest
	 * rates for these are 4% and 11%respectively. Customer account interest
	 * needs to be implemented. Implement a solution to print the interest on
	 * the basis of principle, time, & rate given by the user. Design an
	 * appropriate class and method to implement this.
	 */
	private double principle;
	private int timeinYear;
	private double rate = 0.11;

	public SavingAccount() {

	}

	public String getInterestRate() {
		return "4%";
	}

	public double getPrinciple() {
		return principle;
	}

	public void setPrinciple(double principle) {
		this.principle = principle;
	}

	public int getTimeinYear() {
		return timeinYear;
	}

	public void setTimeinYear(int timeinYear) {
		this.timeinYear = timeinYear;
	}

	public double getRate() {
		return rate;
	}

}
