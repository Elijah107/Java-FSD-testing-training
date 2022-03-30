package assignment;

public class Finally {

	public static void main(String[] args) {
		try {
			String str=null;
			System.out.println(str.length());
			int a=5/0;
		}
		catch(ArithmeticException|NullPointerException e) {
			System.out.println(e);
		}
finally {
	System.out.println("Finally Block Is called");
}
	}

}
