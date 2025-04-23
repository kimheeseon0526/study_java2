package lesson13_2;

import java.util.Iterator;
import java.util.Set;

//Iterator : 다음데이터에 접근할 수 있도록 만들어주는 포인터 개념

public class IterEx {
	public static void main(String[] args) {
		Set<Integer> set = Set.of(10, 20, 30, 40, 50);
		System.out.println(set);
		
		Iterator<Integer> it = set.iterator();	
//		System.out.println(it.next());	//가장 앞에 있는 값	//next() : 다음으로 이동
//		System.out.println(it.next());	//다음 노드 탐색
//		System.out.println(it.next());	//다음 노드 탐색
//		System.out.println(it.next());	//다음 노드 탐색
//		System.out.println(it.next());	//다음 노드 탐색
//		System.out.println(it.next());	//다음 노드 탐색
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("=========================");
		for(Integer i : set) {
			System.out.println(i);
		}
		
	}
}
