package reverseInputPractice;
import java.util.Scanner;

class MyClassChar{
	char ch;
}

public class ReverseInputPractice {
	
	static void swapping(MyClassChar a, MyClassChar b) { //파라미터로 입력 받은 a, b를 교환하는 메소드
		char tmp;
		
		tmp = a.ch;
		a.ch = b.ch;
		b.ch = tmp; 
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		MyClassChar ch1 = new MyClassChar();
		MyClassChar ch2 = new MyClassChar();
		
		System.out.print("문자 1개를 입력 : ");
		ch1.ch = (scanner.nextLine()).charAt(0); // -> 입력받은 문자 중 맨 첫번째 문자 하나 입력
		
		System.out.print("문자 2개를 입력 : ");
		ch2.ch = (scanner.nextLine()).charAt(0);
		
		swapping(ch1, ch2);
		
		System.out.println("결과 : " + ch1.ch + " " + ch2.ch);
		

	}

}
