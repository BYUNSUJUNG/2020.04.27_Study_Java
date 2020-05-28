package day27;

public class Overloading {
	
	/*  
		오버로딩
		같은 이름의 메서드라도
		매개변수의 갯수 혹은 타입이다르면
		선언 가능하다
	 * */
	
	void add(int num1, int num2) {
		System.out.println("두 정수의 합");
		System.out.println(num1+num2);
	}
	
	void add(int num1, int num2, int num3) {
		System.out.println("세 정수의 합");
		System.out.println(num1+num2+num3);
	}
	
	void add(double num1, double num2) {
		System.out.println("두 실수의 합");
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.add(10,20);
		o.add(10.5,20.5);
		o.add(10,20,30);
	}
}
