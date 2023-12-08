package protectedPractice;

class Book{
	protected String title; //protected 접근제한자 설정
	int pageCount;
}

class BookClass extends Book{
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
}

public class ProtectedPractice {

	public static void main(String[] args) {
		BookClass bc = new BookClass();
		bc.setTitle("JAVA PROGRAMMING");
		bc.setPageCount(100);
		
		System.out.println("책의 제목 : " + bc.title); //같은 패키지 안에 클래스가 존재하기 때문에 즉 접근제한자 protected로 인해 접근이 가능하다.
		System.out.println("책의 페이지 : " + bc.pageCount); 

	}

}
