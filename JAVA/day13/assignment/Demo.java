package assignment;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ArrayList<String> al=new ArrayList<String>();
		 ArrayList<String> al1=new ArrayList<String>();
		    Scanner ac=new Scanner(System.in);
		    while(true) {
		    	System.out.println("enter first name");
		    al.add(ac.next());
		    System.out.println("enter last name");
		    al1.add(ac.next());
		    
		    Iterator itr=al.iterator();
		    Iterator itr1=al1.iterator();
		    
		    
		    while(itr.hasNext()&& itr1.hasNext())
		    {
		    	  System.out.println("the combined name is");
		        System.out.println(itr.next()+" "+itr1.next());
		        
		    }
		       
		   
		    }
	}

}
