package day11;

public class Wrapper {

	public static void main(String[] args) {		// TODO Auto-generated method stub
		//jdk 1.5버전 전에는 무조건 이렇게 사용해야 한다.
		String str = new String("1");
		
		//jdk 1.5버전 이후
		String str2 = "1"; // 오토박싱
		Integer data = 10; //오토박싱
		int data2 = data; //오토 언박싱
				
		System.out.println(str);
	}

}
