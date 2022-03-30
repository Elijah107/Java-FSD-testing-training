package inheritance;

class Jungle {
	void eat() {
		System.out.println(" all Animals are eatting in the jungle");
	}
}

class Lion extends Jungle {// dog class is extends animal class
	void roar() {
		System.out.println("lion is roaring");
	}
}

class Cat extends Jungle {// cat class is extends animal class
	void meow() {
		System.out.println("cat is crying");
	}
}

public class HeirarchialInheritance {// when two or more classes inherits a single class

	public static void main(String[] args) {
		Cat obj=new Cat();
		obj.eat();
		obj.meow();
		//obj.roar(); shows error.cat class and lion class has no inheritance

	}

}
