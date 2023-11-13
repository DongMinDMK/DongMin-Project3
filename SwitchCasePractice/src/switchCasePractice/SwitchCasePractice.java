package switchCasePractice;

import java.util.Scanner;

public class SwitchCasePractice {
	static int coffeeMachine(int button) {
		System.out.println();
		System.out.println("# 1.자동으로 뜨거운 물을 준비한다");
		System.out.println("# 2. 자동으로 종이컵을 준비한다.");
		
		switch(button) { //매개변수로 입력받은 button을 활용하여 각각의 실행마다 다른 값을 출력한다. 이때 switch-case문을 이용
		//switch-case문은 반드시 조건에 맞는 한 문장이 실행결과가 끝나면 break문을 적어 switch-case문을 빠져나가야 한다. 아니면 그 다음 실행조건결과까지 이어서 출력된다.
		case 1:
			System.out.println("# 3. 자동으로 보통커피를 탄다.");
			break;
		case 2:
			System.out.println("# 3. 자동으로 믹스커피를 탄다.");
			break;
		case 3:
			System.out.println("# 3. 자동으로 블랙커피를 탄다.");
			break;
		case 4:
			System.out.println("# 3. 자동으로 설탕커피를 탄다.");
			break;
		case 5:
			System.out.println("# 3. 자동으로 아무거나 선택해서 커피를 탄다.");
			break;
		
		}
		
		System.out.println("# 4. 자동으로 물을 붓는다.");
		System.out.println("# 5. 자동으로 스푼으로 저어서 녹인다.");
		
		return 0;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int coffee, result;
		
		System.out.print("커피를 주문하시겠다면 어떤 커피를 드릴까요? (1. 보통커피 2. 믹스커피 3. 블랙커피 4. 설탕커피 5. 아무거나) : ");
	    coffee = scanner.nextInt(); //여기서 손님이 선택한 번호를 static 메소드의 매개변수 파라미터로 받아 그 받은 값에 해당하는 swtich - case문을 수행
	    
	    result = coffeeMachine(coffee); 
	    
	    System.out.println("커피 준비가 완료되었습니다.");
		
	}

}
