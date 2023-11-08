package twoArrayPractice;
import java.util.Scanner;

public class TwoArrayPractice {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int row = 0;
		int col = 0;
		
		System.out.print("행 개수를 입력 : ");
		row = scanner.nextInt();
		
		System.out.print("열 개수를 입력 : ");
		col = scanner.nextInt();
		
		int[][] array = new int[row][col]; //입력받은 행과 열을 행x열로 2차원 배열로 지정
		
		
		
		int val = 1;
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				array[i][j] = val; //0행부터 1부터 차례대로 오름차순으로 row x col 로 지정
				val++; //1부터 증가
			}
		}
		
		System.out.printf("array[0][0] 부터 array[%d][%d] 까지 출력합니다. \n" , row, col);
		
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				System.out.printf("%4d", array[i][j]); //2차원 배열에 저장된 값을 출력한다. 여기서 %Nd는 정수형을 출력하되 N만큼 숫자와 숫자 간격을 띄우고 지정
			}
			System.out.println();
		}
	}

}
