package assignment;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to ckeck strong number or not");
		int number,fact,sum=0,n;/*Declaring variables to store the values of factorial,sum
		 						and storing the copy of given number*/
		number=sc.nextInt();
		n=number;//making copy of the original number,so changes do not affect
		while(n!=0) {//while the given number is not zero it enters to the loop
			fact=1;
			int rem=n%10;//Extracting the last digit from the number
			//calculating the factorial of the last digit
			for(int i=rem;i>=1;i--) {
				fact=fact*i;//find the factorial of the last digit
				}
			sum=sum+fact;//storing the sum of factorial and all digits of the number
			n=n/10;//removing the last digit
		}
		if(sum==number)System.out.println("Strong number");
		else System.out.println("Number is not a strong number");
		
	}

}
