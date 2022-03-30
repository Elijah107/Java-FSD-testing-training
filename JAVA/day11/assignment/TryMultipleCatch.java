package assignment;

public class TryMultipleCatch {

	public static void main(String[] args) {
		try {
		int [] arr=new int[6];
		System.out.println(arr[6]);
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		

	}

}
