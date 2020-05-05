package day08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * 값(객체, 데이터)를 중복해서 저장할 수 없다.
 * 저장된 값들은 인덱스가 없기 때문에, 저장 순서가 고정되어 있지 않다.
 * size(): 저장된 값의 수
 * add(): 값 추가
 * itreator(): 검색
 * remove(Object o): 값 삭제
 * 
 * HashSet: Set 컬렉션을 구현하는 대표적인 클래스
 * 
 * Set<E> 객체명 = new HashSet<E>();
 * 
 */
public class SetTest {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("AB");
		set.add("B");
		set.add("O");
		set.add("A");
		set.add("A");
		set.add("A");
		set.add("A");set.add("A");
		
		System.out.println("총 개수: "+set.size());
		System.out.println(set);
		//반복자: Iterator: 반복해서 값을 순서대로 뽑을 때 사용한다.
		Iterator<String> iter = set.iterator();
		
		//hasNext: 다음 값이 있으면 true
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		set.remove("AB");
		System.out.print(set.size());
	}
}
