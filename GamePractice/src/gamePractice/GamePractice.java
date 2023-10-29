package gamePractice;

interface Game{
	public abstract void subjectMethod();
	public abstract void interMethod();
}

class Overwatch implements Game{
	String subject;
	String rule;
	String champion;
	
	public Overwatch(String subject, String rule, String champion) {
		this.subject = subject;
		this.rule = rule;
		this.champion = champion;
	}

	@Override
	public void subjectMethod() {
		System.out.println("온라인 게임 중에는 오버워치라는 게임이 있다.");
		System.out.println("오버워치는 " + this.subject + "게임이다.");
	}

	@Override
	public void interMethod() {
		System.out.println("오버워치는 " + this.rule + " 등 여러가지 맵들이 존재하고, 거기서 이기는 팀이 승리한다.");
	}
	
	public void overwatchMethod() {
		System.out.println("오버워치 영웅, 챔피언은 크게 " + this.champion + "가 있다.");
	}
}

class MapleStory implements Game{
	String subject;
	String useAge;
	String job;
	
	public MapleStory(String subject, String useAge, String job) {
		this.subject = subject;
		this.useAge = useAge;
		this.job = job;
	}

	@Override
	public void subjectMethod() {
		System.out.println("게임 중에는 메이플스토리 라는 온라인 게임이 있다.");
		System.out.println("이 게임은 " + this.subject + "게임이다.");
	}

	@Override
	public void interMethod() {
		System.out.println("이 게임은 각 레벨마다 전직을 할 수 있고, 전직하면 전직할수록 자신이 키운 캐릭터를 성장, 육성시킬 수 있는 게임이다.");
	}
	
	public void mapleMethod() {
		System.out.println("메이플스토리는 " + this.useAge + "이며, ");
		System.out.println("이 게임의 직업을 크게 나누면 " + this.job + " 등 직업들이 존재한다.");
	}
	
}
public class GamePractice {

	public static void main(String[] args) {
		Game game = new Overwatch("FPS", "화물 밀기, 쟁탈전, 거점 차지", "탱커, 딜러, 힐러"); //업캐스팅
		game.subjectMethod();
		game.interMethod();
		
		Overwatch ow = (Overwatch) game; //다운캐스팅
		ow.overwatchMethod();
		
		System.out.println();
		
		
		game = new MapleStory("RPG", "전체 이용가", "전사, 궁수, 도적, 해적, 마법사");
		game.subjectMethod();
		game.interMethod();
		
		MapleStory maplestory = (MapleStory) game;
		maplestory.mapleMethod();
		
		
	}

}
