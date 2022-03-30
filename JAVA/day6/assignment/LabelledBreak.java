package assignment;

public class LabelledBreak {

	public static void main(String[] args) {
   		one:for(int i=0;i<10;i++) {
   				for(int j=0;j<i;j++) {
   				if(i==5)
   					break one;
   				System.out.print(i);
   			}
			System.out.println();
		}
	}
}
