package charAtAndAscIICodePrac;

public class CharAtAndAscIICodePrac {

	public static void main(String[] args) {
		String str = "I34LOVE23JAVA";
		
		String str1 = ""; // 임의의 문자열 str1 생성
		
		for(int i=0; i<str.length(); i++) {
			//charAt(i) 메서드는 문자열 중 i번째 하나씩 뽑음
			char ch = str.charAt(i);
			int asciiExchange = ch; //char형 ch를 정수형 asciiExchange로 변환
			
			//아스키코드 10진수로 65~90은 대문자 A~Z를 의미하고, 97~122는 소문자 a~z를 의미한다.
			if((asciiExchange >= 65 && asciiExchange <= 90) || (asciiExchange >= 97 && asciiExchange <= 122)) {
				str1 += ch; //대문자 A~Z, 그리고 소문자 a~z에 해당하는 문자열이 str1에 존재하면 str1에 하나씩 누적산하여 추가
			}else { //대문자 A~Z, 그리고 소문자 a~z가 아닌 문자가 str에 있으면 공백으로 처리하여 str1에 누적산
				str1 += " ";
			}
		}
		
		System.out.println(str1); //누적산 처리한 결과값을 보여주는 출력문 출력

	}

}
