package doubleArrayPractice;

public class DoubleArrayPractice {

	public static void main(String[] args) {
		int[][] aa = new int[2][3];
		int value = 1;
		
		
		for(int i=0; i<2; i++) {
			for(int k=0; k<3; k++) {
				aa[i][k] = value;
				value++;
			}
		}
		
		System.out.println("2차원 배열 aa[0][0]부터 aa[2][3]까지 출력합니다.");
		
		for(int i=0; i<2; i++) {
			for(int k=0; k<3; k++) {
				System.out.printf("%4d", aa[i][k]); //2차원배열을 하나씩 출력하는데 %4d라고 함은 간격을 4로 띄운 상태로 출력한다.
			}
			System.out.printf("\n");
		}
		
		System.out.println();
		
		int [][] bb = new int[3][4];
		
		int value2 = 1;
		
		
		for(int i=0; i<3; i++) {
			for(int k=0; k<4; k++) {
				bb[i][k] = value2;
				value2++;
			}
		}
		
		System.out.println("2차원 배열 bb[0][0]부터 bb[3][4]까지 출력합니다.");
		
		for(int i=0; i<3; i++) {
			for(int k=0; k<4; k++) {
				System.out.printf("%4d", bb[i][k]); //2차원배열을 하나씩 출력하는데 %4d라고 함은 간격을 4로 띄운 상태로 출력한다.
			}
			System.out.printf("\n");
		}

	}

}
