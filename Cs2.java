package com.sangamone;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class cs2 {
	public static void main(String[] args) throws Exception {
		File f1 = new File("D:\\3-SangamOne\\2021\\Coding\\Java\\premium_dec2021.txt");
		Scanner sc = new Scanner(f1);
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> amount = new ArrayList<Integer>();
		ArrayList<String> duedate = new ArrayList<String>();
		while (sc.hasNextLine()){
			String[] line1 = sc.nextLine().split(",");
			names.add(line1[0]);
			amount.add(Integer.parseInt(line1[1]));
			duedate.add(line1[2]);
		}
		int len1 = names.size();
		String s1 = "Dear Customer ";
		String s2 = ", Your insurance premium payment of Rs ";
		String s3 = " is due on ";
		String s4 = ". Kindly pay to avoid discontinuation of service.";
		for (int i=0; i<len1; i++) {
			System.out.println(s1 + names.get(i)+ s2 +amount.get(i)+ s3 + duedate.get(i)+ s4);
		}
	}
}
