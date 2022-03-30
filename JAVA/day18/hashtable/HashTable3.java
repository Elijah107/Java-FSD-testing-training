package hashtable;

import java.util.Hashtable;

public class HashTable3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> m=new Hashtable<Integer,String>();          
	     m.put(100,"Amit");    
	     m.put(102,"Ravi");   
	     m.put(101,"Vijay");    
	     m.put(103,"Rahul");    
	     //Here, we specify the if and else statement as arguments of the method  
	     System.out.println(m.getOrDefault(101, "Not Found"));  
	     System.out.println(m.getOrDefault(105, "Element is not present"));  
	}

}
