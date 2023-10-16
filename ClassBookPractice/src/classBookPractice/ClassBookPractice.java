package classBookPractice;

interface Library{
	public abstract void libMethod();
}

class Book implements Library{
	String category;
	String bookTitle;
	String pageNumber;	
	
	public Book(String category, String bookTitle, String pageNumber) {
		this.category = category;
		this.bookTitle = bookTitle;
		this.pageNumber = pageNumber;
	}

	@Override
	public void libMethod() {
		System.out.println("도서관에는 책들이 있습니다.");
		System.out.println("그 중에 저는 " + this.category + "카테고리에 " + this.bookTitle + "제목을 가진 책을 좋아합니다.");
		System.out.println(this.bookTitle + "책은 페이지 수가 " + this.pageNumber + "정도입니다.");
	}

}

class Human implements Library{
	String gender;
	String age;
	String height;
	
	public Human(String gender, String age, String height) {
		this.gender = gender;
		this.age = age;
		this.height = height;
	}

	@Override
	public void libMethod() {
		System.out.println("재미있는 자바수업 이라는 책을 빌린 사람의 인적사항은 " + this.gender + "이며, 나이는 " + this.age + "이고, 키는 " + this.height + "정도입니다.");
	}
	
}


public class ClassBookPractice {

	public static void main(String[] args) {
		Library lib = new Book("IT", "재미있는 자바수업", "300"); //업캐스팅
		lib.libMethod();
		
		lib = new Human("남성", "26", "174cm"); //업캐스팅
		lib.libMethod();

	}

}
