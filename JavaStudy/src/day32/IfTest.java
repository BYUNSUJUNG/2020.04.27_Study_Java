package day32;

import java.util.Scanner;

public class IfTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = 0; // ù��°
		int num2 = 0; // �ι�°
		
		System.out.println("ù��° ���� : ");
		num1 = sc.nextInt();

		System.out.println("�ι�° ���� : ");
		num2 = sc.nextInt();
		
		if (num1 > num2) {
			System.out.println("ù��° ������ �� Ů�ϴ�.");
		} else if (num1 < num2) {
			System.out.println("�ι�° ������ �� Ů�ϴ�.");
		} else { // num1 == num2
			System.out.println("�� ���� �����ϴ�.");
		}
	}
}
