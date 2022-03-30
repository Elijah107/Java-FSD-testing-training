package assignmentStack;

import java.util.Stack;

public class OperationOnStack {

	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		 // Use add() method to add elements in the Stack
        stack.add("name");
        stack.add("is");
        stack.add("swathi");
       // Displaying the Stack
        System.out.println("The Stack is: " + stack);
        //
        System.out.println("The  occurrence of swathi  at index: "+ stack.indexOf("swathi"));
     // Clearing the Stack using clear() method
        stack.clear();
 // Displaying the final Stack after clearing;
        System.out.println("The final Stack: " + stack);

	}

}
