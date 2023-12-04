package threadPractice;

class Car{
	String carName;
	
	public Car(String carName) {
		this.carName = carName;
	}
	
	public void run() {
		for(int i=0; i<3; i++) {
			try {
				Thread.sleep(1000); //1000으로 스레드를 설정하면 1000이 1초에 해당
				
				System.out.println(carName + "이 달립니다~~");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreadPractice {

	public static void main(String[] args) {
		Car car1 = new Car("$자동차");
		car1.run();
		
		Car car2 = new Car("@자동차");
		car2.run();
		
		Car car3 = new Car("*자동차");
		car3.run();
	}

}
