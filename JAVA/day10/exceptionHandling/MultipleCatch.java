package exceptionHandling;

public class MultipleCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int[] arr1=new int[5];
			System.out.println(arr1[10]);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("The array element cannot be accessed because it's index is greater than the size");
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
