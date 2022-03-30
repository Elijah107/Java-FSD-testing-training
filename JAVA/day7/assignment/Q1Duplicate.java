package assignment;

import java.util.Scanner;

public class Q1Duplicate {

	public static void main(String[] args) {
		System.out.println("Ener the number of integers we want to enter ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the number of elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("The array elements are");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println(" ");
		System.out.println("the duplicate elements are");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					System.out.println(arr[j]);
			}
		}
	}

}
