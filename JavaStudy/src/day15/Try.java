package day15;

public class Try {
	public static void main(String[] args) {
		// ������� + (Alt + Shift + z): try�� ���� �޴� 
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("0���� ���� �� �����ϴ�.");
			System.out.println(e.getMessage());
			e.printStackTrace();	
		}
		System.out.println("����");
		
	}
}
