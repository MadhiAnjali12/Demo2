package com.Arrays;

import java.util.*;

public class DecimaltoBinary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the decimal number");
		int num = sc.nextInt();
		
		int binary= 0;
		int place = 1;
		
		while(num>0) {
			int rem= num%2;
			binary=binary+(rem*place);
			place=place*10;
			num=num/2;
		}
		
	
         System.out.println(binary);
         sc.close();
	}

}
