package polymorphism;

class Shape {
	void draw() {
		System.out.println("any shape can be drawn");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("circle shape can be drawn");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Tiangle shape can be drawn");
	}
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("Rectangle shape can be drawn");
	}
}

public class MethodOverriding1 {

	public static void main(String[] args) {
		Shape s = null;
		s = new Shape();
		s.draw();
		s = new Circle();
		s.draw();

		s = new Triangle();
		s.draw();
		s = new Rectangle();
		s.draw();

	}

}
