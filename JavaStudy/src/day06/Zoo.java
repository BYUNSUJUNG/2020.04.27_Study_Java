package day06;

public class Zoo {

	public static void main(String[] args) {
		Cat c = new Cat();
		Dog d = new Dog();
		Pig p = new Pig();
		
		Thread c_t = new Thread(c);
		Thread d_t = new Thread(d);
		Thread p_t = new Thread(p);
		
		c_t.start();
		d_t.start();
		
		// join() 를 이용하여 쓰레드를 제어할 수 있다
		// cat과 dog의 쓰레드에 join()를 이용하여
		// cat dog의 쓰레드가 모두 종료된 후, pig의 쓰레드가 실행된다.
		try {
			c_t.join();
			d_t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		p_t.start();
		
		
	}

}
