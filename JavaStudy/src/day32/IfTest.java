package day32;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0; // 첫번째
		int num2 = 0; // 두번째
		
		System.out.println("첫번째 정수 : ");
		num1 = sc.nextInt();

		System.out.println("두번째 정수 : ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("첫번째 정수가 더 큽니다.");
		} else if (num1 < num2) {
			System.out.println("두번째 정수가 더 큽니다.");
		} else { // num1 == num2
			System.out.println("두 수가 같습니다.");
		}
	}
}
