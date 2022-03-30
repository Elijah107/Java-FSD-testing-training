package assignmentHashTable;

import java.util.Hashtable;

public class HashTableSize {

	public static void main(String[] args) {
		// Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = 
        new Hashtable<Integer, String>();
  
        // Inserting elements into the table
        hash_table.put(10, "1");
        hash_table.put(15, "am");
        hash_table.put(20, "from");
        hash_table.put(25, "kerala");
      
  
        // Displaying the Hashtable
        System.out.println("Initial table is: " + hash_table);
  
        // Displaying the size of the table
        System.out.println("The size of the table is " + 
        hash_table.size());

	}

}
