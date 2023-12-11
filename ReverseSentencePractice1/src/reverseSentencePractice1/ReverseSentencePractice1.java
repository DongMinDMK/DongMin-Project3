package reverseSentencePractice1;

import java.util.Scanner;

public class ReverseSentencePractice1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String reverse = "";
		
		System.out.print("문자열을 입력해주세요 : ");
		String sentence = scanner.nextLine();
		
		int count = sentence.length();
		
		for(int i=0; i<count; i++) {
			reverse += sentence.charAt(count - (i+1)); //문자열을 입력받아 문자 하나씩 제일 뒤에서부터 출력하기 위해 reverse 문자열에 누적해서 저장
		}
		
		System.out.println("거꾸로 출력한 결과 : " + reverse);

	}

}
