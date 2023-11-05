package myFullFoodPractice;

interface MyFullFood{
	public abstract void fullFoodMethod(); //추상메소드
}

class Rice implements MyFullFood{
	String riceName;
	String country;
	
	public Rice() {
		
	}
	
	public Rice(String riceName, String country) {
		this.riceName = riceName;
		this.country = country;
	}
	
	
	@Override
	public void fullFoodMethod() {
		System.out.println("제가 음식을 먹는 기준 제일 든든하게 배가 차는 음식은 뭐니뭐니해도 쌀로 만든 음식입니다.");
	}


	public String riceMethod() {
		riceName = "비빔밥";
		return riceName;
	}
	
	public String countryMethod() {
		country = "대한민국";
		return country;
	}
}

class Noodle implements MyFullFood{
	String size;
	String noodleName;
	
	public Noodle(String size, String noodleName) {
		this.size = size;
		this.noodleName = noodleName;
	}

	@Override
	public void fullFoodMethod() {
		System.out.println("그리고 면 종류도 있습니다. 하지만 면 종류는 밥 종류보단 양을 좀 더 많아야 합니다.");
	}
	
	public void sizeMethod() {
		System.out.println("면 종류는 모든 메뉴에 " + this.size + "가 들어가야 합니다.");
	}
	
	public void noodleMethod() {
		System.out.println("면 종류의 음식은 정말 많습니다. 그중에서도 저는 " + this.noodleName + " 등을 좋아합니다.");
	}
	
	
}
public class MyFullFoodPractice {

	public static void main(String[] args) {
		String riceName;
		String country;
		
		MyFullFood mff = new Rice(); //업캐스팅
		mff.fullFoodMethod();
		
		Rice rice = (Rice) mff; //다운캐스팅
		
		riceName = rice.riceMethod();
		System.out.println("제가 제일 좋아하는 쌀 종류의 음식은 " + riceName + "입니다.");
		
		country = rice.countryMethod();
		System.out.println(riceName + "의 음식은 " + country + "의 대표적인 음식입니다.");
		
		System.out.println();
		
		mff = new Noodle("곱빼기", "자장면, 짬뽕, 잡채, 콩국수");
		mff.fullFoodMethod();
		
		Noodle noodle = (Noodle) mff;
		noodle.sizeMethod();
		noodle.noodleMethod();
		
		
	}

}
