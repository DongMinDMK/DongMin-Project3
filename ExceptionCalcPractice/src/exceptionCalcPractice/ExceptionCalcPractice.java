package exceptionCalcPractice;

import java.util.Scanner;

public class ExceptionCalcPractice {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int result = 0;
		
		
		System.out.print("첫번째 숫자를 입력하세요 : ");
		int a = scanner.nextInt();
		
		System.out.print("계산에 활용할 연산자를 입력하세요(+,-,*,/ 중 입력) : ");
		char c = scanner.next().charAt(0);
		
		System.out.print("두번째 숫자를 입력하세요 : ");
		int b = scanner.nextInt();
		
		try {
			switch(c) {
			case '+' :
				result = a + b;
				break;
			case '-' :
				result = a - b;
				break;
			case '*' :
				if(a == 0 || b == 0) 
					throw new Exception("0으로 곱하면 계산 결과는 어차피 0입니다."); //예외면 밑에 catch문에서 예외문 실행을 하러 throws를 이용하여 던짐
					result = a * b;
					break;
			case '/' :
				if(b == 0) 
					throw new Exception("0으로 나누면 안됩니다.");
					result = a / b;
					break;
				
			}
			if(result < 0) {
				throw new Exception("결과가 음수입니다.");
			}
			
			System.out.println("결과 값 : " + result);
		} catch (Exception e) {
			System.out.print("발생 오류 : ");
			System.out.println(e.getMessage()); //위에서 사용자가 예외를 발생시키면 발생시키는 예외 오류에 던진 결과를 받아서 그에 맞는 예외 결과 출력
		}
		
		
		
		

	}

}
