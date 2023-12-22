package noteBookPractice;

class NoteBook{
	String brand;
	String cost;
	String averDuration;
	
	public NoteBook(String brand, String cost, String averDuration) { //매개변수가 3개 들어있는 생성자
		this.brand = brand;
		this.cost = cost;
		this.averDuration = averDuration;
	}
	
	public void noteBookBrand() {
		System.out.println("노트북 브랜드는 다양한 브랜드가 존재합니다.");
		System.out.println("제가 지금까지 쓴 노트북 브랜드는 " + this.brand + "입니다.");
	}
	
	public void noteBookCost() {
		System.out.println("노트북은 브랜드 그리고 성능, 사양마다 비용이 각각 다릅니다.");
		System.out.println("우리가 알만한 유명한 브랜드의 사양이 높으면 높을수록 당연히 가격은 비쌉니다.");
		System.out.println("저는 노트북을 " + this.cost + " 대의 가격의 노트북을 사용하고 있습니다.");
	}
	
	public void noteBookAverDurMethod() {
		System.out.println("노트북은 원래 평균수명기간이 길지는 않습니다.");
		System.out.println("대부분 평균 노트북을 " + this.averDuration + " 정도 사용하시면 노트북을 바꾸거나 합니다.");
	}
	
}

public class NoteBookPractice {

	public static void main(String[] args) {
		NoteBook noteBook = new NoteBook("삼성", "100~250만원", "3~5년");
		noteBook.noteBookBrand();
		noteBook.noteBookCost();
		noteBook.noteBookAverDurMethod();

	}

}
