package day27;

public class Overloading {
	
	/*  
		�����ε�
		���� �̸��� �޼����
		�Ű������� ���� Ȥ�� Ÿ���̴ٸ���
		���� �����ϴ�
	 * */
	
	void add(int num1, int num2) {
		System.out.println("�� ������ ��");
		System.out.println(num1+num2);
	}
	
	void add(int num1, int num2, int num3) {
		System.out.println("�� ������ ��");
		System.out.println(num1+num2+num3);
	}
	
	void add(double num1, double num2) {
		System.out.println("�� �Ǽ��� ��");
		System.out.println(num1+num2);
	}
	
	public static void main(String[] args) {
		Overloading o = new Overloading();
		o.add(10,20);
		o.add(10.5,20.5);
		o.add(10,20,30);
	}
}
