package assignment;

public class NestedTryCatchBlock {

	public static void main(String[] args) {
		try {
			try {
				int b = 30 / 0;
				System.out.println(b);
			} catch (ArithmeticException e) {
				System.out.println(e);
			}
			int a[] = new int[5];
			a[15] = 4;
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
