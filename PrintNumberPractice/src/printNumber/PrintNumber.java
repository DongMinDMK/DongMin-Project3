package printNumber;

import java.util.Scanner;

public class PrintNumber {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int n = scanner.nextInt();
		
		int result = fibo(n);
		
		
		System.out.println(result);
		
	}
	
	static int [] cashe = new int[50];
	
	static int fibo(int n) {
		
		if(n == 1 || n == 2) return 1;
		
		if(cashe[n] != 0) return cashe[n];
		
		cashe[n] = fibo(n-1) + fibo(n-2);
		
		return cashe[n];
		
	}

}
