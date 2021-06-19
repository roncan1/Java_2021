package question_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int a[] = new int[10];
	
		int one = scanner.nextInt();
		int two = scanner.nextInt();
		int three = scanner.nextInt();
		int results = one * two * three;
		int b;
		
		while (results != 0) {
			b = results % 10;
			results = results/10;
			a[b]++;
		}
		for (int i = 0; i < 10; i++) {
			System.out.println(a[i]);
		}
	}
}
