package question_5;

public class Main {
	public static void main(String[] args) {
		
		//for문 사용
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				if (i + j <= 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//while문 사용
		int i = 1;
		while (i <= 5) {
			int j = 1;
			while (j <= 5) {
				if (i + j <= 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
		// do-while문 사용
		int f = 1;
		do {
			int j = 1;
			while (j <= 5) {
				if (f + j <= 6) {
					System.out.print("*");
				} else {
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			f++;
		} while (f <= 5);
			
		
	}
}
