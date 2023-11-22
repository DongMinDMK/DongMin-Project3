package guiPractice3;
import java.awt.*;
import javax.swing.*;

public class GuiPractice3 extends JFrame{
	public GuiPractice3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("레이아웃이 존재하지 않는 창 연습");
		
		//레이아웃이 존재하지 않는 버튼 생성하는 GUI 연습
		
		this.setLayout(null);
		JButton btn1 = new JButton("버튼1");
		btn1.setBounds(50,50,100,100); //(50,50) 위치에서 가로 100, 세로 100로 배치
		this.add(btn1);
		
		JButton btn2 = new JButton("버튼2");
		btn2.setBounds(110,110,100,100); // (110,110) 위치에서 가로 100, 세로 100로 배치
		this.add(btn2);
		
		JButton btn3 = new JButton("버튼3");
		btn3.setBounds(150,150,100,100); // (150,150) 위치에서 가로 100, 세로 100로 배치
		this.add(btn3);
		
		setSize(400, 400);
		setVisible(true);
	}
	

	public static void main(String[] args) {
		new GuiPractice3();

	}

}
