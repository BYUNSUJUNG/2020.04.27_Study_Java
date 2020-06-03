package day33;

import java.util.Scanner;

public class Input {
	public static void main(String[] args) {
		String name = "";
		Scanner sc = new Scanner(System.in);
		// A.b : A안에 b
		System.out.println("이름이 뭐니?");
		name = sc.next();
		System.out.println(name);
	}
}
