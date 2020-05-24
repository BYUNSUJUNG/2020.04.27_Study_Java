package day23;

public class CarTest {
	public static void main(String[] args) {
		SuperCar superCar = new SuperCar();
		SuperCar ferrari = new SuperCar("ferrari","Red",45000,"sport");
		System.out.println(ferrari);
		ferrari.engineStart();
		ferrari.engineStop();
	}
}
