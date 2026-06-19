package com.conditionalstatements;

import java.util.Scanner;

public class Marks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enther your marks");
		float marks = sc.nextFloat();

		if (marks > 90) {
			System.out.println("grade A");
		}
		else if (marks >= 80) {
			System.out.println("Grade B");

		} else if (marks >= 70) {
			System.out.println("Grade C");
		}

		else if (marks >= 60) {
			System.out.println("Grade D");

		} else if (marks > 100 || marks < 0) {
			System.out.println("invalid");

		} else if (marks >= 35) {
			System.out.println("just passed");

		} else {
			System.out.println("fail");
		}
		sc.close();

	}

}
