package dequeExample;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeMethods {

	public static void main(String[] args) {
		//Declare Deque object 
        Deque<String> d = new LinkedList<String>();
        d.add("One");           //add ()--adding element through tail
        d.addFirst("Two");      //addFirst ()---adding first element
        d.addLast("Three");     //addLast ()----adding last element
        d.push("Four");         //push ()---push the element in to the queue 
        d.offer("Five");        //offer ()----add given element as tail
        d.offerFirst("Six");    //offerFirst ()----insert given element through head
        d.offerLast("Seven");   //offerLast ()-----insert given element through tail
        System.out.println("Initial Deque:");
        System.out.print(d + " "); 
     // Iterate using standard iterator
        System.out.println("\n\nDeque contents using Standard Iterator:"); 
        Iterator iterator = d.iterator(); 
        while (iterator.hasNext()) 
            System.out.print(" " + iterator.next()); 
        
       // Iterate using Reverse order iterator 
        Iterator reverse = d.descendingIterator(); 
        System.out.println("\n\nDeque contents using Reverse Iterator:"); 
        while (reverse.hasNext()) 
            System.out.print(" " + reverse.next()); 
          
        // Peek () method
        System.out.println("\n\nDeque Peek:" + d.peek()); 
        System.out.println("\nDeque,After peek:" + d); 
        
         // Pop () method 
        System.out.println("\nDeque Pop:" + d.pop()); 
        System.out.println("\nDeque,After pop:" + d); 
   
        // contains () method
        System.out.println("\nDeque Contains Three: " +  d.contains("Three")); 
   
        d.removeFirst();        //removeFirst () 
        d.removeLast();         //removeLast ()
        System.out.println("\nDeque, after removing "  + "first and last elements: " + d);
        //size()
        System.out.println("Size of the queue is: "+d.size());
        
	}

}
