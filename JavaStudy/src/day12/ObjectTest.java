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
		
//		 .equals(), == :    두 주소값이 같은지 확인하는 메서드
//							단, String 클래스에서 quals()를 재정의 하였기 때문에
//							String 타입이라면 값을 비교한다.
		System.out.println(data1.intern() == data2);
		System.out.println(data1.equals(data2));
		System.out.println(data3 == data4);
		System.out.println(data3.equals(data4));
		
		r = r2;
		System.out.println(r.equals(r2));
		System.out.println(r == r2);

/* 
 * 		hashCode()	: 두객체가 같은지 확인하는 메서드
 * 						데이터 관리 기법 중 하나이며 다량의 데이터를 저장하는 것이 
 * 						가능하고 빠른 검색이 가능하다
 * 						String 클래스에서 오버라이딩 했으며, 값이 같으면 같은 hashCode를 갖는다.
 */
		System.out.println(data1.hashCode());
		System.out.println(data2.hashCode());
		System.out.println(data3.hashCode());
		System.out.println(data4.hashCode());
		
		
		
				
		
	}

}
