package day10;

import java.util.Calendar;

/*
 * 패키지명에 .를 사용하면 폴더가 하나 더 만들어진다.
 * a.b.c.d
 * a폴더 안에 b폴더 안에 c폴더 안에 d
 */
public class SingleMain {

	public static void main(String[] args) {
		day10.Single s = day10.Single.getInstace();
		s.sayHello();
		Calendar c = Calendar.getInstance(); 
	}

}
