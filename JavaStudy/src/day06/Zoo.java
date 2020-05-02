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
		
		// join() �� �̿��Ͽ� �����带 ������ �� �ִ�
		// cat�� dog�� �����忡 join()�� �̿��Ͽ�
		// cat dog�� �����尡 ��� ����� ��, pig�� �����尡 ����ȴ�.
		try {
			c_t.join();
			d_t.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		p_t.start();
		
		
	}

}
