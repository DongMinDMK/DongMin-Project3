package processBarPractice;

import java.awt.*;
import javax.swing.*;

public class ProcessBarPractice extends JFrame implements Runnable { //GUI 를 사용하기 위해 JFrame을 상속받고 스레드를 사용하기 위해 Runnable 인터페이스를 사용한다.
	
	JProgressBar bar1, bar2, bar3;
	
	public ProcessBarPractice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("프로세스바 생성하는 연습하기");
		
		this.setLayout(new GridLayout(3, 1, 10, 10)); //3행 1열 GridLayout 생성
		
		bar1 = new JProgressBar();
		bar1.setValue(50); //50으로 디폴트 초깃값 설정
		bar1.setStringPainted(true); //현재 값을 프로그래스바 중앙에 위치시키게 함.
		
		bar2 = new JProgressBar();
		bar2.setValue(10);
		bar2.setForeground(Color.BLUE); //프로그래스바의 색상을 파랑색으로 지정
		
		bar3 = new JProgressBar();
		bar3.setValue(30);
		bar3.setForeground(Color.RED);
		bar3.setStringPainted(true);
		
		ProcessBarPractice.this.add(bar1);
		ProcessBarPractice.this.add(bar2);
		ProcessBarPractice.this.add(bar3);
		
		setSize(800, 400);
		setVisible(true);
		
	}
	
	

	@Override
	public void run() { //인터페이스 Runnable에 있는 run 메소드 오버라이딩
		for(int i=0; i<100; i++) {
			try {
				Thread.sleep(1000); //1000으로 스레드를 설정하면 1초마다 바뀜
				bar1.setValue(bar1.getValue() + 1);
				bar2.setValue(bar2.getValue() + 2);
				bar3.setValue(bar3.getValue() + 3);  //bar1은 1씩, bar2는 2씩, bar3은 3씩 값이 증가하도록 설정
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}



	public static void main(String[] args) {
		ProcessBarPractice pbp = new ProcessBarPractice();
		Thread th = new Thread(pbp);
		
		th.start();
	}

}
