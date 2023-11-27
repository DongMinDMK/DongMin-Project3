package returnMethodPractice;

class People{
	String name;
	int age;
	String gender;
	
	public People(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	
	public String nameMethod() {
		
		return this.name;
	}
	
	public int ageMethod() {
		
		return this.age;
	}
	
	public String genderMethod() {
		
		return this.gender;
	}
	
	public void peopleMethod() {
		System.out.println("이 사람의 이름은 " +  this.name + "이고, 나이는 " + this.age + "세 이며, 성별은 " + this.gender + "입니다.");
	}
}

public class ReturnMethodPractice {

	public static void main(String[] args) {
		
		People people1 = new People("홍길동", 30, "남성");
		
		String hongName = people1.nameMethod();
		
		System.out.println("사람1의 이름 : " + hongName);
	
		int hongAge = people1.ageMethod();
		
		System.out.println("사람1의 나이 : " + hongAge);
		
		String hongGender = people1.genderMethod();
		
		System.out.println("사람1의 성별 : " + hongGender);
		
		people1.peopleMethod();
		
		System.out.println();
		
		People people2 = new People("김여자", 21, "여성");
		
		String kimName = people2.nameMethod();
		
		System.out.println("사람2의 이름 : " + kimName);
	
		int kimAge = people2.ageMethod();
		
		System.out.println("사람2의 나이 : " + kimAge);
		
		String kimGender = people2.genderMethod();
		
		System.out.println("사람2의 성별 : " + kimGender);
		
		people2.peopleMethod();

	}

}
