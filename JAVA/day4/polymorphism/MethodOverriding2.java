package polymorphism;
class Bike
{
	void run()
	{
		System.out.println("Bike is running");
	}
}
class Honda extends Bike
{
	void run()
	{
		System.out.println("Honda is running");
	}
}
	

public class MethodOverriding2 {

	public static void main(String[] args) {
		
		Bike obj=new Honda();/*object of parent class is created and this object is referenced to child class*/
		obj.run();//Honda run method is printed, it override the bike class(parent
	
	}

}
