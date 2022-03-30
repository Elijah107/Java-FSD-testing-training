package inheritance;

class Animal{
	void bark() {
		System.out.println("Animal is barking");
	}
	void eat() {
		System.out.println("animal is eatting");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println(" dog is barking");
	}
	
}
	

class SimpleInheritance {

	public static void main(String[] args) {
		Dog obj=new Dog();//create child class object
		obj.bark();//calls child class bark
		obj.eat();//calls parent class,since it has no eat function in child 
		
	}

}
