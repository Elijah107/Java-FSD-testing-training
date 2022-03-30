package day2;

import java.util.Scanner;

public class IfExample {

	public static void main(String[] args) {
		System.out.println("Start programe");
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		if(a==b) {
			System.out.println(a+" is equal to "+b );
		}
		else 
			System.out.println(a+" is not equal to "+b);
		}

}
