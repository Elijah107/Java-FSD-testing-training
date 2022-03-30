package assignment;

public class LabelledContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer:for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				if(i==j) {
					System.out.print(" ");
					continue outer;
				}
				System.out.print(j+"  ");
			}
			
		}
	}

}
 