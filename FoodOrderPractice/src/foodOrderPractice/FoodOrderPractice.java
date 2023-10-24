package foodOrderPractice;
import java.util.Scanner;

public class FoodOrderPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int money = 0;
		
		System.out.print("DMK 한식점에 오신것을 환영합니다. 주문하시겠습니까?(네/아니오): ");
		String yesorno = scanner.next();
		
		while(true) {
			if(yesorno.equals("네")) {
				System.out.print("1. 비빔밥 2. 제육덮밥 3. 오징어덮밥 4. 김치볶음밥 5. 계산 중 원하시는 음식의 번호를 눌러주세요 : ");
				int foodSelect = scanner.nextInt();
				
				if(foodSelect == 1) {
					System.out.print("비빔밥을 선택하셨습니다. 곱빼기를 추가할까요? 아님 일반 비빔밥을 드시겠습니까?(곱빼기/일반) : ");
					String sizeUpOrOrgin = scanner.next();
					
					if(sizeUpOrOrgin.equals("곱빼기")) {
						System.out.println("비빔밥 곱빼기의 가격은 8000원입니다.");
						money += 8000;
					}else if(sizeUpOrOrgin.equals("일반")) {
						System.out.println("비빔밥의 일반 가격은 7000원입니다.");
						money += 7000;
					}
				}else if(foodSelect == 2) {
					System.out.println("죄송합니다. 제육덮밥은 재료가 소진이 되었습니다. 다른 메뉴를 주문해주세요!");
				}else if(foodSelect == 3) {
					System.out.print("오징어덮밥을 선택하셨습니다. 곱빼기를 추가할까요? 아님 일반 오징어덮밥을 드시겠습니까?(곱빼기/일반) : ");
					String sizeUpOrOrgin = scanner.next();
					
					if(sizeUpOrOrgin.equals("곱빼기")) {
						System.out.println("오징어덮밥 곱빼기의 가격은 9000원입니다.");
						money += 9000;
					}else if(sizeUpOrOrgin.equals("일반")) {
						System.out.println("오징어덮밥의 일반 가격은 8000원입니다.");
						money += 8000;
					}
				}else if(foodSelect == 4) {
					System.out.print("김치볶음밥을 선택하셨습니다. 곱빼기를 추가할까요? 아님 일반 김치볶음밥을 드시겠습니까?(곱빼기/일반) : ");
					String sizeUpOrOrgin = scanner.next();
					
					if(sizeUpOrOrgin.equals("곱빼기")) {
						System.out.println("김치볶음밥 곱빼기의 가격은 7000원입니다.");
						money += 7000;
					}else if(sizeUpOrOrgin.equals("일반")) {
						System.out.println("김치볶음밥밥의 일반 가격은 6000원입니다.");
						money += 6000;
					}
				}else if(foodSelect == 5) {
					break;
				}
			}
		}
		
		System.out.println("총 주문하신 음식의 가격은 " + money + "원입니다.");
		System.out.println("이용해주셔서 감사합니다. 즐거운 시간 보내세요!");
	}

}
