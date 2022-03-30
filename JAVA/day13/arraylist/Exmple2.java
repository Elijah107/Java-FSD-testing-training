package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class Exmple2 {

	public static void main(String[] args) {
		ArrayList<String> sample=new ArrayList<String>();//create arraylist-sample
		sample.add("honda");//adding elements in to array list
		sample.add("skoda");
		sample.add("maruthi");
		sample.add("ferrari");
		//Traversing the list through iterator
		Iterator itr=sample.iterator();//getting iterator
		while(itr.hasNext())//checking the iterator has elements
		{
			System.out.println(itr.next());//printing the elements and move to next
		}

	}

}
