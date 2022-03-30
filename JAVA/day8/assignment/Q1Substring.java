package assignment;

import java.util.Scanner;

public class Q1Substring {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first string");
		String s1 = sc.nextLine();
		System.out.println("Enter the second string");
		String s2 = sc.nextLine();
		System.out.println("The entered strings are " + s1 + "  , " + s2);
		boolean result= containsString(s1,s2);
		System.out.println(result);
		
	}
	static boolean containsString(String s1 , String s2) {
		boolean result=false;
		result = s1.contains(s2);
		return result;
	}

}
