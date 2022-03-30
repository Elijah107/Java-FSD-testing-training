package assignment;


import java.util.Scanner;

public class TryCatch {
	public static void main(String [] args) {

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a keyboard input");
	try {
	double num = sc.nextDouble();
	System.out.println(num);
	}
	catch(Exception e) {
		System.out.println(e);
	}
	}
}