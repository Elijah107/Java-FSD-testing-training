package assignment;

public class Q3Bans {
	void mul(double d,double e)
	 {
	  System.out.println("answer of multiplication is  "+(d*e)) ;
	 }
	 void mul(float l, int b, float h)
	 {
	  System.out.println("answer of multiplication is "+(l*b*h));
	 }
	 void mul(int l,int b) {
		 System.out.println("answer of multiplication is "+(l*b)); 
	 }
	 void mul(float l,float b)
	 {
	  System.out.println("answer of multiplication is  "+(l*b)) ;
	 }
public static void main(String[] args) {
	Q3Bans obj=new Q3Bans();
	obj.mul(4.2, 3.2);
	obj.mul(0.2, 2.3);
	obj.mul(3.2, 5);
	obj.mul(5, 5);
	
		}

}
