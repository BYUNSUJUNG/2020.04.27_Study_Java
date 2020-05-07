package day10;

/*
 * 싱글톤 패턴
 * 단 한개의 객체만을 가지고 있는 클래스를 싱글톤 패턴으로 구현한다
 * 클래스 내부에 객체를 생성하고 그 객체를 다른 곳에서 공통으로 사용한다.
 * 즉, 그 객체 하나뿐이다.
 */
public class Single {
	private Single() {}
	
	private static Single instance = new Single();
	
	public static Single getInstace() {
		return instance;
	}
	
	public void sayHello() {
		System.out.println("안녕");
	}
}
