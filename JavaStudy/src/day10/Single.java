package day10;

/*
 * �̱��� ����
 * �� �Ѱ��� ��ü���� ������ �ִ� Ŭ������ �̱��� �������� �����Ѵ�
 * Ŭ���� ���ο� ��ü�� �����ϰ� �� ��ü�� �ٸ� ������ �������� ����Ѵ�.
 * ��, �� ��ü �ϳ����̴�.
 */
public class Single {
	private Single() {}
	
	private static Single instance = new Single();
	
	public static Single getInstace() {
		return instance;
	}
	
	public void sayHello() {
		System.out.println("�ȳ�");
	}
}
