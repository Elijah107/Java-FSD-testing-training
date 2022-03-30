package assignment;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Quest1 {
	public static void main(String[] args) {

		try
				{
					File f1=new File("D:example2.txt");
					if(f1.createNewFile())
					{
						System.out.println(f1.getName()+" has been created");
					}
					else
					{
						System.out.println("File already exists");
					}
		
				}
				catch(IOException e)
				{
					System.out.println("error occured");
					System.out.println(e);
				}
		//Writing into file
		try
		{
			FileWriter obj1=new FileWriter("D:example2.txt");
			obj1.write("HELLO WELCOME ALL");
			obj1.close();
			System.out.println(" written the content  successfully");
		}
		catch(IOException e)
		{
			System.out.println(" error has occured");
			System.out.println(e);
		}
		//reading data
		try
		{
			File f1=new File("D:example2.txt");
			Scanner sc=new Scanner(f1);
			while(sc.hasNextLine())
			{
				String fileData=sc.nextLine();
				System.out.println(fileData);
			}
			sc.close();
		}
		catch(FileNotFoundException e)
		{
		
			System.out.println(e);
		}

}
}




//Write a program to create, write and read from a file.


	