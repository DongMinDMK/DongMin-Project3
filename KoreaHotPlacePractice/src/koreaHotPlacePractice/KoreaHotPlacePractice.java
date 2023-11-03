package koreaHotPlacePractice;

class KoreaHotPlace{
	String area;
	String typicalFoodSeoul;
	String typicalFoodBusan;
	String typicalFoodJeju;
	
	public KoreaHotPlace(String area, String typicalFoodSeoul, String typicalFoodBusan, String typicalFoodJeju) {
		this.area = area;
		this.typicalFoodSeoul = typicalFoodSeoul;
		this.typicalFoodBusan = typicalFoodBusan;
		this.typicalFoodJeju = typicalFoodJeju;
	}
	
	public void areaMethod() {
		System.out.println("한국의 대표적인 지역은 " + this.area + "등이 존재한다.");
	}
	
	public void typicalFoodMethod() {
		System.out.println("서울의 대표적인 음식은 " + this.typicalFoodSeoul + "이고, 부산의 대표적인 음식은 " + this.typicalFoodBusan + "이며, 제주도는 " + this.typicalFoodJeju + "이 유명하다.");
	}
}

class AreaCulture{
	String areaCultureSeoul;
	String areaCultureBusan;
	String areaCultureJeju;
	
	public AreaCulture(String areaCultureSeoul, String areaCultureBusan, String areaCultureJeju) {
		this.areaCultureSeoul = areaCultureSeoul;
		this.areaCultureBusan = areaCultureBusan;
		this.areaCultureJeju = areaCultureJeju;
	}
	
	public void areaCulMethod() {
		System.out.println("서울의 대표적인 관광소라 함은 " + this.areaCultureSeoul + "이 있고, 부산은 " + this.areaCultureBusan + "이 있으며 제주도는 " + this.areaCultureJeju + " 등이 있다.");
	}
}

public class KoreaHotPlacePractice {

	public static void main(String[] args) {
		KoreaHotPlace khp = new KoreaHotPlace("서울, 부산, 제주", "전주비빔밥, 천안호두과자", "제주돼지국밥", "제주도한라봉, 제주도초콜렛, 오메기떡");
		khp.areaMethod();
		khp.typicalFoodMethod();
		
		System.out.println();
		
		
		AreaCulture ac = new AreaCulture("경복궁, 창경궁, 숭례문", "스카이워크, 해맞이공원, 해운대 해수욕장", "동문 재래시장");
		ac.areaCulMethod();
		

	}

}
