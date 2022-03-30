package string;

public class Split {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample=new String("Hello, my name is Aryan , I am 27 years old");
		String[] sentences=sample.split(",");
		for(int i=0;i<sentences.length;i++)
		{
			System.out.println(sentences[i].trim());//it will remove the white spaces and prit only the required String value
		}

	}

}
