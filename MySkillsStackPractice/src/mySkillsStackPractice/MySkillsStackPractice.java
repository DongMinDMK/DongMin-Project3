package mySkillsStackPractice;

class MySkills{
	String license;
	String project;
	String mySchoolCareer;
	String codingTest = "너무 어려움";
	
	public MySkills(String license, String project, String mySchoolCareer){
		this.license = license;
		this.project = project;
		this.mySchoolCareer = mySchoolCareer;
	}
	
	public void myMethod() {
		System.out.println("제 기술스택과 스펙 중에서 일단 자격증은 " + this.license + "를 보유중입니다.");
		System.out.println("프로젝트는 " + this.project + "이 있고, 현재도 진행중입니다.");
	}
	
	public void carrerMethod() {
		System.out.println("제 학력은 " + this.mySchoolCareer + "를 나와 졸업을 하였습니다.");
	}
	public void dreamMethod() {
		System.out.println("제 꿈인 웹 개발자로 취직하는 것이 제 목표이자 꿈입니다.");
	}
}

public class MySkillsStackPractice {

	public static void main(String[] args) {
		MySkills ms = new MySkills("자동차운전면허 1종, 컴퓨터활용능력 1급, 정보처리기사", "개인프로젝트, 팀프로젝트, 개인적으로 운영하는 카페", "대학교 4년제");
		ms.myMethod();
		ms.carrerMethod();
		ms.dreamMethod();
		
		System.out.println("IT 직종 관련 취직을 할 때 코딩테스트는 필수적이다. 하지만 코딩테스트의 난이도는 " + ms.codingTest + "으로 인해 정말 많은 준비가 필요하다.");
		System.out.println("나의 바램 : 힘들다.... 코딩테스트.... 합격하고 취직하고싶다..");
	}

}
