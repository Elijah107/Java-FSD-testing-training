package assignment;

class Parent {
	void parentfunction() {
		System.out.println("This is parent class function");
	}
}

class Child extends Parent {
	void childclassfunctio() {
		System.out.println("This is child class function");
	}
}

public class SingleInheritanceQa {

	public static void main(String[] args) {
		Child obj = new Child();
		obj.childclassfunctio();
		obj.parentfunction();
	}
}
