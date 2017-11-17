package pkgClasses;

public class MainClass {
	
	public static void main(String[] args) {
		Book bookOne = new Book(12345, "First Book", 465);
		Book bookTwo = new Book(54321, "Second Book", 339);
		
		System.out.println("The first book");
		System.out.println(bookOne.toString());
		
		System.out.println("The second book");
		System.out.println(bookTwo.toString());
	}
}
