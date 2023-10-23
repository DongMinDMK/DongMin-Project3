package transportationPractice;

interface Transportation{
	public abstract void transportMethod();
}

class Bus implements Transportation{
	String adult;
	String student;
	String kid;
	int adultCost;
	int studentCost;
	int kidCost;
	
	public Bus(String adult, String student, String kid, int adultCost, int studentCost, int kidCost) {
		this.adult = adult;
		this.student = student;
		this.kid = kid;
		this.adultCost = adultCost;
		this.studentCost = studentCost;
		this.kidCost = kidCost;
		
	}

	@Override
	public void transportMethod() {
		System.out.println("교통수단 중에서는 버스가 있다.");
	}
	
	public void busMethod() {
		System.out.println("승객이 나이에 따라 요금이 달라진다.");
		System.out.println("일단 " + this.kid + "요금은 " + this.kidCost + "원이고, " + this.student + "의 요금은 " + this.studentCost + "원, 그리고 " + this.adult + "의 요금은 " + this.adultCost + "원이다.");
	}
}

class Subway implements Transportation{
	String adult;
	String student;
	String kid;
	int adultCost;
	int studentCost;
	int kidCost;
	
	public Subway(String adult, String student, String kid, int adultCost, int studentCost, int kidCost) {
		this.adult = adult;
		this.student = student;
		this.kid = kid;
		this.adultCost = adultCost;
		this.studentCost = studentCost;
		this.kidCost = kidCost;
		
	}

	@Override
	public void transportMethod() {
		System.out.println("교통수단 중에는 지하철도 있다.");
	}
	
	public void subwayMethod() {
		System.out.println("승객이 나이에 따라 요금이 달라진다.");
		System.out.println("일단 " + this.kid + "요금은 " + this.kidCost + "원이고, " + this.student + "의 요금은 " + this.studentCost + "원, 그리고 " + this.adult + "의 요금은 " + this.adultCost + "원이다.");
	}
}

public class TransportationPractice {

	public static void main(String[] args) {
		
		System.out.println("교통수단 --------- 버스");
		
		Transportation t = new Bus("성인", "학생", "어린이", 900, 480, 300);
		t.transportMethod();
		
		Bus bus = (Bus) t;
		bus.busMethod();
		
		System.out.println("교통수단 --------- 지하철");
		
		t = new Subway("성인", "학생", "어린이", 1250, 900, 550);
		t.transportMethod();
		
		Subway subway = (Subway) t;
		subway.subwayMethod();

	}

}
