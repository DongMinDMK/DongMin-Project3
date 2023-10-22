package finalPractice;

class Book{
	String title;
	String author;
	int pageNumber;
	
	
	public Book(String title, String author, int pageNumber) {
		this.title = title;
		this.author = author;
		this.pageNumber = pageNumber;
	}
	
	final public void pageNumberMethod() { //final로 선언한 메소드이기 때문에 자식클래스에서 상속을 받으면 오버라이딩이 절대불가함.
		System.out.println("이 책은 총 " + this.pageNumber + "페이지로 되어있습니다.");
	}
	
	public void titleMethod() {
		System.out.println("이 책의 제목은 " + this.title + "입니다.");
	}
	
	public void authorMethod() {
		System.out.println("이 책의 저자는 " + this.author + "입니다.");
	}
}

class SportsBook extends Book{
	boolean isSubject;
	
	public SportsBook(String title, String author, int pageNumber, boolean isSubject){
		super(title, author, pageNumber);
		this.isSubject = isSubject;
	}

	@Override
	public void titleMethod() {
		System.out.println("이 스포츠 카테고리의 책 제목은 " + title + "입니다.");
	}

	@Override
	public void authorMethod() {
		System.out.println("이 스포츠 카테고리의 책 저자는 " + author + "입니다.");
	}
	
	public void isSubjectMethod() {
		if(isSubject) {
			System.out.println("이 스포츠 책의 카테고리는 축구입니다.");
		}else {
			System.out.println("이 스포츠 책의 카테고리는 야구입니다.");
		}
	}
}

public class FinalPractice {

	public static void main(String[] args) {
		SportsBook sb = new SportsBook("스포츠란 무엇인가?", "DMK", 200, true);
		sb.titleMethod();
		sb.authorMethod();
		sb.isSubjectMethod();
		
		System.out.println();
		
		Book book = new Book("이책의 제목은 무엇일까요?", "DMK", 150);
		book.pageNumberMethod(); //이것은 final로 정의된 메소드
		book.titleMethod();
		book.authorMethod();
		
		System.out.println();
		
		
		sb = new SportsBook("스포츠는 재밌어요", "DMK", 300, false);
		sb.titleMethod();
		sb.authorMethod();
		sb.isSubjectMethod();
	}

}
