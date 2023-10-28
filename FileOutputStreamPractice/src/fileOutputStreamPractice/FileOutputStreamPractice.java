package fileOutputStreamPractice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileOutputStreamPractice {

	public static void main(String[] args) {
		OutputStream out = null;
		
		try {
			out = new FileOutputStream("write_sentence.txt", false);
			String str = "write sentence";
			
			byte[] strArr = str.getBytes(); //문장을 바이트 배열로 변환하여 반환
			out.write(strArr); //지정한 텍스트 파일 경로 위치에다가 바이트 배열 안에 들어있는 데이터 출력
		} catch (IOException e) {
			e.printStackTrace();
		}finally { //try-catch문에서 finally는 참이든 거짓 조건이든 반드시 실행이 되어야 하는 조건
			try {
				if(out != null) { // out 인스턴스가 비어 있지 않다면
					out.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//이 상태로 실행을 하면 write_sentence.txt 텍스트 파일에 위에서 설정한 str 문자열 변수의 데이터가 들어가 있다.
	}

}
