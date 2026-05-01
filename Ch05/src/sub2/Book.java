package sub2;

public class Book {
	
	private String title;
	private String author;
	private int copies;
	
	public Book(String title, String author, int copies) {
		this.title = title;
		this.author = author;
		this.copies = copies;
	}
	
	public boolean borrowBook() {
		if(this.copies > 0) {
			this.copies -= 1; // copies--;
			return true;
		} else {
			return false;
		}
		
	}
	public void returnBook() {
		this.copies += 1; // copies++;
	}
	
	public void show() {
		System.out.println("책제목: " + this.title);
		System.out.println("책저자: " + this.author);
		System.out.println("복사본: " + this.copies);
	}
}
