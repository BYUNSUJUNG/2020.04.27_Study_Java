package day07;

import java.util.Collection;
import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		//����
		HashMap<String,Integer> fruitMap = new HashMap<>();
		Collection<Integer> price = null;
		
		fruitMap.put("���", 1000);
		fruitMap.put("��", 2000);
		fruitMap.put("�ڵ�", 3000);
		fruitMap.put("����", 4000);
		
		System.out.println(fruitMap.get("�ڵ�")+"��");
		System.out.println(fruitMap.values());
		price = fruitMap.values();
		
		for(int i: price) {
			System.out.println(i+"��");
		}
	}
}
