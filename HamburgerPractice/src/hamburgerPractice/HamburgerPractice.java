package hamburgerPractice;
import java.util.Scanner;

public class HamburgerPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int burgerCost = 0;
		
		while(true) {
			System.out.print("환영합니다!! DMK버거 입니다. 주문하시겠습니까?(네/아니오/계산) : ");
			String yesorno = scanner.next();
			
			if(yesorno.equals("네")) {
				System.out.print("1. 데리버거 2. 통새우버거 3. 싸이버거 4. 고기야채버거 중 원하시는 버거의 번호를 눌러주세요 : ");
				int burgerSelect = scanner.nextInt();
				
				if(burgerSelect == 1) {
					System.out.print("데리버거를 선택하셨습니다. 데리버거 단품으로 드시겠습니까 세트로 드시겠습니까? (단품/세트) : ");
					String singleOrSet = scanner.next();
					
					if(singleOrSet.equals("단품")) {
						System.out.println("데리버거 단품의 가격은 4800원입니다.");
						burgerCost += 4800;
					}else if(singleOrSet.equals("세트")) {
						System.out.println("데리버거 세트의 가격은 7100원입니다.");
						burgerCost += 7100;
					}
				}else if(burgerSelect == 2) {
					System.out.print("통새우버거를 선택하셨습니다. 통새우버거 단품으로 드시겠습니까 세트로 드시겠습니까? (단품/세트) : ");
					String singleOrSet = scanner.next();
					
					if(singleOrSet.equals("단품")) {
						System.out.println("통새우버거 단품의 가격은 5300원입니다.");
						burgerCost += 5300;
					}else if(singleOrSet.equals("세트")) {
						System.out.println("통새우버거 세트의 가격은 8500원입니다.");
						burgerCost += 8500;
					}
				}else if(burgerSelect == 3) {
					System.out.print("싸이버거를 선택하셨습니다. 싸이버거 단품으로 드시겠습니까 세트로 드시겠습니까? (단품/세트) : ");
					String singleOrSet = scanner.next();
					
					if(singleOrSet.equals("단품")) {
						System.out.println("싸이버거 단품의 가격은 6000원입니다.");
						burgerCost += 6000;
					}else if(singleOrSet.equals("세트")) {
						System.out.println("싸이버거 세트의 가격은 9100원입니다.");
						burgerCost += 9100;
					}
				}else if(burgerSelect == 4) {
					System.out.print("고기야채버거를 선택하셨습니다. 고기야채버거 단품으로 드시겠습니까 세트로 드시겠습니까? (단품/세트) : ");
					String singleOrSet = scanner.next();
					
					if(singleOrSet.equals("단품")) {
						System.out.println("고기야채버거 단품의 가격은 7500원입니다.");
						burgerCost += 7500;
					}else if(singleOrSet.equals("세트")) {
						System.out.println("고기야채버거 세트의 가격은 10000원입니다.");
						burgerCost += 10000;
					}
				}
			}else if(yesorno.equals("아니오")) {
				System.out.println("주문하실 때 앞의 키오스크를 이용하시거나 매장 직원을 호출해주세요!!");
				continue;
			}else if(yesorno.equals("계산")) {
				System.out.print("얼마를 지불하시겠습니까? ");
				int userCost = scanner.nextInt();
				
				if(userCost > burgerCost) {
					System.out.println("결제가 완료되었고 거스름돈 " + (userCost - burgerCost) + "원이 반환되었습니다.");
					System.out.println("저희 DMK 매장을 이용해주셔서 감사합니다.");
					break;
				}else if(userCost == burgerCost) {
					System.out.println("결제가 완료되었습니다.");
					System.out.println("저희 DMK 매장을 이용해주셔서 감사합니다.");
					break;
				}else if(userCost < burgerCost) {
					System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
					System.out.println("메뉴로 돌아갑니다....");
					continue;
				}
			}
			
		}
	}

}
