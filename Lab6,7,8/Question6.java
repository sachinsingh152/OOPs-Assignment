package com.assignmentclass;

import java.util.Scanner;

public class Question6 {
	static String Model_of_category(String x) {
		switch (x.toUpperCase()) {
		case "SUV":
			return "TATA SAFARI";
		case "SEDAN":
			return "TATA INDIGO";
		case "ECONOMY":
			return "TATA INDICA";
		case "MINI":
			return "TATA NANO";
		default:
			return "INVALID";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter one of them : SUV,SEDAN,ECONOMY,MINI:");
		String x = sc.next();
		String y = Model_of_category(x);
		System.out.println("The required category is :" + y);
		sc.close();
	}

}
