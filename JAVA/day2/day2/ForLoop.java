package day2;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// PROGRAMM FOR 1 TO 10
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		//PROGRAMME FOR 10 TO 1
		for(int i=10;i>=1;i--) {
			System.out.println(i);
		}
		//PRIGRAMME FOR 1 TO N
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the number");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++ ) {
			System.out.println(i);
		}
		for (int i=n;i>=1;i--) {
			System.out.println(i);
		}
	}

}
