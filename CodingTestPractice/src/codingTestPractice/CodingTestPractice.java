package codingTestPractice;

class CodingTest{
	String levelOfDifficulty;
	String company;
	
	public CodingTest(String levelOfDifficulty, String company) {
		this.levelOfDifficulty = levelOfDifficulty;
		this.company = company;
	}
	
	public void codingTestMethod() {
		System.out.println(this.company + "들은 거의 모두 코딩테스트를 IT 관련 직무분야에서 도입하고 있다.");
	}
	
	public void difficultMethod() {
		System.out.println("코딩테스트의 " + this.levelOfDifficulty + "는 네임드 있는 대기업일수록 정말 어려운 수준에 속하기에 정말 열심히 공부를 해야 한다.");
	}
	
	public void tipMethod() {
		System.out.println("코딩테스트 문제가 나오면 무작정 코드를 치지 말고, 그 문제를 먼저 파악하고 이해한다음에 코딩을 쳐야 한다.");
	}
}

public class CodingTestPractice {

	public static void main(String[] args) {
		CodingTest ct = new CodingTest("난이도", "중견기업, 대기업");
		ct.codingTestMethod();
		ct.difficultMethod();
		ct.tipMethod();

	}

}
