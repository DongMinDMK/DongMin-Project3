package kPopPractice;

interface KPOP{
	public abstract void kpopMethod();
}

class Ballad implements KPOP{
	String artist;
	String titleSong;
	
	public Ballad(String artist, String titleSong) {
		this.artist = artist;
		this.titleSong = titleSong;
	}

	@Override
	public void kpopMethod() {
		System.out.println("K-POP 중에서 장르 중 발라드가 있습니다.");
		System.out.println("발라드를 부른 가수는 정말 많습니다. 이 중에서 대표적으로 제가 좋아하는 가수를 뽑겠습니다.");
	}
	
	public void balladMethod() {
		System.out.println("제가 좋아하는 발라드 가수는 " + this.artist + "입니다.");
		System.out.println(this.artist + "의 타이틀 곡은 정말 많지만 그 중에서도 저는 " + this.titleSong + "을 좋아합니다.");
	}

}

class Dance implements KPOP{
	String artist;
	String titleSong;
	
	public Dance(String artist, String titleSong) {
		this.artist = artist;
		this.titleSong = titleSong;
	}

	@Override
	public void kpopMethod() {
		System.out.println("K-POP 중에서 댄스 카테고리의 가수들도 정말 많습니다.");
		System.out.println("특히 K-POP의 댄스 가수 영향력 덕분에 전세계적으로 K-POP이 인기를 끌고 있습니다.");
	}
	
	public void danceMethod() {
		System.out.println("정말 대단하고 유명한 댄스가수가 많지만 제가 좋아하는 댄스 가수는 " + this.artist + "입니다.");
		System.out.println(this.artist + "의 타이틀곡은 정말 좋은 노래가 많습니다. 저는 여기서 " + this.titleSong + "을 좋아합니다.");
	}
	
	
}
public class KpopPractice {

	public static void main(String[] args) {
		System.out.println("======== 발라드 ========");
		
		KPOP kpop = new Ballad("버즈, 먼데이키즈, 엠씨더맥스", "버즈-가시, 버즈-나에게로 떠나는 여행, 버즈-남자를 몰라, 먼데이키즈-가을안부, 먼데이키즈-사랑이 식었다고 말해도 돼, 엠씨더맥스-어디에도");
		kpop.kpopMethod();
		
		Ballad ballad = (Ballad) kpop;
		ballad.balladMethod();
		
		System.out.println("======== 댄스 ========");
		
		kpop = new Dance("아이브, 뉴진스", "아이브-I AM, 뉴진스-ETA, 뉴진스-Hype boy");
		kpop.kpopMethod();
		
		Dance dance = (Dance) kpop;
		dance.danceMethod();
	}

}
