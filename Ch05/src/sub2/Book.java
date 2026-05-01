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
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	
	public boolean borrowBook() {
		if(copies > 0) {
			copies--;
			return true;
		}else {
			return false;
		}
	}
	
	public void returnBook() {
		copies++;
	}
	
	public void show() {
		System.out.println("책제목 : " + title);
		System.out.println("책저자 : " + author);
		System.out.println("복사본 : " + copies);
	}
}
