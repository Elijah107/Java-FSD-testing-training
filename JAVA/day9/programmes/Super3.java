package programmes;
class Cat
{
	Cat()
	{
		System.out.println("Cat class constructor is called");
	}
}

public class Super3 extends Cat {
	Super3()
	{
		super();
		System.out.println("sub class constructor is called");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Super3 a=new Super3();
	}

}

