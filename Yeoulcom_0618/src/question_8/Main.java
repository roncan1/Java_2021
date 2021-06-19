package question_8;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int score;
		int a = 100;
		int n[] = new int[10];
		
		for (int i = 0; i < 10; i++) {
			score = scanner.nextInt();
			if (score != 0) {
				
				if (score >= 10 && score <= 19) {
					n[0]++;
					
				} else if (score >= 20 && score <= 29) {
					n[1]++;
					
				} else if (score >= 30 && score <= 39) {
					n[2]++;
					
				} else if (score >= 40 && score <= 49) {
					n[3]++;
					
				} else if (score >= 50 && score <= 59) {
					n[4]++;
					
				} else if (score >= 60 && score <= 69) {
					n[5]++;
					
				} else if (score >= 70 && score <= 79) {
					n[6]++;
					
				} else if (score >= 80 && score <= 89) {
					n[7]++;
					
				} else if (score >= 90 && score <= 99) {
					n[8]++;
					
				} else if (score == 100) {
					n[9]++;
					
				} 
			}else {
				
				for (int j = 9; j >= 0; j--) {
					
					if (n[j] != 0) {
						System.out.println(a + " : " + n[j]);
					}
					a -= 10;
				}
			}
		}
	}
}
