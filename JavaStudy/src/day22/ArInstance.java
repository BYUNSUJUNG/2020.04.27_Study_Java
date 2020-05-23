package day22;

import java.util.Scanner;

/*
 * 
	1. 클래스 배열
		객체를 여러개 선언해야하는 경우
		배열 타입으로 한번에 선언 후 사용한다.
		
	2. 클래스 배열 선언
		1. 클래스명[] 배열명 = new 클래스명[길이];
		2. 클래스명[] 배열명 = {
			new 클래스();
			new 클래스명();
			new 클래스명();
		}

	3. 클래스 배열 사용
	
	배열명[index].변수명;
	배열명[index].메서드명(); 
	
*/
class Animal {
	String name;
	int age;
	String feed;
	
	public Animal() {}
	
	public Animal(String name, int age, String feed) {
		this.name = name;
		this.age = age;
		this.feed = feed;
	}
	
	@Override
	public String toString() {
		return "이름: "+name+"\n나이: "+age+"살\n먹이: "+feed;
	}
}


public class ArInstance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Animal[] arAni = new Animal[3];
		
		for(int i = 0; i < arAni.length; i++) {
			arAni[i] = new Animal();
			
			System.out.print(i+1+"번 동물 이름: ");
			arAni[i].name=scan.next();
			System.out.print(arAni[i].name+"의 나이: ");
			arAni[i].age=scan.nextInt();
			System.out.print(arAni[i].name+"의 먹이: ");
			arAni[i].feed=scan.next();
		}
		
		for (int i = 0; i < arAni.length; i++) {
			System.out.println(arAni[i]);
		}
	}
}
