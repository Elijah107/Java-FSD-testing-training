package programmes;

public class This1 {
	int sum;
	This1(int sum)
	{

     this.sum=sum;
	}
	void display()
	{
		System.out.println("sum="+sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This1 obj=new This1(500);
		obj.display();
		This1 two=new This1(750);
		two.display();

	}

}


