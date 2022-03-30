package assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Q3Names {

	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<String> name1 = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students");
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("enter the first name of the student :" + i );
			name.add(sc.next());
			System.out.println("enter the first name of the student :" + i);
			name1.add(sc.next());
		}
		for (int i = 0; i < n; i++) {
			System.out.println("full name" + (i + 1) + "::" + name.get(i) + " " + name1.get(i));
		}
		sc.close();
	}

}
