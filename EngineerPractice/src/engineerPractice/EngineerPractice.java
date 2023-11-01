package engineerPractice;

class BackEnd{
	String skillStack;
	String doing;
	
	public BackEnd(String skillStack, String doing) {
		this.skillStack = skillStack;
		this.doing = doing;
	}
	
	public void backEndMethod() {
		System.out.println("개발자는 대표적으로 프론트엔드와 백엔드로 구분된다.");
		System.out.println("백엔드 개발자는 기본 기술스택은 " + this.skillStack + "등이 필요하다.");
	}
	
	public void doBackEndMethod() {
		System.out.println("백엔드 개발자는 주로 " + this.doing + "등의 일을 한다.");
	}
}

class FrontEnd{
	String skillStack;
	String doing;
	
	public FrontEnd(String skillStack, String doing) {
		this.skillStack = skillStack;
		this.doing = doing;
	}
	
	public void frontEndMethod() {
		System.out.println("프론트엔드 개발자의 기본 기술스택은 " + this.skillStack + "등이 필요하다.");
	}
	
	public void doFrontEndMethod() {
		System.out.println("프론트엔드 개발자는 주로 " + this.doing + "등의 일을 한다.");
	}
}
public class EngineerPractice {

	public static void main(String[] args) {
		
		System.out.println("웹 개발자(프론트엔드/백엔드)");
		
		System.out.println("===== 백엔드 개발자 =====");
		
		BackEnd backend = new BackEnd("자바, Spring Framework, Spring Boot ", "웹 페이지 안보이는 곳에서 서버 개발 ");
		backend.backEndMethod();
		backend.doBackEndMethod();
		
		System.out.println("===== 프론트엔드 개발자 =====");
		
		FrontEnd frontend = new FrontEnd("HTML/CSS, javascript ", "웹 페이지에서 실제로 보여지는 디자인을 개발 ");
		frontend.frontEndMethod();
		frontend.doFrontEndMethod();

	}

}
