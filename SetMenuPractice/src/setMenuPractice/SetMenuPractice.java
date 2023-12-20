package setMenuPractice;
import java.util.Scanner;

public class SetMenuPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		while(true) {
			System.out.print("안녕하세요! DMK 국수전문점입니다. 주문하시겠습니까?(네/아니오/계산) : ");
			String order = scanner.next();
			
			if(order.equals("네")) {
				System.out.print("1. 잔치국수 2. 비빔국수 3. 김치말이국수 중 원하시는 국수의 번호를 눌러주세요 : ");
				int noodleSelect = scanner.nextInt();
				
				if(noodleSelect == 1) {
					System.out.println("잔치국수를 선택하셨습니다.");
					System.out.print("잔치국수 세트(잔치국수 + 주먹밥)를 주문하시겠습니까? 아니면 잔치국수만 주문하십니까?(세트/일반) : ");
					String setOrOrg = scanner.next();
					
					if(setOrOrg.equals("세트")) {
						System.out.println("잔치국수 세트의 가격은 7500원입니다.");
						cost += 7500;
					}else if(setOrOrg.equals("일반")) {
						System.out.println("잔치국수 일반의 가격은 6000원입니다.");
						cost += 6000;
					}
				}else if(noodleSelect == 2) {
					System.out.println("비빔국수를 선택하셨습니다.");
					System.out.print("비빔국수 세트(비빔국수 + 주먹밥)를 주문하시겠습니까? 아니면 비빔국수만 주문하십니까?(세트/일반) : ");
					String setOrOrg = scanner.next();
					
					if(setOrOrg.equals("세트")) {
						System.out.println("비빔국수 세트의 가격은 8000원입니다.");
						cost += 8000;
					}else if(setOrOrg.equals("일반")) {
						System.out.println("비빔국수 일반의 가격은 7000원입니다.");
						cost += 7000;
					}
				}else if(noodleSelect == 3) {
					System.out.println("김치말이국수를 선택하셨습니다.");
					System.out.print("김치말이국수 세트(김치말이국수 + 주먹밥)를 주문하시겠습니까? 아니면 김치말이국수만 주문하십니까?(세트/일반) : ");
					String setOrOrg = scanner.next();
					
					if(setOrOrg.equals("세트")) {
						System.out.println("김치말이국수 세트의 가격은 9000원입니다.");
						cost += 9000;
					}else if(setOrOrg.equals("일반")) {
						System.out.println("김치말이국수 일반의 가격은 8000원입니다.");
						cost += 8000;
					}
				}
			}else if(order.equals("아니오")) {
				System.out.println("주문하실 때 앞의 키오스크를 이용하시거나 알바생을 호출해주세요.");
				continue;
			}else if(order.equals("계산")) {
				System.out.println("현재 누적된 금액은 " + cost + "원입니다.");
				System.out.print("지불하실 금액을 입력해주세요 : ");
				int userCost = scanner.nextInt();
				
				if(userCost > cost) {
					System.out.println("결제가 완료되었습니다. 거스름돈 " + (userCost - cost) + "원이 반환됩니다.");
					System.out.println("이용해주셔서 감사합니다.");
					break;
				}else if(userCost == cost) {
					System.out.println("결제가 완료되었습니다.");
					System.out.println("이용해주셔서 감사합니다.");
					break;
				}else if(userCost < cost) {
					System.out.println("잔액이 부족합니다. " + (cost - userCost) + "원 만큼의 돈을 더 지불해셔야 결제가 완료되어 음식을 주문하실 수 있습니다.");
					continue;
				}
			}
		}

	}

}
