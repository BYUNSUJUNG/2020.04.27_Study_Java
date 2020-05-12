package day13;

public class ObjectTest {

	public static void main(String[] args) {
		// constant pool
		String str1 = "data";
		String str2 = "data";
		String str3 = new String("data");
		String str4 = new String("data");
		
		System.out.println(str1 == str2);
		System.out.println(str3.intern() == str4.intern());
		System.out.println(str2 == str4);
		System.out.println(str2 == str4.intern());
		System.out.println(str1.equals(str3));
		
		// intern()
		// constant pool에 같은 값을 검색하여 그 주소 값을 반환해준다.
	}

}
