package day16Assignment;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {25,55,2,90,45};
		int temp,j;
		for(int i=1;i<a.length;i++)
		{
			temp=a[i];
			j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
			for (int k=0; k<a.length; ++k)
			{
				System.out.print(a[k]+" ");
			}
			System.out.println();  
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+ " ");
		}
	}

}
