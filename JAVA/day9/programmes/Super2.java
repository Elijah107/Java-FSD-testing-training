package programmes;
class Lion
{
	void eat()
	{
		System.out.println("lion is eating");
	}
}
public class Super2 extends Lion{
	void eat()
	{
		System.out.println("Cat is eating");
	}
	void test()
	{
		super.eat();
	}
	public static void main(String[] args) {
		Super2 obj1=new Super2();
		obj1.eat();
		obj1.test();

	}

}

