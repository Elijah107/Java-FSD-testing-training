package assignment;

public class Q3Ans {
	void mul(int l,int b)
	 {
	  System.out.println("answer of multiplication is  "+(l*b)) ;
	 }
	 void mul(int l, int b, int h)
	 {
	  System.out.println("answer of multiplication is "+(l*b*h));
	 }
	 void mul(int l,int b,int h,int r) {
		 System.out.println("answer of multiplication is "+(l*b*h*r)); 
	 }
		
	public static void main(String[] args) {
		Q3Ans obj=new Q3Ans();
		obj.mul(10, 25);
		obj.mul(2, 32, 44);
		obj.mul(25, 22, 10, 13);
		
	}

}
