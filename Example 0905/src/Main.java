import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int firsrtNum = scanner.nextInt();
		int secondNum = scanner.nextInt();
		
		int three = secondNum%10;
		System.out.println(firsrtNum * three);
		
		int sa = secondNum%100/10;
		System.out.println(firsrtNum * sa);
		
		int five = secondNum/100;
		System.out.println(firsrtNum * five);
		
		System.out.println(firsrtNum * secondNum);
	}
}

//첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.