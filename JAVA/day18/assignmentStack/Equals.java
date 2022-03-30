package assignmentStack;

import java.util.Stack;

public class Equals {

	public static void main(String[] args) {
		
		 Stack<String> stack1 = new Stack<String>();
		  
	        // Use add() method to add elements in the Stack
	        stack1.add("name");
	        stack1.add("is");
	        stack1.add("swathi");
	        Stack<String> stack2 = new Stack<String>();
			  
	        // Use add() method to add elements in the Stack
	        stack2.add("name");
	        stack2.add("is");
	        stack2.add("swathi");
	        System.out.println("Are both of them equal? " + stack1.equals(stack2));
	        //CONTAINSALL
	        System.out.println("\nDoes stack 1 contains stack 2: "+ stack1.containsAll(stack2));
	  
	        
	  
	}

}
