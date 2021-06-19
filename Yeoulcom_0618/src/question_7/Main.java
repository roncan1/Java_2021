package question_7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] a = new int[2][3],
				b = new int[2][3],
				c = new int[2][3];
		
		System.out.println("first array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				a[i][j] = scanner.nextInt();
			}
		}
		
		System.out.println("second array");
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				b[i][j] = scanner.nextInt();
			}
		}
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] * b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
		
	}
}
