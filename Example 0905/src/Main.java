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

//ù° �ٿ� (1)�� ��ġ�� �� �� �ڸ� �ڿ�����, ��° �ٿ� (2)�� ��ġ�� �� ���ڸ� �ڿ����� �־�����.
//ù° �ٺ��� ��° �ٱ��� ���ʴ�� (3), (4), (5), (6)�� �� ���� ����Ѵ�.