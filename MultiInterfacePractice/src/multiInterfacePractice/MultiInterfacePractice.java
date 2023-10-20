package multiInterfacePractice;

interface Sports {
	public abstract void sportsMethod();
}

interface Soccer{
	public abstract void soccerMethod();
}

class Position implements Sports, Soccer{
	String positions;
	
	public Position(String positions) {
		this.positions = positions;
	}
	
	@Override
	public void sportsMethod() {
		System.out.println("스포츠는 정말 많은 종목들이 존재합니다.");
	}

	@Override
	public void soccerMethod() {
		System.out.println("그 중에서 축구라는 종목이 있습니다.");
		System.out.println("축구에는 " + this.positions + "포지션들이 존재합니다.");
	}

}

public class MultiInterfacePractice {

	public static void main(String[] args) {
		Position ps = new Position("공격수, 미드필더, 수비수, 골키퍼");
		ps.sportsMethod();
		ps.soccerMethod();
		
		System.out.println();
		
		Sports sp = ps; //Sports 인터페이스로 업캐스팅
		sp.sportsMethod(); //업캐스팅이지만 부모가 인터페이스 중 추상메소드이므로 오버라이딩한 자식 클래스를 호출
		//sp.soccerMethod()는 호출불가
		
		System.out.println();
		
		Soccer soccer = ps; //Soccer 인터페이스로 업캐스팅
		soccer.soccerMethod(); //업캐스팅이지만 부모가 인터페이스 중 추상메소드이므로 오버라이딩한 자식 클래스를 호출
		//soccer.sportsMethod()는 호출불가
		

	}

}
