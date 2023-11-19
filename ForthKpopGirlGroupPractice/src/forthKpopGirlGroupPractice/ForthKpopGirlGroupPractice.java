package forthKpopGirlGroupPractice;

interface ForthKpopGirlGroup{
	public abstract void singMethod();
	public abstract void peopleCountMethod();
}


class IVE implements ForthKpopGirlGroup{
	String title;
	int peopleCount;
	
	public IVE(String title, int peopleCount) {
		this.title = title;
		this.peopleCount = peopleCount;
	}

	@Override
	public void singMethod() {
		System.out.println("4세대 KPOP 여자아이돌 중 아이브라는 걸그룹이 있다.");
		System.out.println("아이브라는 걸그룹은 수많은 대표곡이 있지만, 제가 좋아하는 곡을 2개만 뽑자면 " + this.title + "가 있다.");
	}

	@Override
	public void peopleCountMethod() {
		System.out.println("아이브의 인원수는 총 " + this.peopleCount + "명 이며 국적은 1명 제외 한국인이다. 1명은 일본인이다.");
	}	
}

class NewJeans implements ForthKpopGirlGroup{
	String title;
	int peopleCount;
	
	public NewJeans(String title, int peopleCount) {
		this.title = title;
		this.peopleCount = peopleCount;
	}

	@Override
	public void singMethod() {
		System.out.println("또 다른 4세대 여자 걸그룹 중 뉴진스라는 걸그룹이 있다.");
		System.out.println("뉴진스의 대표곡도 많지만 제가 좋아하는 대표적인 2개의 곡은 " + this.title + "이다.");
	}

	@Override
	public void peopleCountMethod() {
		System.out.println("뉴진스의 총 정원은 " + this.peopleCount + "이다.");
		System.out.println("뉴진스는 다국적 걸그룹이고 " + this.peopleCount + "명, 전부 다 영어를 잘하는 수준급 멤버들이다.");
	}

}

class Aespa implements ForthKpopGirlGroup{
	String title;
	int peopleCount;
	
	public Aespa(String title, int peopleCount) {
		this.title = title;
		this.peopleCount = peopleCount;
	}

	@Override
	public void singMethod() {
		System.out.println("또 다른 4세대 KPOP 걸그룹 중 에스파라는 그룹이 있다.");
		System.out.println("에스파도 수많은 히트 타이틀곡이 존재하지만 제가 좋아하는 2개의 곡은 " + this.title + "이다.");
	}

	@Override
	public void peopleCountMethod() {
		System.out.println("에스파도 다국적 걸그룹이고, 총 정원은 " + this.peopleCount + "명 이다.");
	}
	
	
}

public class ForthKpopGirlGroupPractice {

	public static void main(String[] args) {
		ForthKpopGirlGroup fkgg = new IVE("I AM, LOVE DIVE", 6);
		fkgg.singMethod();
		fkgg.peopleCountMethod();
		
		System.out.println();
		
		fkgg = new NewJeans("Hype boy, ETA", 5);
		fkgg.singMethod();
		fkgg.peopleCountMethod();
		
		System.out.println();
		
		fkgg = new Aespa("Next Level, Spicy", 4);
		fkgg.singMethod();
		fkgg.peopleCountMethod();
	}

}
