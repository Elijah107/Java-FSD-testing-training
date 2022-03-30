package day1;

public class DataType {
	static int var= 14;// instance variable global variable

	public static void main(String[] args) {
		int a = 25;//These are local variables.accessed inside the method
		double b = 3.2225;
		char c = 'z';
		boolean temp = true;
		String s = "Example";
		sample();

	}

	public static void sample() {
		System.out.print(var);
	}
}


