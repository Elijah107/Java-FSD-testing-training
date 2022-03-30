package assignment;

import java.util.Scanner;

public class Throws {

	
		int num1,num2,result;
		Scanner sc=new Scanner(System.in);
		void Division()throws ArithmeticException{
			System.out.println("enter two numbers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			result=num1/num2;
		System.out.println("result is : "+result);
		}
		public static void main(String[] args) {
			try {
				Throws obj=new Throws();
				obj.Division();
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}
			System.out.println("End of the programe");
		}

}
