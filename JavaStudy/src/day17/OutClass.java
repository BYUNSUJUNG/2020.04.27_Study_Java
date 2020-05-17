package day17;

/*
 * 내부 클래스 사용법
 * 외부클래스명 객체명 = new 외부클래스생성자();
 * 외부클래스명.내부클래스명 객체명 = 외부클래스객체명.new 내부클래스생성자();
 * 
 * 내부 클래스를 사용하는 이유
 * 캡슐화
 */

public class OutClass {
	int outData;
	
	public OutClass() {
		System.out.println("외부 클래스 생성자 호출 됨.");
	}
	
	public void showOuter() {
		System.out.println("외부 클래스의 메서드 호출됨.");
	}
	
	public class InnerClass {
		public InnerClass() {
			System.out.println("내부 클래스 생성자 호출 됨.");
		}
		
		public void showInner() {
			outData = 20;
			
			System.out.println("내부 클래스의 메서드 호출됨.");
			System.out.println("outData: "+outData);
			showOuter();
		}
		
	}
	
	public static void main(String[] args) {
		OutClass out = new OutClass();
		OutClass.InnerClass in = out.new InnerClass();
		in.showInner();
	} 
	
	
}
