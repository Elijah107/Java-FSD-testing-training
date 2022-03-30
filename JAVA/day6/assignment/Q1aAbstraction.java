package assignment;

abstract class Google {
	abstract void search();

	abstract void show();

	void messege() {
		System.out.println("Thankyou For using google");
	}
}

class SearchAll extends Google {
	void search() {
		System.out.println("searching all results");
	}

	void show() {
		System.out.println("showing all search results");
	}
}

class SearchImage extends Google {
	void search() {
		System.out.println("image search results");
	}

	void show() {
		System.out.println("showing all image search results");
	}

	void messege() {
		System.out.println("Thak you for the image search results");
	}
}

public class Q1aAbstraction {
	public static void main(String[] args) {
		Google obj = new SearchAll();
		obj.messege();
		obj.show();
		obj.search();
		Google obj1 = new SearchImage();
		obj1.search();
		obj1.show();
		obj1.messege();

	}

}
