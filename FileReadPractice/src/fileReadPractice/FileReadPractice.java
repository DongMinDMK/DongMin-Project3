package fileReadPractice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class FileReadPractice {

	public static void main(String[] args) {
		int read = 0; //파일을 읽어올 변수
		
		InputStream in = null;
		
		try {
			in = new FileInputStream("myFile.txt"); //텍스트 파일을 읽을 fileInputStream 설정
			while(true) {
				read = in.read(); //파일 읽기 -> read()메소드는 데이터를 바이트 타입으로 읽어오기 때문에 문자를 출력할 때는 형변환을 반드시 설정해야 한다.
				if(read == -1) { //더 이상 읽을 문자가 없다면 -1 반환
					break;
				}
				
				System.out.print((char)read); //형변환 설정
			}
		}catch (IOException e) {
			System.out.println("에러 메시지 : " + e.getMessage());
		}finally { //try-catch문에서 반드시 실행해야 되는 구문 finally
			try {
				if(in != null) {
					in.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
