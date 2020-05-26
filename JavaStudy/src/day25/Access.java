package day25;
/*
 * 클래스(접근 권한 제어자)
 * default: 같은 패키지에서는 접근 가능
 * public: 다른 패키지에서도 접근 가능
 * protected: 같은 패키지에서 접근 가능
 * private: 선언된 영역에서만 접근 가능
 * 
 * getter(): 다른 클래스 혹은 패키지에서도 
 * 			private변수에 접근할 수 있도록 해준다 (데이터가져오기)
 * 
 * setter(): 데이터 변경을 목적으로 한다
 * */

public class Access {
	int data1 = 10;
	public int data2 = 20;
	protected int data3 = 30;
	private int data4 = 40;

	public int getData4() {
		return data4;
	}

	public void setData4(int data4) {
		this.data4 = data4;
	}
	void f() {
	}

}

class Cloud {

	void function() {
		Access a = new Access();
	}
}