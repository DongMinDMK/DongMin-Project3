package homeAppliancePractice;

interface HomeApplianceInter{
	public abstract void applianceNameMethod();
	public abstract void applianceCostMethod();
}

class HomeAppliance implements HomeApplianceInter{
	String name;
	String cost;
	
	public HomeAppliance(String name, String cost) {
		this.name = name;
		this.cost = cost;
	}

	@Override
	public void applianceNameMethod() {
		System.out.println("일반 가정용 집 가전제품의 이름들을 3개만 뽑자면 " + this.name + "등이 있다.");
	}

	@Override
	public void applianceCostMethod() {
		System.out.println("위의 가전제품들의 이름을 기준으로 하나씩 순서대로 대략 비용은 " + this.cost + "원 정도이다.");
	}
	
	public void homeApplianceMethod() {
		System.out.println("가정용 집 가전제품들은 꼭 필요하고, 많은 비용이 들지만 반드시 마련해야 한다.");
		System.out.println("특히 개발자들은 기업에서 뿐만 아니라 집에서도 작업을 진행해야 하기 때문에 노트북 마련은 필수적이다.");
	}
}

public class HomeAppliancePractice {

	public static void main(String[] args) {
		HomeApplianceInter hai = new HomeAppliance("노트북, 냉장고, 전자레인지", "150~200만원, 200~300만원, 50~100만원");
		hai.applianceNameMethod();
		hai.applianceCostMethod();
		
		System.out.println();
		
		HomeAppliance ha = (HomeAppliance) hai;
		ha.homeApplianceMethod();
		

	}

}
