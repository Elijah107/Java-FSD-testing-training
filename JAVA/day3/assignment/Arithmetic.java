/*.Write a Java Program to initalise two variables and perform all the Arithmetic operations
 on them and dsiplay their result.*/
package assignment;

import java.util.Scanner;

public class Arithmetic {

	public static void main(String[] args) {
		double  a,b,c;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=a+b;
		System.out.println("The sum of two numbers is "+c);
		c=a-b;
		System.out.println("The difference of two numbers is "+c);
		c=a*b;
		System.out.println("The multiplication  of two numbers is "+c);
		c=a/b;
		System.out.println("The division of two numbers is "+c);
		c=a%b;
		System.out.println("The remainder is "+c);
	}

}
