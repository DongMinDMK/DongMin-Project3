package chinaFoodPractice2;

interface ChinaFoodInter{
	public abstract void chinaFoodMenuMethod();
	public abstract void chinaFoodPriceMethod();
}

class ChinaFood implements ChinaFoodInter{
	String foodName;
	String foodPrice;
	
	public ChinaFood(String foodName, String foodPrice) {
		this.foodName = foodName;
		this.foodPrice = foodPrice;
	}

	@Override
	public void chinaFoodMenuMethod() {
		System.out.println("중국음식 메뉴는 수많은 음식들이 존재하는데 내가 가장 좋아하는 메뉴 3가지를 뽑으면 " + this.foodName + "이다.");
	}

	@Override
	public void chinaFoodPriceMethod() {
		System.out.println("제일 좋아하는 중국 음식 " + this.foodName + " 음식들은 각각 지역별로 가격이 다르지만 평균금액은 각각 " + this.foodPrice + "원이다.");
	}
	
	public void chinaTypicalFoodMethod() {
		System.out.println("중국 음식 중 대표적인 음식은 자장면, 짬뽕, 볶음밥 등이다.");
		System.out.println("중국 음식은 한국에서도 인기가 많다.");
	}
}

public class ChinaFoodPractice2 {

	public static void main(String[] args) {
		ChinaFoodInter cfi = new ChinaFood("자장면, 탕짜면, 볶음밥", "6000, 9000, 7000");
		cfi.chinaFoodMenuMethod();
		cfi.chinaFoodPriceMethod();
		
		System.out.println();
		
		ChinaFood cf = (ChinaFood) cfi;
		cf.chinaTypicalFoodMethod();
	}

}
