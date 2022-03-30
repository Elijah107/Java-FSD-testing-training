package assignmentStack;

import java.util.Stack;

public class Capacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // Creating an empty Stack
        Stack<String> stack = new Stack<String>();
  
        // Use add() method to add elements in the Stack
        stack.add("name");
        stack.add("is");
        stack.add("swathi");
       
  
        // Displaying the Stack
        System.out.println("The Stack is: " + stack);
  
        // checking capacity
        System.out.println("Capacity: "+ stack.capacity());
        System.out.println("The element is: "+ stack.elementAt(2));
	}//display the current capacity of the vector

}
