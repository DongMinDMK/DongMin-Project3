package kiosque13;

import java.util.Scanner;

public class Kiosque13 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int cost = 0;
		
		System.out.println("안녕하세요 DMK 빙수집입니다.");
		while(true) {
			System.out.print("주문하시겠습니까?(네/아니오/계산) : ");
			String yesSelect = scanner.next();
			
			if(yesSelect.equals("네")) {
				System.out.print("1. 메론 빙수 2. 망고 빙수 3. 샤인머스캣 빙수 중 원하시는 빙수의 번호를 눌러주세요 : ");
				int icecreamSelect = scanner.nextInt();
				
				if(icecreamSelect == 1) {
					System.out.println("메론 빙수를 선택하셨습니다.");
					System.out.println("메론 빙수의 가격은 7000원입니다.");
					cost += 7000;
				}else if(icecreamSelect == 2) {
					System.out.println("망고 빙수를 선택하셨습니다.");
					System.out.println("망고 빙수의 가격은 8000원입니다.");
					cost += 8000;
				}else if(icecreamSelect == 3) {
					System.out.println("샤인머스캣 빙수를 선택하셨습니다.");
					System.out.println("샤인머스캣 빙수의 가격은 9000원입니다.");
					cost += 9000;
				}
			}else if(yesSelect.equals("아니오")) {
				System.out.println("주문하실 때 앞의 키오스크를 이용해주세요.");
			}else if(yesSelect.equals("계산")) {
				System.out.print("지불하실 금액을 넣어주세요 : ");
				int userCost = scanner.nextInt();
				
				if(userCost > cost) {
					System.out.println("계산이 완료되었습니다. 거스름돈 " + (userCost - cost) + "원이 잠시만 기다리시면 반환됩니다.");
					System.out.println("이용해주셔서 감사합니다.");
					break;
				}else if(userCost == cost) {
					System.out.println("결제가 완료되었습니다. 이용해주셔서 감사합니다.");
					break;
				}else if(userCost < cost) {
					System.out.println("잔액이 부족합니다.");
					System.out.println((cost - userCost) + "원을 더 투입해 주시기 바랍니다.");
					continue;
				}
			}
		}
		

	}

}
