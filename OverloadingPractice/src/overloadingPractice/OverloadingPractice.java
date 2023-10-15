package overloadingPractice;

class Book{
	String category = "카테고리 입력";
	String title = "책 제목 입력";
	int pagesCount = 0;
	
	public Book() { //매개변수가 없는 생성자
		
	}
	
	public Book(String ca) { //매개변수가 1개인 생성자
		this.category = ca;
	}
	
	public Book(String ca, String t) { //매개변수가 2개인 생성자
		this.category = ca;
		this.title = t;
	}
	
	public Book(String ca, String t, int pc) { //매개변수가 3개인 생성자
		this.category = ca;
		this.title = t;
		this.pagesCount = pc;
	}
	
}

public class OverloadingPractice {

	public static void main(String[] args) {
		Book book = new Book(); //매개변수가 없는 기본 생성자 호출
		System.out.println("book.category : " + book.category);
		System.out.println("book.title : " + book.title);
		System.out.println("book.pagesCount : " + book.pagesCount); //일반 생성자일 때 각각의 디폴트값으로 설정한 멤버변수 출력
		
		System.out.println();
		
		
		Book book2 = new Book("IT"); //매개변수가 1개인 생성자 호출
		System.out.println("book2.category : " + book2.category);
		System.out.println("book2.title : " + book2.title);
		System.out.println("book2.pagesCount : " + book2.pagesCount); //매개변수가 1개일 때 생성자를 호출함으로 book2.category가 디폴트값에서 지정한 값으로 바뀜.
		
		System.out.println();
		
		Book book3 = new Book("IT", "재밌고 신나는 자바 프로그래밍"); //매개변수가 2개인 생성자 호출
		System.out.println("book3.category : " + book3.category);
		System.out.println("book3.title : " + book3.title);
		System.out.println("book3.pagesCount : " + book3.pagesCount); //매개변수가 2개일 때 생성자를 호출함으로 book3.category, book3.title이 디폴트값에서 지정한 값으로 바뀜.
		
		System.out.println();
		
		Book book4 = new Book("IT", "재밌고 신나는 자바 프로그래밍", 200); //매개변수가 3개인 생성자 호출
		System.out.println("book4.category : " + book4.category);
		System.out.println("book4.title : " + book4.title);
		System.out.println("book4.pagesCount : " + book4.pagesCount); //매개변수가 3개일 때 생성자를 호출함으로 book4.category, book4.title, book4.pagesCount가 디폴트값에서 지정한 값으로 바뀜.
	}

}
