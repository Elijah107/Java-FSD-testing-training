package day2;

import java.util.Scanner;

public class CompoundArithmetic {

	public static void main(String[] args) {
		double  a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two values");
		a=sc.nextDouble();//20
		b=sc.nextDouble();//10
		a+=b;//a=a+b.....a=30
		System.out.println(a);
		a-=b;//a=a-b......a=30-10=20
		System.out.println(a);
		a*=b;//a=a*b......a=20*10=200
		System.out.println(a);
		a%=b;//a=a*b......a=200%10=0
		System.out.println(a);
		
	}

}
