package guiPractice2;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GuiPractice2 extends JFrame {
	public GuiPractice2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("메뉴바 만들기");
		
		this.setLayout(new FlowLayout());
		JLabel label = new JLabel("글자가 바뀝니다.");
		this.add(label);
		
		JMenuBar menuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("파일");
		JMenu editMenu = new JMenu("편집");
		
		JMenuItem newItem = new JMenuItem("새 문서");
		JMenuItem openItem = new JMenuItem("문서 열기");
		JMenuItem closeItem = new JMenuItem("문서 닫기");
		
		setJMenuBar(menuBar); //메뉴바를 JFrame에 부착한다.
		
		menuBar.add(fileMenu); //메뉴바에 파일 메뉴를 부착한다.
		menuBar.add(editMenu); //메뉴바에 편집 메뉴를 부착한다.
		
		fileMenu.add(newItem); //파일메뉴에 메뉴 아이템을 부착한다.
		fileMenu.add(openItem);
		fileMenu.addSeparator(); //파일메뉴에 분리할 수 있는 실선을 표시한다.
		fileMenu.add(closeItem);
		
		newItem.addActionListener(new ActionListener() { //새 문서 메뉴 아이템을 선택하면 밑에 적은 setText로 텍스트가 바뀐다.
			public void actionPerformed(ActionEvent e) {
				label.setText("새 문서를 선택하셨습니다!!");
			}
		});
		
		openItem.addActionListener(new ActionListener() { //문서 열기 메뉴 아이템을 선택하면 밑에 적은 setText로 텍스트가 바뀐다.
			public void actionPerformed(ActionEvent e) {
				label.setText("문서 열기를 선택하셨습니다!!");
			}
		});
		
		closeItem.addActionListener(new ActionListener() { //문서 닫기 메뉴 아이템을 선택하면 시스템이 종료된다.
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		setSize(300, 300);
		setVisible(true);
		
		
	}

	public static void main(String[] args) {
		new GuiPractice2();

	}

}
