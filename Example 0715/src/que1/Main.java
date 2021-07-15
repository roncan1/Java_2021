package que1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i = scanner.nextInt();
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + " x " + j + " = " + i*j);
			}
		
	}
}