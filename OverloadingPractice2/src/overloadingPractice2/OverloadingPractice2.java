package overloadingPractice2;

class Overload{ //오버로딩은 메소드명은 둘이 동일하나 메소드 파라미터가 다른 것을 뜻한다.
	public void addValueMethod(double a, double b) {
		System.out.println("double 형 합을 계산하는 메소드 결과 값 ==> " + (a + b));
	}
	
	public void addValueMethod(int a, int b) {
		System.out.println("int 형 합을 계산하는 메소드 결과 값 ==> " + (a + b));
	}
}

public class OverloadingPractice2 {
	public static void main(String[] args) {
		Overload ol = new Overload();
		ol.addValueMethod(2.0, 2.0); //double 형 addValueMethod 호출
		ol.addValueMethod(2, 2); //int 형 addValueMethod 호출
		
		System.out.println();
		
		ol.addValueMethod(1.0, 1.0);
		ol.addValueMethod(1, 1);
		
	}

}
