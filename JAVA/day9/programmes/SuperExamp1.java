package programmes;
class Animal// super-class/ parent-class
{
	String color="white";
}
public class SuperExamp1 extends Animal{
	String color="brown";
	void printcolor()
	{
		System.out.println(color);//brown
		System.out.println(super.color);//white
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperExamp1  obj1=new SuperExamp1 ();
		obj1.printcolor();
	}

}
