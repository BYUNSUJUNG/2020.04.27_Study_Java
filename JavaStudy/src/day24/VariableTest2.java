package day24;

public class VariableTest2 {
	public static void main(String[] args) {
		VariableTest vt = new VariableTest();
		vt.f(); // 1
		vt.f(); // 2
		vt.f(); // 3
		vt.f2(); // 21
		vt = new VariableTest();
		vt.f(); // 1
	}
}
