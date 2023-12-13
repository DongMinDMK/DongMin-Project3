package japanFoodPractice;
import java.util.Scanner;

public class JapanFoodPractice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int cost = 0;
		
		while(true) {
			System.out.print("주문하시겠습니까?(네/아니오/계산) : ");
			String order = scanner.next();
			
			if(order.equals("네")) {
				System.out.print("1. 야끼차슈라멘 2. 매운차슈라멘 3. 일반차슈라멘 4. 규동 중 원하시는 메뉴의 번호를 입력해주세요 : ");
				int ramenSelect = scanner.nextInt();
				
				if(ramenSelect == 1) {
					System.out.println("야끼차슈라멘을 선택하셨습니다.");
					System.out.println("가격은 9000원입니다.");
					cost += 9000;
				}else if(ramenSelect == 2) {
					System.out.println("매운차슈라멘을 선택하셨습니다.");
					System.out.println("가격은 10000원입니다.");
					cost += 10000;
				}else if(ramenSelect == 3) {
					System.out.println("일반차슈라멘을 선택하셨습니다.");
					System.out.println("가격은 11000원입니다.");
					cost += 11000;
				}else if(ramenSelect == 4) {
					System.out.println("규동을 선택하셨습니다.");
					System.out.println("가격은 8000원입니다.");
					cost += 8000;
				}
				
			}else if(order.equals("아니오")) {
				System.out.println("주문하실 때 앞의 키오스크를 이용해주세요.");
			}else if(order.equals("계산")) {
				System.out.print("요금을 투입해주세요 : ");
				int userCost = scanner.nextInt();
				
				if(userCost > cost) {
					System.out.println("결제가 완료되었습니다.");
					System.out.println("거스름돈 " + (userCost - cost) + "원이 반환되었습니다.");
					System.out.println("즐거운 시간 되시기를 바랍니다.");
					break;
				}else if(userCost == cost) {
					System.out.println("결제가 완료되었습니다.");
					System.out.println("즐거운 시간 되시기를 바랍니다.");
					break;
				}else if(userCost < cost) {
					System.out.println("잔액이 부족합니다. ");
					System.out.println((cost - userCost) + "원을 더 넣어주세요!!");
					continue;
				}
			}
		}
		

	}

}
