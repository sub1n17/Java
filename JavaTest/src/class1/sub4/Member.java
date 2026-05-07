package class1.sub4;

public class Member {
	private String name;
	private String memberId;
	private Book borrowedBook;
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}
	
	public void borrowBook(Book b) {
		if(borrowedBook != null) {
			System.out.println(b.getTitle() + " 이미 대출 됨");
			return;
		}
		
		this.borrowedBook = b;
		System.out.println("도서대출: " + b.getTitle());
		b.borrowBook();
	}
	
	public void returnBook(Book b) {
		if(borrowedBook == null) {
			
		}
		
		this.borrowedBook = null;
		System.out.println("도서반납: " + b.getTitle());
		b.returnBook();
	}
	
	public void getMemberInfo() {
		System.out.println("이름: " + name);
		System.out.println("회원 ID: " + memberId);
		if(borrowedBook != null) {
			System.out.println("대출한 도서: " + borrowedBook.getTitle());
		} else {
			System.out.println("대출한 도서: 없음");
		}
		
	}
	
}
