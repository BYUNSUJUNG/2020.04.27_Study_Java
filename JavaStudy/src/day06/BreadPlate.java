package day06;

public class BreadPlate {
	private int breadCnt = 0; // �� ���
	public static int cnt = 1; // ���� �� ���� 
	
	void makeBread() {
		if (breadCnt > 19) {
			System.out.print("���� ����  á���ϴ�");
		}
		breadCnt++;
		System.out.println("�� 1���� ��������ϴ�. ��: "+breadCnt+"��");
	}
	
	void eatBread() {
		if (cnt == 20) {
			System.out.println("���� �� ���������ϴ�.");
		}else if (breadCnt <1) {
			System.out.println("���� �����ϴ�. ���� ������ ��ٷ��ּ���.");
		}else {
			breadCnt--;
			cnt++;
			System.out.println("�� 1���� �Ծ����ϴ�. ��: "+breadCnt+"��");
		}
	}
}
