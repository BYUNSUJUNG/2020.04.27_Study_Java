package day07;

import java.util.Collection;
import java.util.HashMap;

/*
 * HashMap
 * 
 * key와 value 한쌍(pair, entry)으로 저장된다.
 * 그러므로 검색에 용이하다
 * [key, value] 한쌍
 * 
 * key는 중복이 불가능하다. (Set)
 * value는 중복이 가능하다. (Collection)
 * 
 * Map 자료 구조는 순서를 따지지 않기 때문에
 * Set으로 묶은 후 Iterator를 통해 순서를 부여받아서
 * 나와야한다.
 * 
 * HashMap<K,T> 객체명 = new HashMap<K,T>();
 * HashMap<K,T> 객체명 = new HashMap<>(용량);
 * 
 * clear(): 모든 값(데이터, 객체) 제거
 * containsKey(Object key): 키가 있는지 검사ㅏ
 * containsValue(Object value): 값이 있는지 검사
 * get(Object key): 키 값을 주고 그 짝꿍인 값을 가져온다.
 * isEmpty: 비어있는지 확인
 * keySet(): HashMap에 저장된 모든 키가 저장된 형테.(Set타입)
 * value(): HashMap에 저장된 모든 값이 저장된 형태.(Collection타입)
 * 
 */

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
