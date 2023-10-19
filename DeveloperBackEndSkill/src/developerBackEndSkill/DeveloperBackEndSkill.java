package developerBackEndSkill;

interface BackEndInter{
	public abstract void developerMethod();
}

class BackEndDeveloper implements BackEndInter{
	String skils;
	String contents;
	
	public BackEndDeveloper(String skils, String contents) {
		this.skils = skils;
		this.contents = contents;
	}

	@Override
	public void developerMethod() {
		System.out.println("백엔드 개발자는 기본적으로 " + this.skils + "등 기술스택들을 사용할 수 있어야 한다.");
	}
	
	public void backEndContent() {
		System.out.println("백엔드는 " + this.contents + "을 하는 것을 말한다.");
	}
}

class Full_StackDeveloper implements BackEndInter{
	String contents;
	
	public Full_StackDeveloper(String contents) {
		this.contents = contents;
	}
	@Override
	public void developerMethod() {
		System.out.println("풀스택 개발자는 " + this.contents + "를 뜻한다.");
	
	}
}

public class DeveloperBackEndSkill {

	public static void main(String[] args) {
		BackEndInter bei = new BackEndDeveloper("자바, 스프링, 스프링부트", "웹 사이트의 앞에서 보여지는 프론트엔드가 아닌 뒤에서 서버관리와 통신, 그리고 프론트엔드 개발자와 소통하며 개발"); //업캐스팅
		bei.developerMethod();
		
		BackEndDeveloper bedi = (BackEndDeveloper) bei; //다운캐스팅
		bedi.backEndContent();
		
		System.out.println();
		
		
		bei = new Full_StackDeveloper("프론트엔드 개발자가 하는 웹 사이트 디자인과 웹 사이트 뒤에서 서버 관리를 하는 백엔드 개발자"); //업캐스팅
		bei.developerMethod();
		
	}

}
