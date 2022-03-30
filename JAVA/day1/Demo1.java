package day1;

import java.util.Scanner;

public class Demo1 {
	static int samp = 5;// global variable (class variable)

	public static void main(String[] args) {
		double a, b, c;
		Scanner s = new Scanner(System.in);
		System.out.println("enter the first value");
		a = s.nextDouble();
		System.out.println("enter the Second value");
		b = s.nextDouble();
		c = a + b;
		System.out.println("sum=" + c);
		showsample();
	}

	public static void showsample() {
		int x = 15;// local variable inside the method
		System.out.print(x);
		System.out.println(samp);
		// System.out.println(a); getting error because a is a local variable
	}
}
