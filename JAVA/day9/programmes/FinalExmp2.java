package programmes;
class Example
{
	/* final */void test() {//if final is the method it can not be overridden
	
		System.out.println("test method in Example class");
	}
}

public class FinalExmp2 extends Example {
	void test() {
	
		System.out.println("test method in FinalExmp2 class");
	}

	public static void main(String[] args) {
		FinalExmp2 a=new FinalExmp2();
		a.test();

	}

}
