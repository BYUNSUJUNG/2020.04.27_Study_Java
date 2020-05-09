package day12;

import java.util.Random;

public class ObjectTest {

	public static void main(String[] args) {
		String data1 = new String("ABC");
		String data2 = new String("ABC");
		String data3 = "ABC";
		String data4 = "ABC";
		Random r = new Random();
		Random r2 = new Random();
		
//		 .equals(), == :    �� �ּҰ��� ������ Ȯ���ϴ� �޼���
//							��, String Ŭ�������� quals()�� ������ �Ͽ��� ������
//							String Ÿ���̶�� ���� ���Ѵ�.
		System.out.println(data1.intern() == data2);
		System.out.println(data1.equals(data2));
		System.out.println(data3 == data4);
		System.out.println(data3.equals(data4));
		
		r = r2;
		System.out.println(r.equals(r2));
		System.out.println(r == r2);

/* 
 * 		hashCode()	: �ΰ�ü�� ������ Ȯ���ϴ� �޼���
 * 						������ ���� ��� �� �ϳ��̸� �ٷ��� �����͸� �����ϴ� ���� 
 * 						�����ϰ� ���� �˻��� �����ϴ�
 * 						String Ŭ�������� �������̵� ������, ���� ������ ���� hashCode�� ���´�.
 */
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		System.out.println(data3.hashCode());
		System.out.println(data4.hashCode());
		
		
		
				
		
	}

}
