package overridingPractice;

class Car{
	int speed = 0;
	
	
	public void fastSpeed(int speed) {
		System.out.println("현재속도(부모클래스) : " + this.speed);
	}
}

class Lamborghini extends Car{
	
	@Override
	public void fastSpeed(int speed) {
		this.speed += speed; //여기서 this.speed는 조상클래스인 Car 클래스의 this.speed
		if(this.speed > 200) {
			this.speed = 200;  //람보르기니 최고속도를 최대 200km로 지정한다.
			System.out.println("현재속도(자식클래스) : " + this.speed);
		}
	}
	
}

class Porsche extends Car{
	
	@Override
	public void fastSpeed(int speed) {
		this.speed += speed; //여기서 this.speed는 조상클래스인 Car 클래스의 this.speed
		if(this.speed > 150) {
			this.speed = 150;  //포르쉐 최고속도를 최대 150km로 지정한다.
			System.out.println("현재속도(자식클래스) : " + this.speed);
		}
	}
}

public class OverridingPractice {

	public static void main(String[] args) {
		Lamborghini lamborghini = new Lamborghini();
		Porsche porsche = new Porsche();
		
		//오버라이딩을 진행하여 부모클래스인 Car클래스의 메소드가 실행되지 않고 자식 클래스의 오버라이딩 메소드가 실행됨.

		
		System.out.print("람보르기니 : ");
		lamborghini.fastSpeed(250); //250으로 설정하면 어떤 값이 출력이 되는지 확인
		
		System.out.println();
		
		
		System.out.print("포르쉐 : ");
		porsche.fastSpeed(250); //250으로 설정하면 어떤 값이 출력이 되는지 확인
		
		

	}

}
