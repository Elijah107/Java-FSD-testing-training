package programmes;

public class StaticExamp1 {
	static int count=0; // a.count, b.count, c.count
	StaticExamp1()
	{
		count++;
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExamp1 a=new StaticExamp1();
		StaticExamp1 b=new StaticExamp1();
		StaticExamp1 c=new StaticExamp1();
	}

}
