package day2;

import java.util.Scanner;

public class SwitchExample {

	public static void main(String[] args) {
		System.out.println("PLease enter a number:");
		System.out.println("1.Monday,2.Tuesday,3.Wednesday,4.Thursday,5.Friday");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		switch(a) {
		case 1:System.out.println("Today is monday");break;
		case 2:System.out.println("Today is Tuesday");break;
		case 3:System.out.println("Today is wednesday");break;
		case 4:System.out.println("Today is thursday");break;
		case 5:System.out.println("Today is friday");break;
		default: System.out.println("Invalid Input");
		break;	
		
		}
		
	}

}







