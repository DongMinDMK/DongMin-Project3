package countPractice;

class Order{
	String foodName;
	int foodPrice;
	String foodCountry;
	static int orderCount = 0; //정적 변수 orderCount 기본값을 0으로 설정
	
	public Order() {
		orderCount++; //Order 클래스 생성자가 호출이 되면 orderCount를 하나씩 증가시킨다.
	}
}

public class CountPractice {

	public static void main(String[] args) {
		Order order1 = new Order();
		System.out.println("현재 주문된 숫자 : " + order1.orderCount);
		
		Order order2 = new Order();
		System.out.println("현재 주문된 숫자 : " + order2.orderCount);
		
		Order order3 = new Order();
		System.out.println("현재 주문된 숫자 : " + Order.orderCount); //주문 인스턴스를 1개씩 만들고, 현재 주문한 카운트의 수를 출력한다.

	}

}
