package question_10;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, flore = 1, man = 0;
		while (true) {
			a = scanner.nextInt();
			if (a != 0) {
				switch (a) {
				case 1:
					flore++;
					System.out.println("⑷營 類 熱 : " + flore + "類 ⑷營 檣錳 熱 : " + man + "貲");
					break;
					
				case 2:
					flore--;
					System.out.println("⑷營 類 熱 : " + flore + "類 ⑷營 檣錳 熱 : " + man + "貲");
					break;
					
				case 3:
					man++;
					System.out.println("⑷營 類 熱 : " + flore + "類 ⑷營 檣錳 熱 : " + man + "貲");
					break;
					
				case 4:
					man--;
					System.out.println("⑷營 類 熱 : " + flore + "類 ⑷營 檣錳 熱 : " + man + "貲");
					break;
				}
			} else {
				break;
			}
		}
		
		
	}
}
