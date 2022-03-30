package assignmentStack;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Stack;

public class InbuiltMthd {
	static void pusher(Stack<Integer>stk,int n) {
		for(int i=1;i<n+1;i++) {
			int k=11*i;
			stk.push(k);
		}
		System.out.print("The stack is ");
		System.out.println(stk);
	}

	static void popper(Stack<Integer>stk,int n) {
		try{
			for(int i=0;i<n;i++) {
				System.out.println("popped out "+stk.pop());
			}
			
		}
		catch (EmptyStackException e) {
			System.out.println("Exp in Popper- Empty stack");  
		}
	}
	static void peekFinder(Stack<Integer>stk) {
		try{
			System.out.println("Peek elmnt is "+stk.peek());
			}
		catch (EmptyStackException e) {
			System.out.println("Exp in peekFinder- Empty stack");  
		}
	}

	static void srch(Stack<Integer>stk,int k) {
		int s=stk.search(k);
		if(s>-1) {
			System.out.println(k+" found at location "+s);
		}else {
			System.out.println(k+" not found :-(");
		}
	}
	static void empChck(Stack<Integer>stk) {
		if(stk.empty()==true) {
			System.out.println("Stack is empty  :-(");
		}
		else {
			System.out.println("Stack is not empty  :-)");
			System.out.println("Size of stack is "+stk.size());
		}
	}



	static void itr1(Stack<Integer>stk) {
		System.out.println("iterator()");
		Iterator<Integer>iterator = stk.iterator();  
		while(iterator.hasNext()) {
			Object values = iterator.next();  
			System.out.print(values+" "); 
		} 
		System.out.println();
	}
	static void itr2(Stack<Integer>stk) {
		System.out.println("forEach()");
		stk.forEach(n ->  
		{  
		System.out.print(n+" ");  
		}); 
		System.out.println();
	}

	static void itr3(Stack<Integer>stk) {
		System.out.println("listIterator()");
		ListIterator<Integer> ListIterator = stk.listIterator(stk.size());  
		while (ListIterator.hasPrevious())   
		{  
		Integer el = ListIterator.previous();  
		System.out.print(el+" ");  
		}  
		System.out.println();
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Stack<Integer>stk=new Stack<>();
		pusher(stk,4);
		popper(stk,1);
		empChck(stk);
		peekFinder(stk);
		popper(stk,4);
		empChck(stk);
		peekFinder(stk);
		//System.out.println(stk.elementAt(0)); 
		pusher(stk,3);
		srch(stk,44);
		srch(stk,33);
		
		System.out.println("Select the iteration method");
		System.out.println("1. iterator()");
		System.out.println("2. forEach()");
		System.out.println("3. listIterator()");
		System.out.println("4. All the abv three");
		int slc=sc.nextInt();
		switch(slc) {
		case 1:
			itr1(stk);
			break;
		case 2:
			itr2(stk);
			break;
		case 3:
			itr3(stk);
			break;
		case 4:
			itr1(stk);
			itr2(stk);
			itr3(stk);
			break;
		default:
			System.out.print("Invalid choice");
	}

}
}





