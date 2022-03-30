package assignment;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		System.out.println("Enter the number of employees");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("Enter the employee name,salary and joined year");
		String [] name=new String[n];
		int []salary=new int[n];
		int []year=new int[n];
		for(int i=0;i<n;i++) {
			name[i]=sc.next();
			salary[i]=sc.nextInt();
			year[i]=sc.nextInt();
		}
		System.out.println("The details entered are");
		for(int i=0;i<n;i++) {
			System.out.print("name: "+name[i]+" salary: "+salary[i]+" year: "+year[i]);
			System.out.println(" ");
		}
	}

}
