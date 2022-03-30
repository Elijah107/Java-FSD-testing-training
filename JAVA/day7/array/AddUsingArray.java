//to add the sum of array elements and store it in a resultant array
package array;

import java.util.Scanner;

public class AddUsingArray {

	public static void main(String[] args) {
		System.out.println("Enter the size of array");
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		//initialize array
		int [] arr1=new int [n];
		int []arr2=new int[n];
		int []arr3=new int[n];
		System.out.println("Entering the values for array 1");
		for(int i=0;i<n;i++) {
			arr1[i]=sc.nextInt();
			}
		System.out.println("Entering the values for array 2");
		for(int i=0;i<n;i++) {
			arr2[i]=sc.nextInt();
			}
		
		for(int i=0;i<n;i++) {
			arr3[i]=arr1[i]+arr2[i];
			}
		System.out.println("displying the sum");
		for(int i=0;i<n;i++) {
			System.out.print(arr3[i]+" ,");
			}
	}

}
