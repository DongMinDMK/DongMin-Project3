package starcraftUnitPractice;

interface StarcraftUnit{
	public abstract void unitMethod();
}

class Protoss implements StarcraftUnit{
	String zilot;
	String dragon;
	String dark_templer;
	
	public Protoss(String zilot, String dragon, String dark_templer) {
		this.zilot = zilot;
		this.dragon = dragon;
		this.dark_templer = dark_templer;
	}

	@Override
	public void unitMethod() {
		System.out.println("스타크래프트 종족에는 프로토스라는 종족이 존재한다.");
		System.out.println("프로토스의 대표적인 유닛이라고 하면 " + this.zilot + ", " + this.dragon + ", " + this.dark_templer + "등이 있다.");
	}
	
	public void protossPlayMethod() {
		System.out.println("프로토스는 초보자, 즉 스타크래프트를 처음 접한 사람이 사용하기 쉬운 종족이다.");
	}
	
	
}

class Zerg implements StarcraftUnit{
	String zergling;
	String hydra;
	String mutallisk;
	
	public Zerg(String zergling, String hydra, String mutallisk) {
		this.zergling = zergling;
		this.hydra = hydra;
		this.mutallisk = mutallisk;
	}

	@Override
	public void unitMethod() {
		System.out.println("스타크래프트 종족에서는 저그라는 종족이 있다.");
		System.out.println("저그의 대표적인 유닛은 " + this.zergling + ", " + this.hydra + " 그리고 " + this.mutallisk + "등이 있다.");
	}
	
	public void zergPlayMethod() {
		System.out.println("저그는 손이 빨라야 하며, 피가 적기 때문에 물량으로 승부를 보는 종족이다.");
	}
	
	
}

class Terran implements StarcraftUnit{
	String marin;
	String tank;
	String medic;
	
	public Terran(String marin, String tank, String medic) {
		this.marin = marin;
		this.tank = tank;
		this.medic = medic;
	}

	@Override
	public void unitMethod() {
		System.out.println("또한 스타크래프트 종족 중에는 테란이라는 종족이 있다.");
		System.out.println("테란 주요 유닛은 " + this.marin + ", " + this.tank + " 그리고 " + this.medic + "등이 존재한다.");
	}
	
	public void terranPlayMethod() {
		System.out.println("테란은 유일하게 인간이라는 모티브를 군인 종족이며, 플레이어들이 제일 플레이 하기 어려운 종족이다.");
	}
	
	
}

public class StarcraftUnitPractice {

	public static void main(String[] args) {
		StarcraftUnit su = new Protoss("질럿", "드라군", "다크템플러");
		su.unitMethod();
		
		Protoss protoss = (Protoss) su;
		protoss.protossPlayMethod();
		
		System.out.println();
		
		su = new Zerg("저글링", "히드라", "뮤탈리스크");
		su.unitMethod();
		
		Zerg zerg = (Zerg) su;
		zerg.zergPlayMethod();
		
		System.out.println();
		
		su = new Terran("마린", "탱크", "메딕");
		su.unitMethod();
		
		Terran terran = (Terran) su;
		terran.terranPlayMethod();

	}

}
