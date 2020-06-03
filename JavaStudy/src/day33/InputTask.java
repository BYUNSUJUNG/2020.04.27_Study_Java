package day33;

import java.util.Scanner;

public class InputTask {
	public static void main(String[] args) {
		int num1 = 0, num2 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 2개를 차례로 입력하세요. \n 예) 1 2");
		num1 = Integer.parseInt(sc.next());
		num2 = Integer.parseInt(sc.next());
		System.out.println("결과: "+(num1+num2));
		
	}
}
