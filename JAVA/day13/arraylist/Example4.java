package arraylist;

import java.util.ArrayList;

public class Example4 {

	public static void main(String[] args) {
		ArrayList<String> sample=new ArrayList<String>();
		sample.add("honda");//0
		sample.add("skoda");//1
		sample.add("maruthi");//2
		sample.add("ferrari");//3
		System.out.println("arraylist");
		System.out.println(sample);
		System.out.println("The element in the 3 rd index");
		System.out.println(sample.get(3));//getting the arraylist element in 3 index--Ferrari
		sample.set(2,"Renault");//changing the element in the 2 index
		System.out.println("the arraylist after changing 2 nd index");
		for(String car:sample)
		{
			System.out.println(car);
		}

	}

}
