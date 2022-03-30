package polymorphism;

class School {
	int students_no = 300;
}

class Computers_class extends School {
	int students_no = 45;
}

public class MethodOverriding {

	public static void main(String[] args) {
		School s=new Computers_class();//UPCASTING
		System.out.println(s.students_no);// 300 (data members cannot be overriden)
		}

}
