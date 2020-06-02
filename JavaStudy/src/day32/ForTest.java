package day32;

public class ForTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println("강아지");
		}
		// 1부터 100까지 출력
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
		}
		// 100부터1까지 출력
		for (int i = 0; i < 100; i++) {
			System.out.println(100-i);
		}
		
		// 1부터100까지 짝수만 출력
		for (int i = 0; i < 100; i+=2) {
			System.out.println(i);
		}
		
		// 1부터100까지 홀수만 출력
		for (int i = 0; i < 100; i++) {
			if(i % 2 == 1) {
				System.out.println(i);
			}
		}
		// 1부터100까지의 수 중에  3과 5의 공배수  출력
		for (int i = 0; i < 100; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}
	}
}
