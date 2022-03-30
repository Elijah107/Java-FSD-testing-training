package assignment;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		int n, rem, sum = 0, original;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check the palindrome");
		n = sc.nextInt();
		original = n;
		while (n > 0) {
			rem = n % 10;// getting the remainder
			sum = (sum * 10) + rem;
			n = n / 10;// removing the last digit
		}
		if (sum == original)
			System.out.println("The number is palindrome");
		else
			System.out.println("The number is not palindrome");
	}

}
