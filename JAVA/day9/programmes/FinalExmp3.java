package programmes;
/*final*/ class Sample//if the class is final then it can not be override
{
	void run()
	{
		System.out.println("run method in Sample");
	}
}
public class FinalExmp3 extends Sample {
	void run()
	{
		System.out.println("run method in FinalExmp3");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalExmp3 a=new FinalExmp3();
		a.run();
	}

}
