import java.util.Random;
import java.util.Scanner;

public class Question {

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	public void start() {
		System.out.println("\n" + "\n" + "1�� �Է��ϸ� ������� / 0�� �Է��ϸ� ����");
		int a = scanner.nextInt();

		if (a == 1) {
			quest();
		} else if (a == 0) {
			System.out.println("�������ϴ�.");
		}

	}

	private void quest() {
		int n = random.nextInt(19) + 1;

		switch (n) {
		case 1:
			question1();
			break;

		case 2:
			question2();
			break;

		case 3:
			question3();
			break;

		case 4:
			question4();
			break;

		case 5:
			question5();
			break;

		case 6:
			question6();
			break;

		case 7:
			question7();
			break;

		case 8:
			question8();
			break;

		case 9:
			question9();
			break;

		case 10:
			question10();
			break;

		case 11:
			question11();
			break;

		case 12:
			question12();
			break;

		case 13:
			question13();
			break;

		case 14:
			question14();
			break;

		case 15:
			question15();
			break;

		case 16:
			question16();
			break;

		case 17:
			question17();
			break;

		case 18:
			question18();
			break;

		case 19:
			question19();
			break;

		}
	}

	private void question19() {
		System.out.println("������ ������� �λ簡 �ƴѰ���?");
		System.out.println("----------------------");
		System.out.println("1.���誦�ʪ� / 2.����ު� / 3.���Ϫ誦  / 4.�ު�, ������ / 5. ���㪢��");
		int a = scanner.nextInt();
		if (a == 3) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 3��)");
		}
		start();
	}

	private void question18() {
		System.out.println("������ �������� �λ簡 �ƴѰ���?");
		System.out.println("----------------------");
		System.out.println("1.���Ϫ誦 / 2.����Ъ�� / 3.����˪��� / 4.�Ы��Ы� / 5.���Ϫ誦�������ު�");
		int a = scanner.nextInt();
		if (a == 4) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 4��)");
		}
		start();
	}

	private void question17() {
		System.out.println("������ �������� �λ簡 �ƴѰ���?");
		System.out.println("----------------------");
		System.out.println("1.���Ϫ誦 / 2.����Ъ�� / 3.����˪��� / 4.�Ы��Ы� / 5.���Ϫ誦�������ު�");
		int a = scanner.nextInt();
		if (a == 2) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 2��)");
		}
		start();
	}

	private void question16() {
		System.out.println("���󪻪��� ���� �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.���� / 2.��õ / 3.��ȭ");
		int a = scanner.nextInt();
		if (a == 2) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 2��)");
		}
		start();
	}

	private void question15() {
		System.out.println("���ê��� ���� �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.��å / 2.���� / 3.����");
		int a = scanner.nextInt();
		if (a == 2) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 2��)");
		}
		start();
	}

	private void question14() {
		System.out.println("��窦���� ���� �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.�� / 2.10 / 3.�丮");
		int a = scanner.nextInt();
		if (a == 3) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 3��)");
		}
		start();
	}

	private void question13() {
		System.out.println("�������� ���� �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.���� / 2.��īŸ / 3.����");
		int a = scanner.nextInt();
		if (a == 3) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 3��)");
		}
		start();
	}

	private void question12() {
		System.out.println("�ͪ��� ���� �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.�� / 2.����� / 3.��");
		int a = scanner.nextInt();
		if (a == 2) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 2��)");
		}
		start();
	}

	private void question11() {
		System.out.println("������ ���� �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.�� / 2.�� / 3.����");
		int a = scanner.nextInt();
		if (a == 1) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 1��)");
		}
		start();
	}

	private void question10() {
		System.out.println("������ �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.����  / 2.���� / 3.���� / 4.���� / 5.����");
		int a = scanner.nextInt();
		if (a == 1) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 1��)");
		}
		start();
	}

	private void question9() {
		System.out.println("�������� �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.����  / 2.���� / 3.ī�� / 4.���� / 5.����");
		int a = scanner.nextInt();
		if (a == 5) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 5��)");
		}
		start();
	}

	private void question8() {
		System.out.println("�� �� ���� �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.����  / 2.���� / 3.���� / 4.���� / 5.����");
		int a = scanner.nextInt();
		if (a == 4) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 4��)");
		}
		start();
	}

	private void question7() {
		System.out.println("�ުߪ����� �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.����  / 2.���� / 3.���� / 4.���� / 5.Ÿ��");
		int a = scanner.nextInt();
		if (a == 3) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 3��)");
		}
		start();
	}

	private void question6() {
		System.out.println("�ϪҪժت��� �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.����  / 2.���� / 3.Ÿ�� / 4.���� / 5.����");
		int a = scanner.nextInt();
		if (a == 2) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 2��)");
		}
		start();
	}

	private void question5() {
		System.out.println("�ʪ˪̪ͪ��� �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.����  / 2.���� / 3.���� / 4.���� / 5.ī��");
		int a = scanner.nextInt();
		if (a == 1) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 1��)");
		}
		start();
	}

	private void question4() {
		System.out.println("�����Īƪ��� �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.����  / 2.���� / 3.���� / 4.���� / 5.Ÿ��");
		int a = scanner.nextInt();
		if (a == 5) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 5��)");
		}
		start();
	}

	private void question3() {
		System.out.println("������������ �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.����  / 2.ī�� / 3.���� / 4.���� / 5.Ÿ��");
		int a = scanner.nextInt();
		if (a == 4) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 4��)");
		}
		start();
	}

	private void question2() {
		System.out.println("������������ �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.����  / 2.ī�� / 3.���� / 4.���� / 5.����");
		int a = scanner.nextInt();
		if (a == 2) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 2��)");
		}
		start();

	}

	private void question1() {
		System.out.println("������������ �������� ���ÿ�");
		System.out.println("----------------------");
		System.out.println("1.ī��  / 2.Ÿ�� / 3.���� / 4.���� / 5.����");
		int a = scanner.nextInt();
		if (a == 3) {
			System.out.println("����!");
		} else {
			System.out.println("����! (���� 3��)");
		}
		start();
	}

}
