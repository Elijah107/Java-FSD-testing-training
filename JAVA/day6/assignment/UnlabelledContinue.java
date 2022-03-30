package assignment;

public class UnlabelledContinue {

	public static void main(String[] args) {
		for(int i=1;i<5;i++) {
			for(int j=1;j<5;j++) {
				if(i==j) {
					System.out.print(" ");
					continue;
				}
				System.out.print(j+"  ");
			}
			System.out.println();
		}

	}
}
