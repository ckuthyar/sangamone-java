package com.sangamone;

import java.util.ArrayList;


public class Cs1 {
	public static void main(String[] args) {
		ArrayList<String> friends = new ArrayList<String>();
		ArrayList<Integer> amount = new ArrayList<Integer>();
		ArrayList<String> duedate = new ArrayList<String>();
		friends.add("Asha");
		friends.add("Balu");
		friends.add("Chandra");
		friends.add("Dilip");
		friends.add("Eshwar");
		friends.add("Fabin");
		friends.add("Hemant");
		friends.add("Irene");
		friends.add("James");
		
		amount.add(5000);
		amount.add(5500);
		amount.add(6000);
		amount.add(6500);
		amount.add(7000);
		amount.add(7500);
		amount.add(8000);
		amount.add(8500);
		amount.add(9000);
		amount.add(9500);
		
		duedate.add("01-Dec-2021");
		duedate.add("02-Dec-2021");
		duedate.add("03-Dec-2021");
		duedate.add("04-Dec-2021");
		duedate.add("05-Dec-2021");
		duedate.add("06-Dec-2021");
		duedate.add("07-Dec-2021");
		duedate.add("08-Dec-2021");
		duedate.add("09-Dec-2021");
		duedate.add("10-Dec-2021");
		
		
		
		int len1 = friends.size();
		String s1= "Dear Friend ";
		String s2 =", You are required to pay the Insurance Premium of Rs ";
		String s3 =" before ";
				;
		
		for(int i=0; i<len1; i++) {
		System.out.println(s1+friends.get(i) + s2 + amount.get(i) + s3+ duedate.get(i));
		}
	}
}


