package assignment;

interface One {
	int a = 10;
	int b = 5;
	void sum();
	void multiplication();
}

class Normal implements One {
	public void sum() {
		System.out.println("Addition " + (a + b));
	}

	public void multiplication() {
		System.out.println("mul " + (a * b));
	}
}

class Q1BInterface {
	public static void main(String[] args) {
		One obj = new Normal();
		obj.sum();
		obj.multiplication();
	}
}
