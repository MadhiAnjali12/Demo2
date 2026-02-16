package com.first;

public class TestDemo {
static	int a = 0;
	
	
	{
	a=a+1;
	}

	public static void main(String[] args) {
	TestDemo t = new TestDemo();
		
	
		TestDemo t2 = new TestDemo();		
        
		TestDemo t3 = new TestDemo();
		TestDemo t4 = new TestDemo();
		TestDemo t5 = new TestDemo();
		
		System.out.println(a);
	}

}
