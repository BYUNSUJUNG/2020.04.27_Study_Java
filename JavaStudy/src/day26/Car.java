package day26;
/*
 * 	Ŭ���� ���
	Ŭ������ ��ü�� = new Ŭ������();
	
	��ü��.�ʵ�;
	
	. : ����������
	
	A.b: A�ȿ� b
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
		System.out.println("�귣��: "+brand+"\n����: "+color+"\n����: "+price);
	}
	
	public static void main(String[] args) {
		/*
		 * ��üȭ(�ν��Ͻ�)
		 * 	�߻����� ������ ��üȭ ��Ų��.
		 * 	Ŭ������ �������� �ʰ�, ��ü�� ���� ��ü�� �����Ѵ�.
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
