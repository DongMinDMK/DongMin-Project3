package exceptionPractice;

public class ExceptionPractice {
	
	public static void main(String[] args) {
		int[] array = new int[5];
		
		try {
			array[4] = 50 / 0;
			array[5] = 50;
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열크기보다 큰 것은 오류가 발생합니다. 배열크기에 맞는 인덱스를 호출해주세요.");
		} catch(ArithmeticException e) {
			System.out.println("정수는 0으로 나누면 오류입니다.");
		} finally {
			System.out.println("try-catch문 말고 finally는 오류든 아니든 무조건 실행됩니다.");
		}
		
		//실행하면 일단 0으로 나눈 예외구문 처리가 먼저 실행됩니다.
		//따라서 ArrayIndexOutOfBoundsException 의 예외처리를 발생시키고 싶을 시 0으로 나눈 배열을 주석처리 해주시면 됩니다.
		//따라서 원하는 예외처리 구문을 출력시키고 싶으실 때는 그 예외와 반대되는 것은 주석처리 하시고 실행하시면 됩니다.
	}
	/*
	public static void main(String[] args) {
		//throws 예외구문 던지는 코드 연습
		
		int a = 100, b = 0;
		int res;
		
		try {
			if(b == 0)
				throw new Exception("0으로 나누면 예외처리가 발생합니다.");
			res = a/b;
		} catch (Exception e) {
			System.out.print("0으로 나누면 생기는 오류구문 ==> ");
			System.out.println(e.getMessage());
			
		}
		
	}
	*/
}


