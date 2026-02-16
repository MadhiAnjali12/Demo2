package com.first;

public class StateBankOfIndia {
	static int accountno = 1230 ;
	String username;
	int phoneno;
	int balance;
	{
		accountno = accountno + 1;
	}
	

	public static void main(String[] args) {
		StateBankOfIndia st = new StateBankOfIndia();
		st.username = "anjali";
		st.phoneno = 4567887;
		st.balance= 1000;
		System.out.println("username:" +st.username);
		System.out.println("accountno:" + accountno);
		System.out.println("phoneno:" +st.phoneno);
		
		
		
		StateBankOfIndia st1 = new StateBankOfIndia();
		st1.username = "archana";
		st1.phoneno = 152687;
		st1.balance= 1030;
		System.out.println("username:" +st1.username);
		System.out.println("accountno:" + accountno);
		System.out.println("phoneno:" +st1.phoneno);
		
		
		
		
		

	}

}
