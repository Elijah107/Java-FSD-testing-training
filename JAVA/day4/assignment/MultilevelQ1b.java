package assignment;

class School{
	void mark() {
		System.out.println("All the students mark is in notice board");
	}
}
class Teacher extends School{
	void total() {
		System.out.println("There is 25 teachers in school ");
	} 
}
class Student extends Teacher{
	void number() {
		System.out.println("There is 1000 number of students in school");
	}
}
public class MultilevelQ1b {

	public static void main(String[] args) {
		Student obj=new Student();
	obj.mark();
	obj.total();
	obj.number();
		
	}

}
