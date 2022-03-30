package assignment;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		int i, n, count = 0;
		System.out.println("Enter the array limit");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		String [] arr=new String[n];
		String [] arr1=new String[n];
		System.out.println("Enter the values in array");
		for(i=0;i<n;i++) {
			arr[i]=sc.next();
		}
		for(i=0;i<n;i++) {
			arr1[i]=arr[n-i-1];
		}
		System.out.println("Reversed value inside array");
		for(i=0;i<n;i++) {
			System.out.print(arr1[i]+"\t");
		}
	}

}
