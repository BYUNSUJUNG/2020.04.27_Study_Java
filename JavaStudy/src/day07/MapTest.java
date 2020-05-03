package day07;

import java.util.Collection;
import java.util.HashMap;

public class MapTest {
	public static void main(String[] args) {
		//과일
		HashMap<String,Integer> fruitMap = new HashMap<>();
		Collection<Integer> price = null;
		
		fruitMap.put("사과", 1000);
		fruitMap.put("배", 2000);
		fruitMap.put("자두", 3000);
		fruitMap.put("수박", 4000);
		
		System.out.println(fruitMap.get("자두")+"원");
		System.out.println(fruitMap.values());
		price = fruitMap.values();
		
		for(int i: price) {
			System.out.println(i+"원");
		}
	}
}
