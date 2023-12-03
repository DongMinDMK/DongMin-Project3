package toolBarPractice;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ToolBarPractice extends JFrame {
	
	public ToolBarPractice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("간단한 툴바 만들기");
		this.setLayout(new FlowLayout());
		
		JToolBar tb = new JToolBar();
		
		JButton newItem = new JButton("새 문서");
		JButton openItem = new JButton("열기");
		
		this.add(tb, BorderLayout.NORTH);
		tb.add(newItem);
		tb.add(openItem);
		
		JLabel la = new JLabel("글자가 바뀝니다.");
		this.add(la);
		
		newItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				la.setText("[새 문서]를 클릭하면 문자가 이렇게 바뀝니다.");
			}
		});
		
		openItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				la.setText("[열기]를 클릭하면 문자가 이렇게 바뀝니다.");
			}
		});
		
		setSize(400, 400);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new ToolBarPractice();

	}

}
