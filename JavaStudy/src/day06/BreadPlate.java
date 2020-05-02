package day06;

public class BreadPlate {
	private int breadCnt = 0; // 빵 재고
	public static int cnt = 1; // 먹은 빵 개수 
	
	void makeBread() {
		if (breadCnt > 19) {
			System.out.print("빵이 가득  찼습니다");
		}
		breadCnt++;
		System.out.println("빵 1개를 만들었습니다. 총: "+breadCnt+"개");
	}
	
	void eatBread() {
		if (cnt == 20) {
			System.out.println("빵이 다 떨어졌습니다.");
		}else if (breadCnt <1) {
			System.out.println("빵이 없습니다. 만들 때까지 기다려주세요.");
		}else {
			breadCnt--;
			cnt++;
			System.out.println("빵 1개를 먹었습니다. 총: "+breadCnt+"개");
		}
	}
}
