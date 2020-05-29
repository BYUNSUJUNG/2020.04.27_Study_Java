package day28;
/*
 * 	메서드
		이름():메서드
		단, 키워드()는 메서드가 아니다
		
		
		(1) 리턴타입 메서드명(자료형 매개변수1, ......) {
			실행할 문장;
			return 리턴값;
		}
		
		(2) void 메서드명(자료형 매개변수1, ......) {
			실행할 문장;
		}
		
		(3) void 메서드명() {
			실행할 문장;
		}
		
	메서드 주의사항
		매개변수가 없는 메서드는 외부에서 값을 전달받을 수 없다.
		리턴값이 있는 메서드는 사용시 전체를 리턴 값으로 보자
		메서드 내부에 다른 메서드를 선언할 수 없다(단, 사용은 가능하다)
		메서드 선언시 매개변수는 저장공간이고,
		 사용시에는 값을 그 자리 순서에 맞게 넣어준다.


 * */
public class MethodTest {

	static int add(int num1, int num2) {
		System.out.println("add메서드 입니다.");
		return num1+num2;
	}
	
	public static void main(String[] args) {
		add(3,7); // static int add
		MethodTest m = new MethodTest();
		m.add(3,7); // int add
	}
	
	
}
