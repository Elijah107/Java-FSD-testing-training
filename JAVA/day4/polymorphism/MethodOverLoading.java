//BY CHANGING THE NUMBER OF ARGUMENTS

package polymorphism;

public class MethodOverLoading {
	static void add(int a, int b) {
		System.out.println(a + b);
	}

	static void add(int a, int b, int c) {
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		add(1, 2);
		add(23, 2, 34);
	}
}
