package day2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// 1 to n
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		do {
			System.out.println(i);
			i++;
		}while(i<=n);
		
//	N TO 1
		System.out.println("Enter the number");
		int no =sc.nextInt();
		do {
			System.out.println(no);
			no--;
		}while(no>=1);
	}

}
