package assignment;

class First {
	void disply() {
		System.out.println("This is class first function ");
	}
}

class Second extends First {
	void disply() {
		System.out.println("This is class second disply function ");
	}
}

class Third extends First {
	void disply() {
		System.out.println("This is class Third disply function ");
	}
}

public class RunTimePolymorphism2 {

	public static void main(String[] args) {
		First t = new Third();// third class object is created-..upcasting
		t.disply();
		// child class method override the parent class--sub class method is invoked in
		// run time
		
		t = new First();
		t.disply();
		t = new Second();
		t.disply();

	}

}
