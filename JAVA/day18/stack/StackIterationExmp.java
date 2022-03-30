package stack;

import java.util.Iterator;
import java.util.Stack;

public class StackIterationExmp {

	public static void main(String[] args) {
		Stack<String>stk=new Stack<>();//creating stack
		stk.push("BMW");//first element added
		stk.push("Audi");  
		stk.push("Ferrari");  
		stk.push("Bugatti");  
		stk.push("Jaguar");//last element added is the top most elemernt
		Iterator<String> iterator=stk.iterator();
		while(iterator.hasNext())  
		{  
		Object value= iterator.next();  
		System.out.println(value);   
		}    
		String temp=stk.peek();//to detect the top most element 
		System.out.println("The top elements is:"+temp);
		

	}

}
