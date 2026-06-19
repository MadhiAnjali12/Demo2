package com.conditionalstatements;

import java.util.Scanner;

public class Age {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age:");
		int age = sc.nextInt();
		if (age < 6) {
			System.out.println("your a child");
		}

		else if (age < 13) {
			System.out.println("your a kid");
		} else if (age < 20) {
			System.out.println("your a teen");
		} else if (age < 36) {
			System.out.println("your a young");
		} else if (age < 60) {
			System.out.println("your a old");
		}

		else {
			System.out.println("your a old age ");

		}

		sc.close();

	}

}
