package removeToothPractice;

import java.util.Scanner;

public class RemoveToothPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cost = 200000;
		
		System.out.println("환영합니다 DMK 치과입니다.");
		
		while(true) {
			System.out.print("진료를 보시겠습니까? (네/아니오) : ");
			String yesorno = scanner.next();
			
			if(yesorno.equals("네")) {
				System.out.println("환자가 진료보러 들어가는중....");
				System.out.print("환자 : 몇 개의 발치를 해야 하나요?(1/2/3/4/5/6) : ");
				int removeTooth = scanner.nextInt();
				
				switch(removeTooth) {
				case 1 :
					System.out.println("의사 : 1개만 발치해면 됩니다.");
					System.out.println("그러므로 " + cost + "원이 필요합니다.");
					System.out.print("돈을 지불해주세요 : ");
					int payMoney = scanner.nextInt();
					
					if(payMoney > cost) {
						System.out.println("결제가 완료되었고 " + (payMoney - cost) + "원의 거스름돈이 반환되었습니다.");
						break;
					}else if(payMoney == cost) {
						System.out.println("결제가 성공적으로 완료되었습니다.");
						break;
					}else if(payMoney < cost){
						System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
						System.out.println("발치는 선불요금제 이기 때문에 요금을 먼저 지불해주십시오.");
						continue;
					}
				case 2:
					System.out.println("의사 : 2개를 발치하셔야 됩니다.");
					System.out.println("그러므로 " + (cost*2) + "원이 필요합니다.");
					System.out.print("돈을 지불해주세요 : ");
					int payMoney2 = scanner.nextInt();
					
					if(payMoney2 > cost*2) {
						System.out.println("결제가 완료되었고 " + (payMoney2 - cost*2) + "원의 거스름돈이 반환되었습니다.");
						break;
					}else if(payMoney2 == cost*2) {
						System.out.println("결제가 성공적으로 완료되었습니다.");
						break;
					}else if(payMoney2 < cost*2){
						System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
						System.out.println("발치는 선불요금제 이기 때문에 요금을 먼저 지불해주십시오.");
						continue;
					}
				case 3:
					System.out.println("의사 : 3개를 발치하셔야 됩니다.");
					System.out.println("그러므로 " + (cost*3) + "원이 필요합니다.");
					System.out.print("돈을 지불해주세요 : ");
					int payMoney3 = scanner.nextInt();
					
					if(payMoney3 > cost*3) {
						System.out.println("결제가 완료되었고 " + (payMoney3 - cost*3) + "원의 거스름돈이 반환되었습니다.");
						break;
					}else if(payMoney3 == cost*3) {
						System.out.println("결제가 성공적으로 완료되었습니다.");
						break;
					}else if(payMoney3 < cost*3){
						System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
						System.out.println("발치는 선불요금제 이기 때문에 요금을 먼저 지불해주십시오.");
						continue;
					}
				case 4:
					System.out.println("의사 : 4개를 발치하셔야 됩니다.");
					System.out.println("그러므로 " + (cost*4) + "원이 필요합니다.");
					System.out.print("돈을 지불해주세요 : ");
					int payMoney4 = scanner.nextInt();
					
					if(payMoney4 > cost*4) {
						System.out.println("결제가 완료되었고 " + (payMoney4 - cost*4) + "원의 거스름돈이 반환되었습니다.");
						break;
					}else if(payMoney4 == cost*4) {
						System.out.println("결제가 성공적으로 완료되었습니다.");
						break;
					}else if(payMoney4 < cost*4){
						System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
						System.out.println("발치는 선불요금제 이기 때문에 요금을 먼저 지불해주십시오.");
						continue;
					}
				case 5:
					System.out.println("의사 : 5개를 발치하셔야 됩니다.");
					System.out.println("그러므로 " + (cost*5) + "원이 필요합니다.");
					System.out.print("돈을 지불해주세요 : ");
					int payMoney5 = scanner.nextInt();
					
					if(payMoney5 > cost*5) {
						System.out.println("결제가 완료되었고 " + (payMoney5 - cost*5) + "원의 거스름돈이 반환되었습니다.");
						break;
					}else if(payMoney5 == cost*5) {
						System.out.println("결제가 성공적으로 완료되었습니다.");
						break;
					}else if(payMoney5 < cost*5){
						System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
						System.out.println("발치는 선불요금제 이기 때문에 요금을 먼저 지불해주십시오.");
						continue;
					}
				case 6:
					System.out.println("의사 : 6개를 발치하셔야 됩니다.");
					System.out.println("그러므로 " + (cost*6) + "원이 필요합니다.");
					System.out.print("돈을 지불해주세요 : ");
					int payMoney6 = scanner.nextInt();
					
					if(payMoney6 > cost*6) {
						System.out.println("결제가 완료되었고 " + (payMoney6 - cost*6) + "원의 거스름돈이 반환되었습니다.");
						break;
					}else if(payMoney6 == cost*6) {
						System.out.println("결제가 성공적으로 완료되었습니다.");
						break;
					}else if(payMoney6 < cost*6){
						System.out.println("잔액이 부족하여 결제를 진행하실 수 없습니다.");
						System.out.println("발치는 선불요금제 이기 때문에 요금을 먼저 지불해주십시오.");
						continue;
					}
				
				}
			}else if(yesorno.equals("아니오")) {
				System.out.println("진료 보기를 원하실 때 카운터에 얘기해주세요.");
			}
			
			break;
			
		}
		
		System.out.println("즐거운 시간 되세요!!");
		System.out.println("발치는 추후 일정을 통해 진행됩니다.");
		
		

	}
}

