package day17;

/*
 * ���� Ŭ���� ����
 * �ܺ�Ŭ������ ��ü�� = new �ܺ�Ŭ����������();
 * �ܺ�Ŭ������.����Ŭ������ ��ü�� = �ܺ�Ŭ������ü��.new ����Ŭ����������();
 * 
 * ���� Ŭ������ ����ϴ� ����
 * ĸ��ȭ
 */

public class OutClass {
	int outData;
	
	public OutClass() {
		System.out.println("�ܺ� Ŭ���� ������ ȣ�� ��.");
	}
	
	public void showOuter() {
		System.out.println("�ܺ� Ŭ������ �޼��� ȣ���.");
	}
	
	public class InnerClass {
		public InnerClass() {
			System.out.println("���� Ŭ���� ������ ȣ�� ��.");
		}
		
		public void showInner() {
			outData = 20;
			
			System.out.println("���� Ŭ������ �޼��� ȣ���.");
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
