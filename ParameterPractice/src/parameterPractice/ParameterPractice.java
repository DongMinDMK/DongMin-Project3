package parameterPractice;

class Number{
	int a;
}

public class ParameterPractice {
	
	public static void function(Number n) { //정적 메소드 생성
		n.a = n.a + 1;
		System.out.println("전달받은(함수에서) Number 결과 값 : " + n.a);
	}

	public static void main(String[] args) {
		Number n = new Number();
		n.a = 20;
		
		function(n);
		
		System.out.println("main() 메소드에서 함수 실행 후 리턴으로 돌아온 결과 값 : " + n.a);
		

	}

}
