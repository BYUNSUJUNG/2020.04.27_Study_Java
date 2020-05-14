package day15;

public class Try {
	public static void main(String[] args) {
		// 영역잡기 + (Alt + Shift + z): try문 생성 메뉴 
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
		System.out.println("종료");
		
	}
}
