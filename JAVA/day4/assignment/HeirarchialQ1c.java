package assignment;
class A{
	void method1() {
		System.out.println("This is method function of class A");
	}
}
class B extends A{
	void method2() {
		System.out.println("This is method function of class B");
	}
}
class C extends A{
	void method3() {
		System.out.println("This is method function of class C");
	}
}
public class HeirarchialQ1c {
public static void main(String[] args) {
		C obj=new C();
		obj.method1();
		obj.method3();
		B obj1=new B();
		obj1.method2();

	}

}
