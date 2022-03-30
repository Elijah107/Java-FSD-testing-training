package assignment;
import java.lang.*;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the string ");
		String s1=sc.next();
		System.out.println(" Enter the  character ");
		char  ch=sc.next().charAt(0);
		System.out.println("You have entered: "+ch);
		int count=0;
		  for(int i=0; i<s1.length(); i++)
		  {
		      if(s1.charAt(i) == ch)
		      count++;
		  }
		  System.out.println("The Character '"+ch+"' appears "+count+" times.");
		  

	}

}
