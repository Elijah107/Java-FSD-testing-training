/* Write a program to use a Ternary operator and find the greatest of three numbers.*/
package assignment;

import java.util.Scanner;

public class GreatestOf3Num {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a,b,c;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		int temp=0,max=0;
		temp=a>b?a:b;//checking whether a>b,true a stored in temp
		max=c>temp?c:temp;
		System.out.println("The largest number is "+max);
	}

}
//(a>b)?(a>c)?a:c