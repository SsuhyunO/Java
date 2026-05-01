package sub1;

public class Book {
	String title;
	String author;
	int copies;
	
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
