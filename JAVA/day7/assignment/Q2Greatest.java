package assignment;

import java.util.Scanner;

public class Q2Greatest {

	public static void main(String[] args) {
		System.out.println("Ener the number of integers we want to enter ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int max = arr[0];// initialize max with the first array element
		System.out.println("Enter the number of elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array elements are");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println(" ");

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Greatest element present in given array: " + max);
	}

}
