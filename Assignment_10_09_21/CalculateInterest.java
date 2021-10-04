package com.yash.array_interface;

import java.util.Scanner;

interface InterestParameter{

	public void calculateInterest();
}


public abstract class CalculateInterest implements InterestParameter{
	public static void calculateInterest(float principalAmount, float interestRate, int time) {
		float si=((principalAmount * interestRate * time)/100);
		float ci=(float) (principalAmount*(Math.pow(1+interestRate/100,time)));
		
		System.out.println("Simple Interest= "+si);
		System.out.println("Compound Interest= "+ci);

	}
	public static void main(String[] args) {
	      Scanner sc=new Scanner(System.in);
	      System.out.println("-------CalculateInterest--------");
	      System.out.print("Enter Principal Amount: ");
	      float principalAmount=sc.nextFloat();
	      System.out.print("Enter Interest Rate: ");
	      float interestRate=sc.nextFloat();
	      System.out.print("Enter Time period: ");
	      int time=sc.nextInt();
	      System.out.println("--------------------------------");
	      calculateInterest(principalAmount,interestRate,time);
	      sc.close();
	}
	
}
