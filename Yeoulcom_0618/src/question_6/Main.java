package question_6;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (i + j == n-1) {
					System.out.print(n%(n-1));
				} else if (i + j == n){
					System.out.print(n%(n-2));
				} else if (i + j == n+1){
					System.out.print(n);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
