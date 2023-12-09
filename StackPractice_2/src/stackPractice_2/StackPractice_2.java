package stackPractice_2;

import java.util.Scanner;

public class StackPractice_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		char[] stack = new char[5]; //문자형 배열 스택 생성
		int top = 0;
		
		char carName = 'A'; //문자형 A를 디폴트로 가지는 carName 변수 생성
		int select = 0; //정수형 변수 select 디폴트값을 0으로 설정
		
		while(select != 3) { //select 가 3이 아닐 때 반복문(while) 반복
			System.out.print("(1). 자동차 넣기 (2). 자동차 빼기 (3). 끝 : ");
			select = scanner.nextInt();
			
			switch(select) {
			case 1: //자동차 넣기
				if(top >= 5) {
					System.out.println("터널에 자동차가 꽉 차서 더 이상 차가 들어가지 못합니다...");
				}else {
					stack[top] = carName++; //후위증감연산자로 일단 디폴트 값인 A를 먼저 stack 문자형 배열 0번지에 삽입
					System.out.println("자동차 " + stack[top] + "가 터널에 들어감...");
					top++;
				}
				
				break;
				
			case 2: //자동차 빼기
				if(top <= 0) {
					System.out.println("터널에 현재 자동차가 존재하지 않습니다... 1번을 눌러 자동차를 먼저 터널에 넣어주세요..");
				}else { //top 이 0이 아니면 자동차를 터널에서 뺌
					top--;
					System.out.println("자동차 " + stack[top] + "가 터널에서 빠짐...");
					stack[top] = ' ';
				}
				
				break;
				
			case 3:
				System.out.println("현재 터널에 자동차 " + top + "대 존재함...");
				System.out.println("간단한 스택을 이용한 터널에 자동차 넣기 알고리즘을 종료합니다...");
				break;
				
			default: //사용자가 1,2,3 번을 제외한 다른 숫자를 입력하면 실행
				System.out.println("1,2,3 번 중 하나를 입력하세요...");
			}
			
		}
		

	}

}
