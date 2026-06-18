package com.project;

import java.util.Scanner;


public class Loan {
	static Scanner sc = new Scanner(System.in);

	String getCustomerAddressDetails() {
		String address = null;
		System.out.println("Enter your Flat no");
		String fno = sc.nextLine();
		System.out.println("Enter your plot no");
		String plot = sc.nextLine();
		System.out.println("Enter your Street name");
		String street = sc.nextLine();
		System.out.println("Enter your city name");
		String city = sc.nextLine();
		System.out.println("Enter your PinCoad");
		long pincode = sc.nextLong();

		address = "Flat No : " + fno + " , Plot :" + plot + " , Street :" + street + " , city :"+city + " , Pin :" + pincode;

		return address;
	}

	public boolean isvalidPAN() {
		System.out.println("Enter your pan NO");
		String pan = sc.next();
		return pan.matches("[A-Z]{5}[0-9]{4}[A-Z]");
	}

	public boolean isvalidPhone() {
		System.out.println("Enter your phone NO");
		String phone = sc.next();
		return phone.matches("[6-9]\\d{9}");
	}

	public boolean isvalidAadhar() {
		System.out.println("Enter your 12 digits aadharNo");
		String aadhar = sc.next();
		return aadhar.matches("\\d{12}");
	}

	double getROI() {
		return 10.5;
	}

	int getCibliScore() {
		System.out.println("Enter Your CibliScore");
		int cs = sc.nextInt();
		return cs;
	}

	int getCustomerAge() {
		System.out.println("Enter Your Age");
		int Age = sc.nextInt();
		return Age;

	}

	double getCustomerSalary() {
		System.out.println("Enter your Salary");
		double salary = sc.nextDouble();
		return salary;
	}

	public static void main(String[] args) {
		System.out.println("welcome to SBI bank");

		Loan l = new Loan();
		int cibil = l.getCibliScore();
		double salary = l.getCustomerSalary();
		int age = l.getCustomerAge();

		if (cibil > 760 && salary > 100000.00 && age > 25 && l.isvalidAadhar() && l.isvalidPAN() && l.isvalidPhone()) {
			System.out.println("congratulations!! Your Loan got approved");
			System.out.println("Your loan ROI is:" + l.getROI());
			System.out.println("As Loan confirming your Details are:");
			System.out.println(l.getCustomerAddressDetails());
			
		} else {
			System.out.println("Sorry!! Your Loan got Rejected");
		}
		
	

	}

}
