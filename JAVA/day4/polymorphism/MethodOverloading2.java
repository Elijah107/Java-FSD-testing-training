// BY CHANGING THE TYPE OF ARGUMENTS

package polymorphism;

public class MethodOverloading2 {
	static void add(int a, int b){
		System.out.println(a+b);
	}
	static void add(int a, double b){
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		add(5,3);
		add(10,42.5);
	}

}
