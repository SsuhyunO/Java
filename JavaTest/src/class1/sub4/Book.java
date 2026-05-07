package class1.sub4;

public class Book {
	private String title;
	private String author;
	private String isbn;
	private boolean isBorrwd;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrwd = false;
	}
	
	public void borrowBook() {
		if(isBorrwd) System.out.println(title + " 이미 대출됨");
		else {
			isBorrwd = true;
			System.out.println("도서대출 : " + title);
		}
	}
	
	public void returnBook() {
		if(isBorrwd) {
			isBorrwd = false;
			System.out.println("도서반납 : " + title);
		}else System.out.println("반납할 도서 없음");
	}
	
	public void getBookInfo() {
		System.out.println("도서명 : " + title);
		System.out.println("저자 : " + author);
		System.out.println("ISBN : " + isbn);
		System.out.println("대출여부 : " + (isBorrwd ? "불가능" : "가능"));
	}
	
	public String getTitle() {
		return title;
	}
}
