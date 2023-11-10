package guiPractice1;
import java.awt.*;
import javax.swing.*;

public class GuiPractice1 extends JFrame { //GUI를 구현하기 위해 GUI의 모든 조상 클래스인 JFrame 을 상속받아 사용
	public GuiPractice1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //JFrame 창을 닫을 때 디폴트로 닫고, 수행이 종료 될 수 있게 설정
		setTitle("리스트와 콤보박스 출력");
		
		this.setLayout(new FlowLayout()); //FlowLayout은 화면의 왼쪽 위부터 오른쪽으로 차례대로 배치한다. 한 줄이 꽉차면 다음 줄로 내려가서 다시 왼쪽부터 오른쪽으로 배치한다. 배치할 때 각 행은 디폴트 값으로 가운데 정렬을 한다.
		
		String[] cars = {"아반테", "페라리", "람보르기니", "그랜져"};
		
		JList list = new JList(cars); //cars의 안의 배열 데이터들을 list에 추가
		this.add(list);
		
		JComboBox combo = new JComboBox(cars); //드롭다운이 설정되어 있는 리스트(콤보박스)에 cars 안에 들어가 있는 데이터 추가
		this.add(combo);
		
		setSize(400, 400);
		setVisible(true); //이것을 적어야 위에 정의한 JList, JComboBox 가 보임
		
	}

	public static void main(String[] args) {
		
		// main 메소드에서는 위에서 정의한 GUI 프로그래밍을 호출만 하면 됨.
		new GuiPractice1();
	}

}
