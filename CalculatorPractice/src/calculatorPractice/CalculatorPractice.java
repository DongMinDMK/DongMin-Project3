package calculatorPractice;
import java.util.Scanner;

public class CalculatorPractice {
	
	static int calc(int val1, int val2, int operation) {
		
		int result = 0;
		
		switch(operation){
		case 1:
			result = val1 + val2;
			break;
		case 2:
			result = val1 - val2;
			break;
		case 3:
			result = val1 * val2;
			break;
		case 4:
			result = val1 / val2;
			break;
		default:
			result = 0; //case 1,2,3,4가 모두 불만족 조건일 때는 default문 수행
		}
		
		return result;
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int answer = 0;
		
		System.out.print("연산자 입력(1 : +, 2 : -, 3 : *, 4 : / ) : ");
		int oper = scanner.nextInt();
		
		
		System.out.print("첫번째 수 입력 : ");
		int a = scanner.nextInt();
		
		System.out.print("두번째 수 입력 : ");
		int b = scanner.nextInt();
		
		answer = calc(a, b, oper);
		
		System.out.println("계산 결과 : " + answer);
		
		
		

	}

}
