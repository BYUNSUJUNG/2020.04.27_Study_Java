package day26;
/*
 * 	클래스 사용
	클래스명 객체명 = new 클래스명();
	
	객체명.필드;
	
	. : 하위연산자
	
	A.b: A안에 b
*/
public class Car {
	int price;
	String color;
	String brand;
	
	double SpeedUp(double speed) {
		speed++;
		return speed;
	}
	double speedDown(double speed) {
		speed--;
		return speed;
	}
	
	void showInfo() {
		System.out.println(this);
		System.out.println("브랜드: "+brand+"\n색상: "+color+"\n가격: "+price);
	}
	
	public static void main(String[] args) {
		/*
		 * 객체화(인스턴스)
		 * 	추상적인 개념을 실체화 시킨다.
		 * 	클래스로 접근하지 않고, 객체로 만들어서 객체로 접근한다.
		 * */
		Car momCar = new Car();
		Car dadyCar = new Car();
		Car myCar = new Car();
		
		momCar.brand = "Benz";
		momCar.color = "Black";
		momCar.price = 9000;
		
		momCar.showInfo();
		System.out.println(momCar);
		
		
		
	}
	
}
