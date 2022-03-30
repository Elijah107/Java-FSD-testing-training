package arraylist;

import java.util.ArrayList;

public class Example3 {

	public static void main(String[] args) {
		ArrayList<String> sample=new ArrayList<String>();
		sample.add("honda");
		sample.add("skoda");
		sample.add("maruthi");
		sample.add("ferrari");
		//traversing the array list named sample through for each loop
		for(String car:sample)
		{
			System.out.println(car);
		}
	}

}
