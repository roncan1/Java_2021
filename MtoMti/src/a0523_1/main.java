package a0523_1;

import java.util.Scanner;

public class main {
	
	public main() {
		
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		
		if (user == 1)
		{
			System.out.println("비겼습니다.");
		}

		if (user == 2)
		{
			System.out.println("이겼습니다.");
		}

		if (user == 3)
		{
			System.out.println("졌습니다.");
		}
		
	}
}
