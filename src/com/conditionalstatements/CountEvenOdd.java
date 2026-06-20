package com.conditionalstatements;


public class CountEvenOdd {

	public static void main(String[] args) {
		
		int Sum=0;
		int count=0;
		int sum1=0;
		int count1=0;
		
	for(int i=0; i<50; i++) {
		if(i%2==0) {
		
			Sum = Sum+ i;
			count++;
		}else {
			sum1=sum1+i;
			count1++;
			
			
		}
	}
	 System.out.println("Sum of Even:"+Sum);
	 System.out.println("count of even"+count);
	 System.out.println("Sum of Odd:"+sum1);
	 System.out.println("count of odd"+count1);
		
	}

}
