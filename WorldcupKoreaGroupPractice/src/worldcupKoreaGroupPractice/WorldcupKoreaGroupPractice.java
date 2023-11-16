package worldcupKoreaGroupPractice;
import java.util.Scanner;

public class WorldcupKoreaGroupPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("2026 북중미 월드컵 아시아 2차예선 C조를 보시겠습니까? (네/아니오) : ");
		String yesorno = scanner.next();
		
		if(yesorno.equals("네")) {
			System.out.println("2026 북중미 월드컵 2차예선 C조입니다.");
			System.out.println("C조에는 대한민국, 중국, 태국, 싱가포르 나라가 위치해 있습니다.");
			System.out.print("각각의 나라의 세계랭킹을 살펴보시겠습니까?(네/아니오) ");
			String worldRank = scanner.next();
			
			if(worldRank.equals("네")) {
				System.out.println("대한민국의 세계랭킹은 24위입니다.");
				System.out.println("중국의 세계랭킹은 80위입니다.");
				System.out.println("태국의 세계랭킹은 112위입니다.");
				System.out.println("싱가포르의 세계랭킹은 155위입니다.");
			}
			
			System.out.print("추가적으로 각 나라의 주요선수를 보시겠습니까? (네/아니오) : ");
			String mainPlayer = scanner.next();
			
			if(mainPlayer.equals("네")) {
				System.out.println("대한민국의 주요 선수는 손흥민, 이강인, 김민재, 황희찬 선수 입니다.");
				System.out.println("중국의 주요 선수는 우레이선수 입니다.");
				System.out.println("태국의 주요 선수는  차나팁 송크라신 선수 입니다.");
				System.out.println("싱가포르의 주요 선수는 하리스 하룬 선수 입니다.");
			}
			
		}else if(yesorno.equals("아니오")) {
			System.out.println("언제든지 C조의 각 나라의 세부를 알고싶으시다면 호출해주세요!");
			
		}
		System.out.println("2차예선을 통과하면 최종예선으로 진출하고 최종예선에서 순위가 좋은 나라에 2026 북중미 월드컵 본선에 진출하게 됩니다.");
		System.out.println("2026 북중미 월드컵 2차예선도 많은 사랑 부탁드립니다!!");
		
		

	}

}
