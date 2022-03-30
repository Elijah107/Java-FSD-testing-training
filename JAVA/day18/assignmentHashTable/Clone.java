package assignmentHashTable;

import java.util.Hashtable;

public class Clone {
	public static void main(String[] args) {
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();

		// Inserting elements into the table
		table.put(10, "1");
	table.put(15, "am");
		table.put(20, "from");
		table.put(25, "kerala");

		// Displaying the Hashtable
		System.out.println("Initial table is: " + table);
		// Displaying the cloned Hashtable using clone()
		System.out.println("The cloned table look like this: " + table.clone());
		
	}
}