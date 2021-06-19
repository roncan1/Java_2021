package question_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		if (a > b) {
			c = a;
		} else {
			c = b;
		}
		for (int i = 1; i <= c; i++) {
			if (a%i == 0 && b%i == 0) {
				System.out.print(i + ", ");
			}
		}
	}
}
