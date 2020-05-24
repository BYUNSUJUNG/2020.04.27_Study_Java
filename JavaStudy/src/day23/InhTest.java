package day23;

class A {
	int data = 10;
	
	public A() {}
	
	void show() {
		System.out.println("A클래스");
	}
}

class B extends A {
	
	@Override
	void show() {
		System.out.println("B클래스");
	}
	void checck() {
		show();
	}
	
}


public class InhTest {
	public static void main(String[] args) {
		B instance = new B();
		instance.checck();
	}
}
