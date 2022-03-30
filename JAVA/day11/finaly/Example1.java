//program where exception does not occur, but finaly block is executed
package finaly;

public class Example1 {

	public static void main(String[] args) {
		
		try
		{
			int data=25/5;
			System.out.println("data="+data);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block is always executed");
		}

		System.out.println("Rest of the code");
	}

}

