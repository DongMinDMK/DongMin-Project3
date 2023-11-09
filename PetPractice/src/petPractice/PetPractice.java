package petPractice;

class Pet{
	private String type; //애완동물의 종류
	private int age; //애완동물 나이
	static int petCount = 0; //애완동물 수
	
	public Pet(String type, int age) {
		this.type = type;
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getPetCount() {
		return petCount;
	}

	public static void setPetCount(int petCount) {
		Pet.petCount = petCount;
	}
	
	public void petMove() {
		System.out.println(this.type + "가 집을 움직입니다.");
	}
	
	public void petAge() {
		System.out.println(this.type + "의 나이는 " + this.age + "세 입니다.");
	}
	
}
public class PetPractice {

	public static void main(String[] args) {
		
		
		
		Pet pet1 = new Pet("강아지", 5);
		Pet.petCount++; //static 변수 petCount를 하나 증가시킨다. static 정적변수를 호출할 때는 클래스 이름을 지정하여 호출한다.
		
		Pet pet2 = new Pet("고양이", 9);
		Pet.petCount++;
		
		Pet pet3 = new Pet("고슴도치", 13);
		Pet.petCount++;
		
		System.out.println("총 현재 우리 집 애완동물의 수는 " + Pet.getPetCount() + "마리 입니다.");
		
		System.out.println("집에 있었던 고슴도치 하나가 죽었습니다.");
		Pet.petCount--;
		
		System.out.println("총 현재 우리 집 애완동물의 수는 " + Pet.getPetCount() + "마리 입니다.");
		
		pet1.petMove(); 
		pet2.petMove();
		
		
		pet1.petAge();
		pet2.petAge();
		
	}

}
