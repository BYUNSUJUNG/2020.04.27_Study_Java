package day19;


/*
 * �������̽��� �̿��ϸ� ���ʿ��� �޼ҵ���� ����ؾ�������,
 * ��Ӹ� �̿��ϸ� �ʿ��� �޼ҵ常 ��� ����� �� �ִ�.
 */

public class Sergeant extends Army {
	@Override
	public void play() {
		System.out.println("��� ���.");
	}
	
	@Override
	public void sleep() {
		System.out.println("��� �ܴ�.");
	}
	
	@Override
	public void salute() {
		System.out.println("�漺!!");
	}
}
