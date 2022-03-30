package breakExamples;

public class Break1 {

	public static void main(String[] args) {
		// using for loop
		for (int i = 1; i <= 10; i++) {
			if (i == 5) {
				// breaking the loop
				break;//exit from the for loop
			}
			System.out.println(i);
		}
		System.out.println("End of the program");
	}
}
/*1,2,3,4,     */