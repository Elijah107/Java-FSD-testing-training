package assignmentHashTable;

import java.util.Hashtable;

public class ContainsValue {

	public static void main(String[] args) {
		 // Creating an empty Hashtable
        Hashtable<Integer, String> hash_table = 
        new Hashtable<Integer, String>();
  
        // Putting values in the table
        hash_table.put(10, "my");
        hash_table.put(15, "name");
        hash_table.put(20, "is");
        hash_table.put(25, "swathi");
       
        // Displaying the Hashtable
        System.out.println("Initial Table is: " + hash_table);
  
        // Checking for the Value 'Geeks'
        System.out.println("Is the value 'swathi' present? " + 
        hash_table.containsValue("swathi"));
  
        // Checking for the Value 'World'
        System.out.println("Is the value 'World' present? " + 
        hash_table.containsValue("World"));

	}

}
