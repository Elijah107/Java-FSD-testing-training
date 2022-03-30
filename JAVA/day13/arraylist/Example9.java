package arraylist;

import java.util.ArrayList;

public class Example9 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();  
        System.out.println("Is ArrayList Empty: "+al.isEmpty());  //Checking the list is empty
        al.add("Ravi");  //adding elements  
        al.add("Vijay");    
        al.add("Ajay");    
        System.out.println("After Insertion");  
        System.out.println("Is ArrayList Empty: "+al.isEmpty()); 
  //checking the elements is empty ,it is not empty returns false.      
	}

}
