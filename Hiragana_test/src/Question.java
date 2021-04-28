import java.util.Random;
import java.util.Scanner;

public class Question {

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();

	public void start() {
		System.out.println("\n" + "\n" + "1을 입력하면 문제출력 / 0을 입력하면 종료");
		int a = scanner.nextInt();

		if (a == 1) {
			quest();
		} else if (a == 0) {
			System.out.println("끝났습니다.");
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
		System.out.println("다음중 헤어질때 인사가 아닌것은?");
		System.out.println("----------------------");
		System.out.println("1.さようなら / 2.じゃまた / 3.おはよう  / 4.また, あした / 5. じゃあね");
		int a = scanner.nextInt();
		if (a == 3) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 3번)");
		}
		start();
	}

	private void question18() {
		System.out.println("다음중 만났을때 인사가 아닌것은?");
		System.out.println("----------------------");
		System.out.println("1.おはよう / 2.こんばんは / 3.こんにちは / 4.バイバイ / 5.おはようございます");
		int a = scanner.nextInt();
		if (a == 4) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 4번)");
		}
		start();
	}

	private void question17() {
		System.out.println("다음중 만났을때 인사가 아닌것은?");
		System.out.println("----------------------");
		System.out.println("1.おはよう / 2.こんばんは / 3.こんにちは / 4.バイバイ / 5.おはようございます");
		int a = scanner.nextInt();
		if (a == 2) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 2번)");
		}
		start();
	}

	private void question16() {
		System.out.println("おんせん의 뜻이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.연필 / 2.온천 / 3.만화");
		int a = scanner.nextInt();
		if (a == 2) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 2번)");
		}
		start();
	}

	private void question15() {
		System.out.println("ざっし의 뜻이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.공책 / 2.잡지 / 3.가득");
		int a = scanner.nextInt();
		if (a == 2) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 2번)");
		}
		start();
	}

	private void question14() {
		System.out.println("りょうり의 뜻이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.차 / 2.10 / 3.요리");
		int a = scanner.nextInt();
		if (a == 3) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 3번)");
		}
		start();
	}

	private void question13() {
		System.out.println("さくら의 뜻이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.축제 / 2.유카타 / 3.벛꽃");
		int a = scanner.nextInt();
		if (a == 3) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 3번)");
		}
		start();
	}

	private void question12() {
		System.out.println("ねこ의 뜻이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.입 / 2.고양이 / 3.꽃");
		int a = scanner.nextInt();
		if (a == 2) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 2번)");
		}
		start();
	}

	private void question11() {
		System.out.println("えき의 뜻이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.역 / 2.얼굴 / 3.의자");
		int a = scanner.nextInt();
		if (a == 1) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 1번)");
		}
		start();
	}

	private void question10() {
		System.out.println("わをん이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.와행  / 2.아행 / 3.라행 / 4.야행 / 5.사행");
		int a = scanner.nextInt();
		if (a == 1) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 1번)");
		}
		start();
	}

	private void question9() {
		System.out.println("らりるれろ이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.사행  / 2.아행 / 3.카행 / 4.야행 / 5.라행");
		int a = scanner.nextInt();
		if (a == 5) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 5번)");
		}
		start();
	}

	private void question8() {
		System.out.println("や ゆ よ이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.사행  / 2.아행 / 3.라행 / 4.야행 / 5.와행");
		int a = scanner.nextInt();
		if (a == 4) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 4번)");
		}
		start();
	}

	private void question7() {
		System.out.println("まみむめも이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.아행  / 2.야행 / 3.마행 / 4.나행 / 5.타행");
		int a = scanner.nextInt();
		if (a == 3) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 3번)");
		}
		start();
	}

	private void question6() {
		System.out.println("はひふへほ이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.나행  / 2.하행 / 3.타행 / 4.마행 / 5.사행");
		int a = scanner.nextInt();
		if (a == 2) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 2번)");
		}
		start();
	}

	private void question5() {
		System.out.println("なにぬねの이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.나행  / 2.마행 / 3.라행 / 4.아행 / 5.카행");
		int a = scanner.nextInt();
		if (a == 1) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 1번)");
		}
		start();
	}

	private void question4() {
		System.out.println("たちつてと이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.마행  / 2.하행 / 3.사행 / 4.나행 / 5.타행");
		int a = scanner.nextInt();
		if (a == 5) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 5번)");
		}
		start();
	}

	private void question3() {
		System.out.println("さしすせそ이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.하행  / 2.카행 / 3.나행 / 4.사행 / 5.타행");
		int a = scanner.nextInt();
		if (a == 4) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 4번)");
		}
		start();
	}

	private void question2() {
		System.out.println("かきくけこ이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.아행  / 2.카행 / 3.라행 / 4.마행 / 5.사행");
		int a = scanner.nextInt();
		if (a == 2) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 2번)");
		}
		start();

	}

	private void question1() {
		System.out.println("あいうえお이 무엇인지 고르시오");
		System.out.println("----------------------");
		System.out.println("1.카행  / 2.타행 / 3.아행 / 4.나행 / 5.사행");
		int a = scanner.nextInt();
		if (a == 3) {
			System.out.println("정답!");
		} else {
			System.out.println("오답! (답은 3번)");
		}
		start();
	}

}
