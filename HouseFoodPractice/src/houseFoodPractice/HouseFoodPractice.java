package houseFoodPractice;

interface House_Food_Inter{
	public abstract void houseFoodMethod();
}

interface House_Location_Inter{
	public abstract void houseLocationMethod();
}


class MyHouse_Food implements House_Food_Inter{
	String foodName;
	String eatingCount;
	
	public MyHouse_Food(String foodName, String eatingCount) {
		this.foodName = foodName;
		this.eatingCount = eatingCount;
	}

	@Override
	public void houseFoodMethod() {
		System.out.println("우리 집은 다양하게 먹을 음식이 많이 있습니다.");
		System.out.println("대표적으로 집 음식들은 " + this.foodName + "등 많은 음식이 있습니다.");
		System.out.println("우리 가족들은 밥을 " + this.eatingCount + "정도 먹습니다.");
	}
	
	public void houseMethod() {
		System.out.println("요즘 음식 물가가 비싸기 때문에 대부분 집에서 밥을 해결합니다.");
	}
	
	

}

class MyHouse_Location implements House_Location_Inter{
	String location;
	String movingHouseCount;
	
	public MyHouse_Location(String location, String movingHouseCount) {
		this.location = location;
		this.movingHouseCount = movingHouseCount;
	}

	@Override
	public void houseLocationMethod() {
		System.out.println("우리 집의 현재 위치는 " + this.location + "에 위치해 있습니다.");
	}
	
	public void movingCountMethod() {
		System.out.println("현재 우리집은 이사 온지 " + this.movingHouseCount + "된 오래된 집입니다.");
	}
	
	
}

public class HouseFoodPractice {

	public static void main(String[] args) {
		House_Food_Inter mfi = new MyHouse_Food("과자, 라면, 만두, 핫도그", "하루 3번"); //업캐스팅
		mfi.houseFoodMethod();
		
		MyHouse_Food mf = (MyHouse_Food) mfi; //다운캐스팅 형변환
		mf.houseMethod();
		
		System.out.println();
		
		House_Location_Inter mli = new MyHouse_Location("서울특별시 노원구", "27년"); //업캐스팅
		mli.houseLocationMethod();
		
		MyHouse_Location ml = (MyHouse_Location) mli; //다운캐스팅
		ml.movingCountMethod();
	}

}
