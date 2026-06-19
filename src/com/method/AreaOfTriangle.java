package com.method;

import java.util.Scanner;

public class AreaOfTriangle {

	public static void main(String[] args) {
		System.out.println("main method started");
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the base");
		double base = sc.nextDouble();

		System.out.println("enter the height");
		double height = sc.nextDouble();

		System.out.println(Triangle(base, height));
		sc.close();

	}

	static double Triangle(double b, double h) {
		double artri = 0.5 * b * h;
		return artri;
	}

}
