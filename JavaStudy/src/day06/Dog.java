package day06;

public class Dog implements Runnable{
	void sound_dog() {
		System.out.println("¸Û¸Û~~");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			sound_dog();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}	
	}
}
