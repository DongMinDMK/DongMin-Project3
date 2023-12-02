package guiPractice7_1;
import java.awt.*;
import javax.swing.*;

public class GuiPractice7_1 extends JFrame {
	
	public GuiPractice7_1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("많은 컴포넌트 부착 연습하기");
		
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("버튼1");
		this.add(btn1);
		
		JLabel la1 = new JLabel("문자열 1개입니다...");
		JLabel la2 = new JLabel("문자열 1개입니다...");
		this.add(la1);
		this.add(la2);
		
		JCheckBox check1 = new JCheckBox("C언어");
		JCheckBox check2 = new JCheckBox("자바", true); //true를 붙이면 그 체크박스가 선택이 된 것으로 초깃값 설정
		JCheckBox check3 = new JCheckBox("스프링 부트");
		
		this.add(check1);
		this.add(check2);
		this.add(check3);
		
		JRadioButton radio1 = new JRadioButton("축구");
		JRadioButton radio2 = new JRadioButton("배구");
		JRadioButton radio3 = new JRadioButton("야구");
		
		this.add(radio1);
		this.add(radio2);
		this.add(radio3);
		
		ButtonGroup bg = new ButtonGroup(); //버튼그룹을 생성해 라디오버튼을 버튼그룹에 첨부함으로써 라디오버튼은 1가지만 선택 가능하게 설정
		bg.add(radio1);
		bg.add(radio2);
		bg.add(radio3);
		
		setSize(175, 300);
		setVisible(true);	
		
	}

	public static void main(String[] args) {
		new GuiPractice7_1();

	}

}
