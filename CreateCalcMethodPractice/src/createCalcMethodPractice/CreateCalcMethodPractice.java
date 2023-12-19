package createCalcMethodPractice;
import java.util.Scanner;

public class CreateCalcMethodPractice {
	
	public static int calculator(int value1, int value2, int operation) { //operation 연산자를 int형으로 사용한 이유는 switch-case문을 사용할 때 편하게 접근하기 위해 사용합니다.
		int result;
		
		switch(operation) {
		case 1:
			result = value1 + value2;
			break;
		case 2:
			result = value1 - value2;
			break;
		case 3:
			result = value1 * value2;
			break;
		case 4:
			result = value1 / value2;
			break;
		default: //case 1,2,3,4 경우 조건이 전부 만족하지 않을 때 default문 실행
			result = 0;
			System.out.println("아무 조건도 만족하지 않습니다.");
		}
		
		return result;
	}
	

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int result = 0;
		
		System.out.print("연산자 입력[번호로 입력](1. + 2. - 3. *(곱하기) 4. /(나누기)) : ");
		int operation = scanner.nextInt();
		
		System.out.print("계산할 첫번째 숫자 입력 : ");
		int a = scanner.nextInt();
		
		System.out.print("계산할 두번째 숫자 입력 : ");
		int b = scanner.nextInt();
		
		result = calculator(a, b, operation);
		
		System.out.println("리턴 받아 연산한 최종 결과는 : " + result);

	}

}
