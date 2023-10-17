package restapiMethodPractice;

class Restapi{
	String get;
	String post;
	String put;
	String delete;
	
	public Restapi(String get, String post, String put, String delete) {
		this.get = get;
		this.post = post;
		this.put = put;
		this.delete = delete;
	}
	
	public void restApiMethod() {
		System.out.println("RestApi의 중요성을 웹 쪽에서 중요합니다. ");
		System.out.println("RestApi는 4가지로 구성되어 있습니다. GET, POST, PUT, DELETE 총 4가지 입니다.");
	}
	
	public void getMethod() {
		System.out.println("Rest API의 " + this.get + "은 데이터 조회, 읽기를 하는 메소드이다.");
	}
	
	public void postMethod() {
		System.out.println("Rest API의 " + this.post + "는 데이터 생성을 하는 메소드이다");
	}
	public void putMethod() {
		System.out.println("Rest API의 " + this.put + "은 데이터가 없을 땐 생성, 데이터가 있을 땐 수정을 하는 메소드이다.");
	}
	
	public void deleteMethod() {
		System.out.println("Rest API의 " +  this.delete + "는 데이터를 삭제하는 메소드이다.");
	}
}

public class RestapiMethodPractice {

	public static void main(String[] args) {
		Restapi ra = new Restapi("GET", "POST", "PUT", "DELETE");
		ra.restApiMethod();
		ra.getMethod();
		ra.postMethod();
		ra.putMethod();
		ra.deleteMethod();

	}

}
