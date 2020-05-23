package day22;

import java.util.Scanner;

/*
 * 
	1. Ŭ���� �迭
		��ü�� ������ �����ؾ��ϴ� ���
		�迭 Ÿ������ �ѹ��� ���� �� ����Ѵ�.
		
	2. Ŭ���� �迭 ����
		1. Ŭ������[] �迭�� = new Ŭ������[����];
		2. Ŭ������[] �迭�� = {
			new Ŭ����();
			new Ŭ������();
			new Ŭ������();
		}

	3. Ŭ���� �迭 ���
	
	�迭��[index].������;
	�迭��[index].�޼����(); 
	
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
		return "�̸�: "+name+"\n����: "+age+"��\n����: "+feed;
	}
}


public class ArInstance {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Animal[] arAni = new Animal[3];
		
		for(int i = 0; i < arAni.length; i++) {
			arAni[i] = new Animal();
			
			System.out.print(i+1+"�� ���� �̸�: ");
			arAni[i].name=scan.next();
			System.out.print(arAni[i].name+"�� ����: ");
			arAni[i].age=scan.nextInt();
			System.out.print(arAni[i].name+"�� ����: ");
			arAni[i].feed=scan.next();
		}
		
		for (int i = 0; i < arAni.length; i++) {
			System.out.println(arAni[i]);
		}
	}
}
