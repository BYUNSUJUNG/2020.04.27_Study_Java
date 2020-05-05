package day07;

import java.util.Collection;
import java.util.HashMap;

/*
 * HashMap
 * 
 * key�� value �ѽ�(pair, entry)���� ����ȴ�.
 * �׷��Ƿ� �˻��� �����ϴ�
 * [key, value] �ѽ�
 * 
 * key�� �ߺ��� �Ұ����ϴ�. (Set)
 * value�� �ߺ��� �����ϴ�. (Collection)
 * 
 * Map �ڷ� ������ ������ ������ �ʱ� ������
 * Set���� ���� �� Iterator�� ���� ������ �ο��޾Ƽ�
 * ���;��Ѵ�.
 * 
 * HashMap<K,T> ��ü�� = new HashMap<K,T>();
 * HashMap<K,T> ��ü�� = new HashMap<>(�뷮);
 * 
 * clear(): ��� ��(������, ��ü) ����
 * containsKey(Object key): Ű�� �ִ��� �˻礿
 * containsValue(Object value): ���� �ִ��� �˻�
 * get(Object key): Ű ���� �ְ� �� ¦���� ���� �����´�.
 * isEmpty: ����ִ��� Ȯ��
 * keySet(): HashMap�� ����� ��� Ű�� ����� ����.(SetŸ��)
 * value(): HashMap�� ����� ��� ���� ����� ����.(CollectionŸ��)
 * 
 */

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
