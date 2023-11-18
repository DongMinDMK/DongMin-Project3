package breadPractice;
import java.util.Scanner;

public class BreadPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int breadPrice = 0;
		
		System.out.println("안녕하세요 DMK 빵집입니다.");
		while(true) {
			System.out.print("주문하시겠습니까? (네/아니오/계산) : ");
			String yesorno = scanner.next();
			
			if(yesorno.equals("네")) {
				System.out.println("저희 빵집에는 다양한 빵 종류가 존재합니다.");
				System.out.print("1. 크림빵 2. 단팥빵 3. 소보루빵 4. 피자빵 중 원하시는 빵의 번호를 입력해주세요 : ");
				int breadSelect = scanner.nextInt();
				
				if(breadSelect == 1) {
					System.out.println("크림빵을 선택하셨습니다.");
					System.out.println("크림빵의 가격은 3000원입니다.");
					breadPrice += 3000;
				}else if(breadSelect == 2) {
					System.out.println("단팥빵을 선택하셨습니다.");
					System.out.println("단팥빵의 가격은 2500원입니다.");
					breadPrice += 2500;
				}else if(breadSelect == 3) {
					System.out.println("소보루빵을 선택하셨습니다.");
					System.out.println("소보루빵의 가격은 4000원입니다.");
					breadPrice += 4000;
				}else if(breadSelect == 4) {
					System.out.println("피자빵을 선택하셨습니다.");
					System.out.println("피자빵의 가격은 4500원입니다.");
					breadPrice += 4500;
				}
				
				System.out.println("계산하시려면 계산 버튼을 눌러주세요 !!");
				
			}else if(yesorno.equals("아니오")) {
				System.out.println("매장 둘러보시고 직원이 필요하시면 언제든지 직원을 불러주세요");
			}else if(yesorno.equals("계산")) {
				System.out.println("고르신 빵의 총 금액은 " + breadPrice + "원 나오셨습니다.");
				System.out.print("지불하실 금액을 입력해주세요 : ");
				int userPrice = scanner.nextInt();
				
				if(userPrice > breadPrice) {
					System.out.println("결제가 완료되었고 " + (userPrice - breadPrice) + "원의 거스름돈을 드리겠습니다.");
					System.out.println("이용해주셔서 감사합니다. 즐거운 시간 되세요");
					break;
				}else if(userPrice == breadPrice) {
					System.out.println("이용해주셔서 감사합니다. 즐거운 시간 되세요");
					break;
				}else {
					System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
					continue;
				}
			}
			
		}
	}

}
