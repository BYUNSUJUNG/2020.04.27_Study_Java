package day08;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * ��(��ü, ������)�� �ߺ��ؼ� ������ �� ����.
 * ����� ������ �ε����� ���� ������, ���� ������ �����Ǿ� ���� �ʴ�.
 * size(): ����� ���� ��
 * add(): �� �߰�
 * itreator(): �˻�
 * remove(Object o): �� ����
 * 
 * HashSet: Set �÷����� �����ϴ� ��ǥ���� Ŭ����
 * 
 * Set<E> ��ü�� = new HashSet<E>();
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
		
		System.out.println("�� ����: "+set.size());
		System.out.println(set);
		//�ݺ���: Iterator: �ݺ��ؼ� ���� ������� ���� �� ����Ѵ�.
		Iterator<String> iter = set.iterator();
		
		//hasNext: ���� ���� ������ true
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		set.remove("AB");
		System.out.print(set.size());
	}
}
