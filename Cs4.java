package com.sangamone;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Cs4 {
	static void merging(String file1, String file2, String file3) throws Exception {
		File f1 = new File(file1);
		File f2 = new File(file2);
		File f3 = new File(file3);
		Scanner sc1 = new Scanner(f1);
		Scanner sc2 = new Scanner(f2);
		FileWriter fw = new FileWriter(f3);
		ArrayList<String> names = new ArrayList<String>();
		ArrayList<Integer> amount = new ArrayList<Integer>();
		ArrayList<String> duedate = new ArrayList<String>();
		while (sc1.hasNextLine()){
			String[] line1 =sc1.nextLine().split(",");
			names.add(line1[0]);
			amount.add(Integer.parseInt(line1[1]));
			duedate.add(line1[2]);
		}
		String temp1 = sc2.nextLine();
		int pos1 = temp1.indexOf("$1");
		int pos2 = temp1.indexOf("$2");
		int pos3 = temp1.indexOf("$3");
		String s1 = temp1.substring(0, pos1);
		String s2 = temp1.substring(pos1+2,pos2);
		String s3 = temp1.substring(pos2+2,pos3);
		String s4 = temp1.substring(pos3+2);
		String info="";
		int len1 = names.size();
		for(int i=0; i<len1; i++) {
			info=s1+ names.get(i) + s2 + amount.get(i) + s3 + duedate.get(i) + s4;
			fw.write(info);
			System.out.println(info);
			fw.write("\n");
		}
		sc1.close();
		sc2.close();
		fw.close();
		
		
	}
	public static void main(String[] args) throws Exception{
		merging("D:\\3-SangamOne\\2021\\Coding\\Java\\premium_dec2021.txt", "D:\\3-SangamOne\\2021\\Coding\\Java\\premium_format1.txt", "D:\\3-SangamOne\\2021\\Coding\\Java\\premium_dec2021_output.txt");
		System.out.println();
		merging("D:\\3-SangamOne\\2021\\Coding\\Java\\premium_dec2021.txt", "D:\\3-SangamOne\\2021\\Coding\\Java\\premium_format1.txt", "D:\\3-SangamOne\\2021\\Coding\\Java\\premium_dec2021_output.txt");
		
	}

}
