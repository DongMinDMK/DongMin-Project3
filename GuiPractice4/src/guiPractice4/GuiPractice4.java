package guiPractice4;
import java.awt.*;
import javax.swing.*;

public class GuiPractice4 extends JFrame{
	
	public GuiPractice4() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI 연습 제목");
		
		this.setLayout(new FlowLayout()); //레이아웃 중 FlowLayout 선택
		
		JTextField jf1 = new JTextField(10); //길이가 10짜리인 텍스트필드 생성
		this.add(jf1); //JFrame에 부착
		
		JTextArea ta1 = new JTextArea(5, 12); //여러줄 입력이 가능한 JTextArea 생성, 5행 12열로 구성
		this.add(ta1); //JFrame에 부착
		
		this.add(new JScrollPane(ta1)); //JTextArea에다가는 스크롤바를 추가, 입력하는 행이 5행을 넘는다면 스크롤바를 생성시켜줌
		
		JPasswordField pf1 = new JPasswordField(10); //길이가 10인 JPasswordField 생성
		this.add(pf1); //JFrame에 부착
		
		setSize(250,250);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new GuiPractice4();

	}

}
