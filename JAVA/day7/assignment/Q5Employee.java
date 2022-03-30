package assignment;

import java.util.Scanner;

public class Q5Employee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of employee");
		String name=sc.next();
		System.out.println("Enter the year of joining");
		int Year=sc.nextInt();
		System.out.println("Enter the salary");
		int salary=sc.nextInt();
		System.out.println("The employee name is "+name+" joined on the year "+Year+" having the salary "+ salary);
		
	}

}
