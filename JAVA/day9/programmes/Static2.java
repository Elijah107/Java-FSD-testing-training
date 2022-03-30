package programmes;

public class Static2 {
	static int cube(int x)//static method
	{
		return x*x*x;
	}
	int square(int x)//non-static method
	{
		return x*x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result=cube(3);//27//no need to create object for ststic method
		Static2 obj=new Static2 ();
		int res=obj.square(5);//25
		System.out.println(result);
		System.out.println(res);
	}

}

