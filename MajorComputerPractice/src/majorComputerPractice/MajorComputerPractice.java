package majorComputerPractice;

class Major{
	String university;
	String majorSubject;
	
	public Major(String university, String majorSubject) {
		this.university = university;
		this.majorSubject = majorSubject;
	}
	
	public void computerMajorMethod() {
		System.out.println("서울 포함하여 전국적으로 " + this.university + " 중 컴퓨터학과는 거의 존재한다.");
	}
	
	public void majorSubjectMethod() {
		System.out.println("컴퓨터학과에 재학중인 학생들은 대표적으로 " + this.majorSubject + " 등 각각의 대학교마다 조금씩은 다르지만 비슷한 개발하기 위한 프로그래밍 언어를 배운다.");
	}
}

class Engineer{
	String engineerSub; //개발자 종류
	
	public Engineer(String engineerSub) {
		this.engineerSub = engineerSub;
	}
	
	public void engineerSubMethod() {
		System.out.println("대학교 컴퓨터학과를 졸업한 학생들은 대부분 개발자라는 직종에 취직을 한다.");
		System.out.println("개발자의 종류는 " + this.engineerSub + "등이 존재한다.");
	}
}

public class MajorComputerPractice {

	public static void main(String[] args) {
		Major major = new Major("대학교, 전문대학", "C언어, JAVA, 데이터베이스, Spring Framework, C++");
		major.computerMajorMethod();
		major.majorSubjectMethod();
		
		System.out.println();
		
		Engineer engineer = new Engineer("프론트엔드 개발자, 백엔드 개발자");
		engineer.engineerSubMethod();

	}

}
