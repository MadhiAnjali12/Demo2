package com.first;

public class Claculation {
	static String Board ;
	   String playername;
	   int jersynumber;
	   int age;
	   int highestscore;
	   int players;
		

	public static void main(String[] args) {
		Board = "team";
		
		Claculation msd = new Claculation();
		msd.playername="virat";
		msd.jersynumber=18;
		msd.age=36;		
		
		
		
		System.out.println(Board);

		System.out.println("player name:" +msd.playername);
		System.out.println("jersynumber:" +msd.jersynumber);
		System.out.println("age" + msd.age);
		
		

	}

}
