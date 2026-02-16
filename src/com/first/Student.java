package com.first;

public class Student {
	
	 static String collegename;
	 static int collegeid;
	String sname;
	int sid;

	public static void main(String[] args) {
		collegename="mlr";
				collegeid=666;
		
		Student s1 = new Student();
		s1.sname = "anjali";
		s1.sid=11;
		System.out.println("sname:"  +   s1.sname);
		System.out.println("sid:" + s1.sid);
		System.out.println("collegename:" + s1.collegename);
		System.out.println("collegeid:" + s1.collegeid);
		
		
		

	}

}
