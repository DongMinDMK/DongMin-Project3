package hashMapPractice1;

import java.util.HashMap;

public class HashMapPractice1 {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
		System.out.println("----현재 잉글랜드 프리미어리그 순위(10/21일 기준, 1위부터 5위까지)----");
		
		hm.put(1, "토트넘 홋스퍼 FC");
		hm.put(2, "아스널 FC");
		hm.put(3, "맨체스터 시티 FC");
		hm.put(4, "리버풀 FC");
		hm.put(5, "아스톤 빌라 FC");
		
		System.out.println(hm.get(1));
		System.out.println(hm.get(2));
		System.out.println(hm.get(3));
		System.out.println(hm.get(4));
		System.out.println(hm.get(5));
		
		System.out.println("----토트넘, 맨체스터 시티, 리버풀 팀의 주요선수----");
		
		HashMap<String, String> hm1 = new HashMap<String, String>();
		
		hm1.put("토트넘", "손흥민, 제임스 매디슨");
		hm1.put("맨체스터 시티", "엘링 홀란드, 케빈 더브라위너");
		hm1.put("리버풀", "버질 반데이크, 무하메드 살라");
		
		System.out.println(hm1.get("토트넘"));
		System.out.println(hm1.get("맨체스터 시티"));
		System.out.println(hm1.get("리버풀"));
		
		

	}

}
