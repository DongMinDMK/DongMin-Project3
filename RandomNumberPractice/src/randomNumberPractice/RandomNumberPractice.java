package randomNumberPractice;



public class RandomNumberPractice {
	static int getNumber() {
		return (int) (Math.random() * 5  + 1);
	}

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		int num;
		
		int[] nums1 = {};
		
		
		System.out.println("랜덤으로 숫자 5개를 뽑겠습니다.");
		
		for(int i=0; i<5; i++) {
			num = getNumber(); //숫자 한개를 랜덤으로 정적 메소드를 이용하여 뽑는다. 뽑은 숫자를 num에 저장
			
			System.out.println("랜덤으로 뽑은 숫자 1개는 " + num + "입니다."); //랜덤으로 뽑은 숫자 1개를 출력
			
			
			System.out.printf("배열에서 5개의 숫자 -> ");
			
			for(i=0; i<5; i++) {
				System.out.printf("%d ", nums[i]); //배열 안에 있는 숫자 반복문을 이용하여 출력
			}
			
		}
		

	}

}
