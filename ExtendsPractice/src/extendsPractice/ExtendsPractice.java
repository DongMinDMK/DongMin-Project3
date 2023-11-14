package extendsPractice;

class Book{
	String BookName;
	
	public Book() {
		System.out.println("Book클래스이고, 부모클래스인 생성자입니다. 그리고 파라미터가 존재하지 않습니다.");
	}
	
	public Book(String BookName) {
		System.out.println("Book클래스이고, 부모클래스이며 파라미터가 존재하는 생성자");
	}
	
}

class ComputerBook extends Book{
	String langName;
	
	public ComputerBook() {
		System.out.println("Computer클래스이고, 부모클래스인 Book 클래스를 상속받은 자식클래스인 생성자입니다.");
	}
	public ComputerBook(String langName) {
		this.langName = langName;
		
	}
	
	public void cbMethod() {
		System.out.println("Computer클래스이고, 부모클래스인 Book 클래스를 상속받은 자식클래스인 생성자이며 파라미터가 1개 존재하는 생성자, 컴퓨터책의 제목이 " + this.langName + "인 클래스인 메소드입니다.");
	}
}

class ScienceBook extends Book{
	String langScienceName;
	
	public ScienceBook() {
		System.out.println("Science클래스이고, 부모클래스인 Book 클래스를 상속받은 자식클래스인 생성자입니다.");
	}
	
	public ScienceBook(String langScienceName) {
		this.langScienceName = langScienceName;
	}
	
	public void sbMethod() {
		System.out.println("Science클래스이고, 부모클래스인 Book 클래스를 상속받은 자식클래스인 생성자이며 파라미터가 1개 존재하는 생성자, 즉 과학책의 제목이 " + this.langScienceName + "인 클래스의 메소드입니다.");
	}
}

public class ExtendsPractice {

	public static void main(String[] args) {
		//ComputerBook 클래스와 ScienceBook 클래스는 Book 클래스로부터 상속받은 자식클래스이기 때문에 따로 부모 클래스 생성자를 안건드리더라도 상속관계이면 자식 클래스의 생성자를 호출해도 자동으로 부모 클래스의 생성자도 같이 호출된다.
		//단 호출될 때 부모클래스의 기본생성자가 호출된다.
		
		ComputerBook cb = new ComputerBook("재밌는 JAVA");
		cb.cbMethod();
		
		ScienceBook sb = new ScienceBook("재밌는 화학수업");
		sb.sbMethod();
		

	}

}
