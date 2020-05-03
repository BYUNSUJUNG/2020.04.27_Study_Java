package day07;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.IntStream;

/*
 * Set은 검색의 목적이 있기 때문에 순서 정보를 관리할 필요가 없어서
 * 데이터 크기에 상관없이 검색에 걸리는 시간이 매우 짧다.
 * 반면 List는 index를 관리해야 하기 때문에 상대적으로 시간이 오래 걸린다.
 * 
 * 그러므로 기능적 차이가 없다면 HashSet를 써야한다.
 * 
 */
public class ListAndSet {

	public static void main(String[] args) {
		final int SIZE = 10_000_000;
		final List<Integer> arrayList = new ArrayList<>(SIZE);
		final Set<Integer> hashSet = new HashSet<>(SIZE);
		final int data = 9_000_000;
		
		IntStream.range(0,SIZE).forEach(value -> {
			arrayList.add(value);
			hashSet.add(value);
		});
		
		Instant start = Instant.now();
		arrayList.contains(data);
		Instant end = Instant.now();
		long time = Duration.between(start, end).toMillis();
		System.out.println("arrayList 검색 시간: "+(time/1000.0)+"초");
		
		start = Instant.now();
		hashSet.contains(data);
		end = Instant.now();
		time = Duration.between(start, end).toMillis();
		System.out.println("hashSet 검색 시간: "+(time/1000.0)+"초");
	}

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
}
