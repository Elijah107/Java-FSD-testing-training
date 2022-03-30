
package day2;

import java.util.Scanner;

public class IfElseLadder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter two numbers");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		if(a==b) System.out.println( a+"  is equal to  "+b);
		else if(b==c) System.out.println( b+"  is equal to  "+c);
		else if(a==c) System.out.println( a+"  is equal to  "+c);
		else System.out.println("none of the numbers are equal");
		}
}
