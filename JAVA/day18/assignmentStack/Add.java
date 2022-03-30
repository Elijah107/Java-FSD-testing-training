package assignmentStack;

import java.util.Stack;

public class Add {

	public static void main(String[] args) {
		Stack <Character>stk=new Stack <Character>();
		stk.add('S');
		stk.add('w');
		stk.add('a');
		stk.add('t');
		System.out.println("The first element: "+stk.firstElement());
		System.out.println("Contain Character P:  "+stk.contains('P'));
		System.out.println("Character in 2 nd index:  "+stk.get(2));
		System.out.println(stk.set(1,'P'));
		System.out.println("setting index at 1 is P  "+stk);
		System.out.println("The stsck size: "+stk.size());
		System.out.println("The stsck is empty : "+stk.empty());
		
	}

}
