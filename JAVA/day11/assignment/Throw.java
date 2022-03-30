package assignment;

import java.util.Scanner;

public class Throw {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num1,num2,result;
		System.out.println("Enter two numbers");
		num1=sc.nextInt();
		num2=sc.nextInt();
		try {
			if(num2==0) 
				throw new ArithmeticException("Division by zero is not possible");
			result=num1/num2;
			System.out.println("the reult is: "+result);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("End of the programme");

	}

}
