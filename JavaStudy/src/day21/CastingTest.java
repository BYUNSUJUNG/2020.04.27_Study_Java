package day21;

class Car {
	
	String brand;
	String color; 
	int price;
	
	public Car() {}
	
	public Car(String brand, String color, int price) {
		this.brand = brand;
		this.color = color;
		this.price = price;
	}
	
	void engineStart() {
		System.out.println("¿­¼è·Î ½Ãµ¿ Å´");
	}
	void engineStop() {
		System.out.println("¿­¼è·Î ½Ãµ¿ ²û");
	}
} // end of Car

class SuperCar extends Car {
	String mode;
	public SuperCar() {
		
	}
	public SuperCar(String mode) {
		this.mode = mode;
	}
	void changeMode(String newMode) {
		this.mode = newMode;
		System.out.println("¸ðµå°¡ ¹Ù²î¾ú½À´Ï´Ù.");
	}
} // end of SuperCar


public class CastingTest {

	public static void main(String[] args) {
		Car noOptionFerrari = new SuperCar();
		noOptionFerrari.engineStart();
		
		//down casting: ¿À·ù
		//SuperCar brokenCar = (SuperCar) new Car();
		//brokenCar.changeMode("½ºÆ÷Ã÷");
		
		Car Car = new Car();
		SuperCar ferrari = new SuperCar();
		
		// nice casting
		if(Car instanceof Car) {
			System.out.println("nice casting");
		}else {
			System.out.println("error: wrong casting");
		}
		
		// nice casting
		if(ferrari instanceof Car) {
			System.out.println("nice casting");
		}else {
			System.out.println("error: wrong casting");
		}
		
		// error: wrong casting
		if(Car instanceof SuperCar) {
			System.out.println("nice casting");
		}else {
			System.out.println("error: wrong casting");
		}
		
		// nice casting
		if(noOptionFerrari instanceof Car) {
			System.out.println("nice casting");
		}else {
			System.out.println("error: wrong casting");
		}
	}

}
