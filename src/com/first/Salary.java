package com.first;

public class Salary {
    Integer Salary = 5000;
    
    Double pf=5000 * 0.08;
    Double sal_pf= pf;
     
    Double gst= 5000* 0.06;
    Double sal_gst = gst;
    
    Double da=0.03;
    Double sal_da =5000 * 0.03;
    
    Double netsalary = 5000-sal_pf - sal_gst + sal_da;
    
    Double grossalary = netsalary*12;
     
    
    
          
    
    
	

	public static void main(String[] args) {
		
		
		 Salary s1 = new Salary();
	}
	{
		System.out.println(netsalary);
		System.out.println(grossalary);
	}

}
