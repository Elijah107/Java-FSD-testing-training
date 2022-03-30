package assignment;

import java.util.Scanner;

public class DuckNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check duck no or not");
		int n = sc.nextInt();
		int a = 0;
		while (n != 0) {
			if (n % 10 == 0) {// checking the last digit of the number is zero or not
				a++;
			}
			n = n / 10;// divide by 10 to remove last digit
		}
		if (a > 0)
			System.out.println("Number is duck number");
		else
			System.out.println("Number is not duck number");
	}

}
