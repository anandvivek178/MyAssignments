package week2.day3;

public class Library {
	
	public String addBook(String bookTitle) {
		
		System.out.println("Book added successfully");
		return bookTitle;
		
	}
	
	public void issueBook() {
		
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library lib = new Library();
		
		System.out.println(lib.addBook("Book name"));
		
		lib.issueBook();

	}

}
