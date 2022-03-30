package assignment;

import java.util.Scanner;

public class Q3occurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ener the number of integers we want to enter ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter the number of elements");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the integer to find out the occurance");
		int element = sc.nextInt();
		int occur = 0;// initialize occurence as zero
		System.out.println("The array elements are");
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println(" ");

		for (int i = 0; i < n; i++) {
			if (element == arr[i]) {
				occur++;
			}
		}
		System.out.println("The occurence of the element " + element + " in the array is : " + occur);

	}

}
