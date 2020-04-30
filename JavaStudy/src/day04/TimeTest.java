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
		String dOfWeek [] = {"일","월","화","수","목","금","토"};
		// Calendar 클래스는 singleton패턴으로 설계된 클래스로 객체를 만들어 사용할 수 있다.
		// 객체를 만들어서 사용할 수 없는 클래스는 내부에 자신의 클래스로 만든 객체를 포함하고 있기 때문에
		// 클래스 내부에 가지고 있는 자신의 객체를 얻어오는 메소드로 (getInstance()) 자신의 객체를 
		// 얻어와서 사용한다.
		
		// singleton패턴으로 설계하는 클래스는 프로그램에서 딱 1개만 필요한 객체를 single
		// Calendar의 DAY_OF_WEEK는 일요일(1), 월요일(2), ......, 토요일(7)이다
		// Calendar에서 지정되어 있는 함수로 월을 구할 때는 1을 더해줘야한다.
		System.out.println(d);
		System.out.println(c);
		System.out.println(sdf.format(c.getTime()));
		System.out.println("년: "+c.get(Calendar.YEAR));
		System.out.println("월: "+(c.get(Calendar.MONTH))+1);
		System.out.println("일: "+c.get(Calendar.DATE));
		System.out.println("일: "+c.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일: "+c.get(Calendar.DAY_OF_WEEK));
		System.out.println(dOfWeek[c.get(Calendar.DAY_OF_WEEK)-1]+"요일");
		
		// Date 클래스는 1900년을 기준을 날짜를 처리한다.
		// 년을 얻어오려면 1900을 더해서 얻어와야 하고, 넣어주려면 1900을 빼서 넣어줘야 한다.
		// 월을 얻어오려면 1을 더해서 얻어와야 하고, 넣어주려면 1를 뻬서 넣어야 한다.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("년 월 일: ");
		int year = sc.nextInt() - 1900;
		int month = sc.nextInt() - 1;
		int day = sc.nextInt();
		
		Date date = new Date(year,month,day);
		System.out.println(date);
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd");
		System.out.print(sdf2.format(date));
	}
}
