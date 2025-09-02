package Encapsulation;

public class library {
	
	private int borrowed_books;
	final private int MAX_BORROW=5;
	public void borrowBook() {
		if(borrowed_books<5) {
			borrowed_books++;
			System.out.println("Book borrowed and total borrowed books are"+borrowed_books);
		}else {
			System.out.println("Max limit reach");
		}
	}
	public void returnBook() {
		if(borrowed_books>0) {
			borrowed_books--;
			System.out.println("The books has been returned and total borrowed books are"+borrowed_books);
		}else {
			System.out.println("No book available for return");
		}
	}
	
	public getborrowed_books() {
		
	}
	public static void main(String args[]) {
		
	}
}
