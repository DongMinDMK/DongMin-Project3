package coffeePractice;
import java.util.Scanner;

public class CoffeePractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 0;
		
		System.out.println("안녕하십니까 DMK 카페입니다.");
		
		while(true) {
			System.out.print("주문하시겠습니까?(네/아니오/계산) : ");
			String order = scanner.next();
			
			if(order.equals("네")) {
				System.out.print("1. 아메리카노 2. 카페라떼 3. 카라멜마끼야또 4. 카페모카 중 원하시는 커피의 번호를 입력해주세요 : ");
				int coffeeSelect = scanner.nextInt();
				
				if(coffeeSelect == 1) {
					System.out.print("아메리카노를 선택하셨습니다. 아메리카노는 HOT/ICE 종류가 있습니다. 어떤 것을 드시겠습니까? (HOT/ICE) : ");
					String ameHotorIce = scanner.next();
					
					if(ameHotorIce.equals("HOT") || ameHotorIce.equals("hot")) {
						System.out.println("따뜻한 아메리카노를 선택하셨군요!!");
						System.out.println("따뜻한 아메리카노의 가격은 1500원입니다.");
						cost += 1500;
					}else if(ameHotorIce.equals("ICE") || ameHotorIce.equals("ice")) {
						System.out.println("아이스 아메리카노를 선택하셨군요!!");
						System.out.println("아이스 아메리카노의 가격은 2000원입니다.");
						cost += 2000;
					}
				}else if(coffeeSelect == 2) {
					System.out.print("카페라떼를 선택하셨습니다. 카페라떼는 HOT/ICE 종류가 있습니다. 어떤 것을 드시겠습니까? (HOT/ICE) : ");
					String latteHotorIce = scanner.next();
					
					if(latteHotorIce.equals("HOT") || latteHotorIce.equals("hot")) {
						System.out.println("따뜻한 카페라떼를 선택하셨군요!!");
						System.out.println("따뜻한 카페라떼의 가격은 2500원입니다.");
						cost += 2500;
					}else if(latteHotorIce.equals("ICE") || latteHotorIce.equals("ice")) {
						System.out.println("아이스 카페라떼를 선택하셨군요!!");
						System.out.println("아이스 카페라떼의 가격은 3000원입니다.");
						cost += 3000;
					}
				}else if(coffeeSelect == 3) {
					System.out.print("카라멜마끼야또를 선택하셨습니다. 카라멜마끼야또는 HOT/ICE 종류가 있습니다. 어떤 것을 드시겠습니까? (HOT/ICE) : ");
					String caramelHotorIce = scanner.next();
					
					if(caramelHotorIce.equals("HOT") || caramelHotorIce.equals("hot")) {
						System.out.println("따뜻한 카라멜마끼야또를 선택하셨군요!!");
						System.out.println("따뜻한 카라멜마끼야또의 가격은 4000원입니다.");
						cost += 4000;
					}else if(caramelHotorIce.equals("ICE") || caramelHotorIce.equals("ice")) {
						System.out.println("아이스 카라멜마끼야또를 선택하셨군요!!");
						System.out.println("아이스 카라멜마끼야또의 가격은 4500원입니다.");
						cost += 4500;
					}
				}else if(coffeeSelect == 4) {
					System.out.print("카페모카를 선택하셨습니다. 카페모카는 HOT/ICE 종류가 있습니다. 어떤 것을 드시겠습니까? (HOT/ICE) : ");
					String mocaHotorIce = scanner.next();
					
					if(mocaHotorIce.equals("HOT") || mocaHotorIce.equals("hot")) {
						System.out.println("따뜻한 카페모카를 선택하셨군요!!");
						System.out.println("따뜻한 카페모카의 가격은 3500원입니다.");
						cost += 3500;
					}else if(mocaHotorIce.equals("ICE") || mocaHotorIce.equals("ice")) {
						System.out.println("아이스 카페모카를 선택하셨군요!!");
						System.out.println("아이스 카페모카의 가격은 4000원입니다.");
						cost += 4000;
					}
				}
			}else if(order.equals("아니오")) {
				System.out.println("주문하실 때 앞의 키오스크나 매장 점원을 호출해주세요");
			}else if(order.equals("계산")) {
				System.out.print("현재 총 누적금액은 " + cost + "원입니다. 얼마를 지불하시겠습니까? ");
				int customerCost = scanner.nextInt();
				
				if(customerCost > cost) {
					System.out.println("결제가 정상적으로 완료되었습니다. 거스름돈 " + (customerCost - cost) + "원을 반환해드리겠습니다.");
					System.out.println("이용해주셔서 감사합니다.");
					break;
				}else if(customerCost == cost) {
					System.out.println("결제가 정상적으로 완료되었습니다.");
					System.out.println("이용해주셔서 감사합니다.");
					break;
				}else if(customerCost < cost) {
					System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다. " + (cost - customerCost) + "원 만큼 돈을 더 넣어주십시오.");
					continue;
				}
			}
		}

	}

}
