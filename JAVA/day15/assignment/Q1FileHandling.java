package assignment;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1FileHandling {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			File f = new File("C:Asmnt1.txt");
			if (f.createNewFile()) {
				System.out.println("file " + f.getName() + " created successfully");
				if (f.canWrite()) {
					System.out.println("Ready to write...");
					FileWriter fwrite = new FileWriter("C:Asmnt1.txt");
					String content = sc.nextLine();
					fwrite.write(content);
					fwrite.close();
					System.out.println("Content is successfully wrote to the file.");
				} else {
					System.out.println("Can't write in the file");
				}
				if (f.canRead()) {
					System.out.println("Reading from file...");
					Scanner fread = new Scanner(f);
					while (fread.hasNextLine()) {
						String fileData = fread.nextLine();
						System.out.println(fileData);
					}
					fread.close();
				} else {
					System.out.println("Failed to reading from file");
				}
			} else if (f.exists()) {
				System.out.println("file name already exists");
				System.out.println("Press 1 to delete the existing file");
				int dltcmd = sc.nextInt();
				if (dltcmd == 1) {
					if (f.delete()) {
						System.out.println("File deleted...Restart the program");
					} else {
						System.out.println("Failed to delete the file");
					}
				}
			} else {
				System.out.println("Can't create the file");
			}
		} catch (IOException e) {
			System.out.println(e);
		}
		sc.close();
	}

}
