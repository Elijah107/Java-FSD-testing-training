package assignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
//Write a program to get the information about the file.
public class Quest2 {
	public static void main(String[] args) throws FileNotFoundException {
		File f1=new File("D:example2.txt");
		
		if(f1.exists())
		{
			System.out.println("The file name is: "+f1.getName());
			System.out.println("Is the file Writeable: "+f1.canWrite());
			System.out.println("The absolute Path of the file is: "+f1.getAbsolutePath());
			System.out.println("Is the file Readable: "+f1.canRead());
			System.out.println("The size of the file in bytes: "+f1.length());
			//reading data
			Scanner sc=new Scanner(f1);
			while(sc.hasNextLine())
			{
				String fileData=sc.nextLine();
				System.out.println(fileData);
			}
			sc.close();
		}
		else
		{
			System.out.println("the file does not exist");
		}
	}

}





