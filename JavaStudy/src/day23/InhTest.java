package day23;

class A {
	int data = 10;
	
	public A() {}
	
	void show() {
		System.out.println("AŬ����");
	}
}

class B extends A {
	
	@Override
	void show() {
		System.out.println("BŬ����");
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
