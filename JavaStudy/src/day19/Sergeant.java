package day19;


/*
 * 인터페이스를 이용하면 불필요한 메소드까지 사용해야하지만,
 * 상속를 이용하면 필요한 메소드만 골라서 사용할 수 있다.
 */

public class Sergeant extends Army {
	@Override
	public void play() {
		System.out.println("계속 논다.");
	}
	
	@Override
	public void sleep() {
		System.out.println("계속 잔다.");
	}
	
	@Override
	public void salute() {
		System.out.println("충성!!");
	}
}
