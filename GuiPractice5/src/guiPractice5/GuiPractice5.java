package guiPractice5;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GuiPractice5 extends JFrame {
	
	public GuiPractice5() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("GUI에서 버튼을 클릭하기");
		
		this.setLayout(new FlowLayout());
		
		JButton btn1 = new JButton("버튼1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setBackground(Color.BLUE); //버튼이 클릭이 되면 버튼 백그라운드색을 파랑색으로 변경
			}
		});
		
		this.add(btn1);
		
		setSize(150, 150);
		setVisible(true);
	}

	public static void main(String[] args) {
		new GuiPractice5();
	}

}
