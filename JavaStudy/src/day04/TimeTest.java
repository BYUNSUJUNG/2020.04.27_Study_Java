package day04;

import java.nio.file.ProviderNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class TimeTest {
	public static void main(String[] args) {
		Date d = new Date();
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		String dOfWeek [] = {"��","��","ȭ","��","��","��","��"};
		// Calendar Ŭ������ singleton�������� ����� Ŭ������ ��ü�� ����� ����� �� �ִ�.
		// ��ü�� ���� ����� �� ���� Ŭ������ ���ο� �ڽ��� Ŭ������ ���� ��ü�� �����ϰ� �ֱ� ������
		// Ŭ���� ���ο� ������ �ִ� �ڽ��� ��ü�� ������ �޼ҵ�� (getInstance()) �ڽ��� ��ü�� 
		// ���ͼ� ����Ѵ�.
		
		// singleton�������� �����ϴ� Ŭ������ ���α׷����� �� 1���� �ʿ��� ��ü�� single
		// Calendar�� DAY_OF_WEEK�� �Ͽ���(1), ������(2), ......, �����(7)�̴�
		// Calendar���� �����Ǿ� �ִ� �Լ��� ���� ���� ���� 1�� ��������Ѵ�.
		System.out.println(d);
		System.out.println(c);
		System.out.println(sdf.format(c.getTime()));
		System.out.println("��: "+c.get(Calendar.YEAR));
		System.out.println("��: "+(c.get(Calendar.MONTH))+1);
		System.out.println("��: "+c.get(Calendar.DATE));
		System.out.println("��: "+c.get(Calendar.DAY_OF_MONTH));
		System.out.println("����: "+c.get(Calendar.DAY_OF_WEEK));
		System.out.println(dOfWeek[c.get(Calendar.DAY_OF_WEEK)-1]+"����");
		
		// Date Ŭ������ 1900���� ������ ��¥�� ó���Ѵ�.
		// ���� �������� 1900�� ���ؼ� ���;� �ϰ�, �־��ַ��� 1900�� ���� �־���� �Ѵ�.
		// ���� �������� 1�� ���ؼ� ���;� �ϰ�, �־��ַ��� 1�� ���� �־�� �Ѵ�.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �� ��: ");
		int year = sc.nextInt() - 1900;
		int month = sc.nextInt() - 1;
		int day = sc.nextInt();
		
		Date date = new Date(year,month,day);
		System.out.println(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
		System.out.print(sdf2.format(date));
	}
}
