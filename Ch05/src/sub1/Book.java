package sub1;

public class Book {
	
	String title;
	String author;
	int copies;
	
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
