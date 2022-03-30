//User input as size,and array elements
package array;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value for array size");
		int size=sc.nextInt();
		int[]arr=new int[size];
		System.out.println("Entering the elenents of the array");
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("The entered elements are");
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]);
		}
	}

}
