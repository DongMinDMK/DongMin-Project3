package peopleCountCountryPractice;

interface Country{
	public abstract void countryMethod();
}

class Asia implements Country{
	String countryName;
	String countryCount;
	
	public Asia(String countryName, String countryCount) {
		this.countryName = countryName;
		this.countryCount = countryCount;
	}

	@Override
	public void countryMethod() {
		System.out.println("전 세계 대륙 중 아시아 대륙이 있습니다.");
	}
	
	public void asiaCountryNameMethod() {
		System.out.println("아시아에는 정말 수많은 나라가 존재하지만 대표적으로 " + this.countryName + "나라가 있습니다.");
	}
	
	public void asiaCountryCountMethod() {
		System.out.println(this.countryName + "나라의 인구수는 각각 " + this.countryCount + "명입니다.");
	}

}
class Europe implements Country{
	String countryName;
	String countryCount;
	
	public Europe(String countryName, String countryCount) {
		this.countryName = countryName;
		this.countryCount = countryCount;
	}

	@Override
	public void countryMethod() {
		System.out.println("전 세계 대륙 중 유럽 대륙이 있습니다.");
	}
	
	public void europeCountryNameMethod() {
		System.out.println("유럽에도 수많은 나라가 존재합니다. 대표적으로 " + this.countryName + "가 존재합니다.");
		System.out.println("이외에도 수많은 나라들이 있습니다.");
	}
	
	public void europeCountryCountMethod() {
		System.out.println(this.countryName + "나라의 인구수는 각각 " + this.countryCount + "명입니다.");
	}
}

class Africa implements Country{
	String countryName;
	String countryCount;
	
	public Africa(String countryName, String countryCount) {
		this.countryName = countryName;
		this.countryCount = countryCount;
	}

	@Override
	public void countryMethod() {
		System.out.println("전 세계 대륙 중 아프리카 대륙이 있습니다.");
	}
	
	public void africaCountryNameMethod() {
		System.out.println("아프리카에도 수많은 나라들이 존재합니다. 그중에서도 대표적으로 " + this.countryName + "가 존재합니다.");
	}
	
	public void africaCountryCountMethod() {
		System.out.println(this.countryName + "나라의 인구수는 각각 " + this.countryCount + "명입니다.");
	}
}

public class PeopleCountCountryPractice {

	public static void main(String[] args) {
		Country country = new Asia("대한민국, 일본, 베트남", "5천만명, 1억2천만명, 9800만명");
		country.countryMethod();
		
		Asia asia = (Asia) country;
		asia.asiaCountryNameMethod();
		asia.asiaCountryCountMethod();
		
		System.out.println();
		
		country = new Europe("프랑스, 스페인, 독일", "6400만, 4700만, 8300만");
		country.countryMethod();
		
		Europe europe = (Europe) country;
		europe.europeCountryNameMethod();
		europe.europeCountryCountMethod();
		
		System.out.println();
		
		country = new Africa("이집트, 가나, 남아프리카공화국", "1억 1200만명, 3400만명, 6000만명");
		country.countryMethod();
		
		Africa africa = (Africa) country;
		africa.africaCountryNameMethod();
		africa.africaCountryCountMethod();
		
		

	}

}
