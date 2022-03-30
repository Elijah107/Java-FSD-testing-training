package assignment;

import java.util.Scanner;

public class Q5Plindrom {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		String str = sc.nextLine();
		String strArr[] = str.split(" ");
		System.out.println("string: " + str);
		System.out.print("String array : [");
		for (int i = 0; i < strArr.length; i++) {
			System.out.print(strArr[i] + " ,");
		}
		System.out.println("]" + "\n");
		
		String word;
		for(int i=0;i<strArr.length;i++) {
			word=strArr[i];
			char[] str1=new char[word.length()];
			int count=0;
			for(int j=word.length()-1;j>=0;j--) {
				str1[count]=word.charAt(j);
				count++;
			}
			String word2=new String(str1) ;
			if(word.equals(word2)) {
				System.out.println("palindrome word :"+word);
			}
		}
	}

}
