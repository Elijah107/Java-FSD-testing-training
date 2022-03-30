package assignment;

import java.util.Scanner;

public class Q4CopyReverseArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of string array");
		int n=sc.nextInt();
		String []arr=new String[n];
		System.out.println("Enter the elements in the array");
		for(int i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		System.out.println("The array is");
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]);
		}
		System.out.println(" ");
		System.out.println("Reverse order ");
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}

}
