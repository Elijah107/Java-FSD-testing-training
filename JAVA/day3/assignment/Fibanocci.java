package assignment;

import java.util.Scanner;

public class Fibanocci {//0,1,1,2,3,5.....

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number=sc.nextInt();
		int n1=0,n2=1,sum,count=1;
		while(count<=number) {
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;//swapping
			count++;
		}
				
			
		}
		
	}


