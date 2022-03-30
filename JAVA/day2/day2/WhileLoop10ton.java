package day2;

import java.util.Scanner;

public class WhileLoop10ton {

	public static void main(String[] args) {
		int i = 10;
		while (i >= 1) {
			System.out.println(i);
			i--;
		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for i");
		i=sc.nextInt();
		while(i>=1) {
			System.out.println(i);
			i--;
			}

	}

}
