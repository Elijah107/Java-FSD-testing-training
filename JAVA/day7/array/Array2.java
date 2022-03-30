package array;

import java.util.Scanner;

public class Array2 {

	public static void main(String[] args) {
		int[] arr=new int[10];
		System.out.println("Enter the ten values");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The entered values are");
		for(int i=0;i<10;i++) {
			System.out.print(arr[i]+" ,");
		}
	}

}
