package fileReaderPractice;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class FileReaderPractice {

	public static void main(String[] args) {
		int read = 0; 
		Reader reader = null; //밑에서 한번에 선언을 하지 않은 이유는 finally 구문에서 reader를 한번 더 호출을 하기 위해 인스턴스 변수는 여기다 선언
		//try-catch문 밑에다 선언하면 finally reader 인스턴스를 사용하지 못함.
		
		try {
			reader = new FileReader("file_reader_koreanLang.txt"); //FileReader(파일지정) 으로 이 안에 들어있는 텍스트 파일의 데이터를 읽음
			while(true) {
				read = reader.read(); //reader 인스턴스에 read() 메소드를 이용해서 미리 지정한 read 변수에 저장.
				if(read == -1) { //read가 모두 다 읽었다면 -1을 반환해주기 때문에 -1이 반환되면 반복문 탈출
					break;
				}
				System.out.print((char)read); //한글은 1바이트가 아닌 2바이트로 FileInputStream을 이용하면 한글이 깨짐. 
				// 그렇기에 바이트 단위로 읽는 것이 아닌 문자 단위로 읽어오는 FileReader를 이용함.
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Error Message : 바이트 단위로 사용하시면 안됩니다.");
			System.out.println("Error Message : 즉 FileInputStream을 사용하지 마시고 FileReader를 사용하세요.");
		}finally { //try-catch 예외구문에서 반드시 실행되어야 하는 구문, 참이든 거짓이든
			try {
				if(reader != null) {
					reader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
