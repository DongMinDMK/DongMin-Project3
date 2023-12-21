package floatCalcPractice;
import java.util.Scanner;

public class FloatCalcPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		float a,b;
		float result;
		
		System.out.print("연산할 첫번째 실수를 입력 : ");
		a = scanner.nextFloat();
		
		System.out.print("연산할 두번째 실수를 입력 : ");
		b = scanner.nextFloat();
		
		result = a + b;
		System.out.println("  " + a + " + " + b + " = " + result);
		
		result = a - b;
		System.out.println("  " + a + " - " + b + " = " + result);
		
		result = a * b;
		System.out.println("  " + a + " * " + b + " = " + result);
		
		result = a / b;
		System.out.println("  " + a + " / " + b + " = " + result);
		
		result = (int)a % (int)b; //나머지 연산을 하기 위해 a,b를 강제로 정수형으로 변환하여 result에 저장한다.
		System.out.println("  " + (int) a + " % " + (int) b + " = " + (int) result);
		

	}

}
