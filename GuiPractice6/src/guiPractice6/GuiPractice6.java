package guiPractice6;

import java.awt.*;
import javax.swing.*;

public class GuiPractice6 extends JFrame {
	
	public GuiPractice6() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("버튼 생성과 툴팁 텍스트 적기");
		
		Container c = this.getContentPane();
		c.setBackground(Color.CYAN);
		
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("버튼1");
		btn1.setBackground(Color.BLUE); //setBackground : 배경색 변경
		btn1.setForeground(Color.MAGENTA); //setForeground : 글자 색 변경
		this.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.setFont(new Font("맑은고딕", Font.BOLD, 40)); //버튼2 폰트를 맑은고딕, 볼드체로 설정하고 크기는 40으로 설정
		btn2.setCursor(new Cursor(Cursor.WAIT_CURSOR)); //버튼2 위에 커서를 놓으면 회전 모양의 커서로 변경되도록 설정
		
		btn2.setToolTipText("툴팁 설정!!"); //툴팁은 버튼2에 커서를 올리면 작은 도움말 생성되도록 설정
		this.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.setEnabled(false); //버튼3을 사용하지 못하도록 즉 비활성화 시킴
		this.add(btn3);
		
		setVisible(true);
		setSize(400, 400);
	}

	public static void main(String[] args) {
		new GuiPractice6();

	}

}
