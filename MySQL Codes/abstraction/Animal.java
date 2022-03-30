package abstraction;

public abstract class Animal {    // this is abstract class
	
	public abstract void method1();// no method body bcz it is abstract method
	
	public void regularmethod() {
		System.out.println("This is a regular method logic");
		
		// Animal obj=new Animal()	;    it will be an error bcz you can't create an object for abstract class
		}
	
}