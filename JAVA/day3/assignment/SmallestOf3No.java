package assignment;

import java.util.Scanner;

public class SmallestOf3No {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int a,b,c,small;
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		small=(a<b)?(a<c ?a:c):(b<c?b:c);
		System.out.println("The smallest number is "+small);
	}

}
/*checking whether  a<b and a<c and if it is true stored in a and false stored in c. IF tit is false
 checking b<c  */
