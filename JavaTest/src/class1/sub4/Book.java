package class1.sub4;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrowed;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowed = false;
	}
	
	public void borrowBook() {
		if(isBorrowed) { 
			return;
		}
		System.out.println("대출");
		this.isBorrowed = true;
	}
	
	public void returnBook() {
		if(!isBorrowed) { 
			return;
		}
		System.out.println("반납");
		this.isBorrowed = false;
	}
	
	public void getBookInfo() {
		System.out.println("제목: " + title);
		System.out.println("저자: " + author);
		System.out.println("ISBN: " + isbn);
		
		if(isBorrowed) {
			System.out.println("대출여부: 불가능");
		} else {
			System.out.println("대출여부: 가능");
		}
	}
	
	public String getTitle() {
		return this.title;
	}
	
	
	
}
