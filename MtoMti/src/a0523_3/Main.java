package a0523_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt(),
		case1 = 3 * 3,
		case2 = 3 * 3 * 3,
		case3 = 3 * 3 * 3 * 3;
	

	switch (user)
	{
	case 1: System.out.println(case1);
		break;

	case 2: System.out.println(case2);
		break;

	case 3: System.out.println(case3);
		break;
	}
	}
}
