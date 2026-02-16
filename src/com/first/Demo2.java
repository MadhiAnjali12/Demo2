package com.first;

public class Demo2 {
	 static int a = 3;

	static {
		System.out.println("method3 called");
	}
	static {
		System.out.println("method4 called");
	}
	 static Demo2 t = new Demo2();

	public static void main(String[] args) {
		System.out.println("main method started");
	}
	

	{
		System.out.println(a);

	}
	{

		System.out.println(t.a);
	}
	

}
