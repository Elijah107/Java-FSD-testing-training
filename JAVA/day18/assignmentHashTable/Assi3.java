package assignmentHashTable;

import java.util.Hashtable;

public class Assi3 {

	public static void main(String[] args) {
		Hashtable<Integer,String> map=new Hashtable<Integer,String>();        
	    map.put(100,"swathi");    
	    map.put(102,"athu");   
	    map.put(101,"salu");    
	    map.put(103,"Rahul");    
	    System.out.println("Before remove: "+ map);   
	    // Remove value for key 102  
	    map.remove(102);  
	    System.out.println("After remove: "+ map);  
	    //checking empty or not
	    System.out.println("map is empty? "+map.isEmpty());
	    //Here, we specify the if and else statement as arguments of the method  
	    System.out.println(map.getOrDefault(101, "Not Found"));  
	    System.out.println(map.getOrDefault(105, "Not Found")); 
	    //Inserts, as the specified pair is unique  
	    map.putIfAbsent(102,"sony");  
	    System.out.println("Updated Map: "+map);  
	    //Returns the current value, as the specified pair already exist  
	    map.putIfAbsent(101,"swarg");  
	    System.out.println("Updated Map: "+map);
	    //Replace the value at key 100
	    map.replace(100,"Karthi");
	    System.out.println("Updated Map: "+map);
	    //Checking values in map
	    System.out.println("swarg in map? "+map.contains("swarg"));
	    System.out.println("sony in map? "+map.contains("sony"));
	    //Checking key in map and getting the value
	    if(map.containsKey(101)==true) {
	    	System.out.println("Vlaue of key 101 is "+map.get(101));
	    }
	    //printing all values in map
	    System.out.println(map.values());
	    if(map.replace(103,"rahul","Raju")==true) {
	    	System.out.println("Replaced Rahul...");
	    	System.out.println("Updated Map: "+map);
	    }
	    

	}

}
