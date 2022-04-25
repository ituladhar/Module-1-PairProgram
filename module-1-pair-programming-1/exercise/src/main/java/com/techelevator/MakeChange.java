package com.techelevator;

import java.util.DoubleSummaryStatistics;
import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
double amountBill,tenderAmount;
		System.out.println("Please enter the amount of the bill");
		amountBill=sc.nextDouble();
		System.out.println("Please enter the amount tender");
		tenderAmount=sc.nextDouble();
		System.out.println();
		double makeChange=tenderAmount-amountBill;
		System.out.println("The change required is "+makeChange);
	}}