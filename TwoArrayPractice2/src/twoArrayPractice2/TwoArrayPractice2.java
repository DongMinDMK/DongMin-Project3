package twoArrayPractice2;

public class TwoArrayPractice2 {

	public static void main(String[] args) {
		int[][] array2 = new int[9][9];
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				array2[i][j] = (i + 1) * (j + 1);
			}
		}
		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				System.out.printf("%dX%d =%2d ", i+1, j+1, array2[i][j]);
			}
			
			System.out.println();
		}
	}

}
