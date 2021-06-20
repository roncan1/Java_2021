package question_1;

import java.util.Scanner;

public class Main {
	Scanner scanner = new Scanner(System.in);
	int stack[] = new int[scanner.nextInt()];
	
	public static void main(String[] args) {
		Main main = new Main();
		String a;
		for (int i = 0; i < main.stack.length; i++) {
			a = main.scanner.next();
			switch (a) {
			case "i":
				int dat = main.scanner.nextInt();
				main.push(dat);
				break;
			case "o":
				main.top();
				break;
			case "c":
				main.size();
				break;
			}
			
		}
	}
	
	private void empty() {
		boolean empty = true;
		for (int i = 0; i < stack.length; i++) {
			if (stack[i] != 0) {
				empty = false;
			}
		}
		System.out.println(empty);
	}
	
	private void size() {
		int size = 0;
		for (int i = 0; i < stack.length; i++) {
			if (stack[i] != 0) {
				size++;
			}
		}
		System.out.println(size);
	}
	
	private void top() {
		int i = stack.length-1;
		while (true) {
			if (stack[i] != 0) {
				System.out.println(stack[i]);
				stack[i] = 0;
				break;
			} else if (i == 0 && stack[i] == 0) {
				System.out.println("empty");
				break;
			}
			i--;
		}
	}
	
	private void push(int data) {
		for (int i = 0; i < stack.length; i++) {
			if (stack[i] == 0) {
				stack[i] = data;
				i = stack.length;
			}
		}
	}
	
	private void pop() {
		int i = stack.length-1;
		while (true) {
			if (stack[i] != 0) {
				stack[i] = 0;
				break;
			}
			i--;
		}
	}
}
