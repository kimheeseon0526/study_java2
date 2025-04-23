package lesson13_2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

//ArrayList : 순차적인 부분에 최적화됨. 그러니 데이터 변화 없는 경우 사용 속도 높다
//LinkedList : 비순차적인 추가(복사에서 처리)에 빠르다(즉, 데이터 추가 및 삭제되는 경우에 사용)

public class ListTest {
	public static void main(String[] args) {
		ListTest lt = new ListTest();
		System.out.println(lt);
		System.out.println(lt.hashCode());
		System.out.println(Integer.toHexString(lt.hashCode()));		
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList <Integer>();
		
		System.out.println("순차 추가");
		seqInsert(arrayList);
		seqInsert(linkedList);
		System.out.println("비순차 추가");
		nonSeqInsert(arrayList);
		nonSeqInsert(linkedList);
		System.out.println("순차 삭제");
		seqInsert(arrayList);
		seqInsert(linkedList);
	}
	static void seqInsert(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 10_00_000 ; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + ":" + (end - start) + "ms");
	}
	static void nonSeqInsert(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 500_000 ; i++) {
			list.add(0,i);	//0번 인덱스에 i 추가
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + ":" + (end - start) + "ms");
	}
	static void sqDelete(List<Integer> list) {
		long start = System.currentTimeMillis();
		for(int i = 0 ; i < 500_000 ; i++) {
			list.remove(list.size() - 1);	//
		}
		long end = System.currentTimeMillis();
		System.out.println(list.getClass().getSimpleName() + ":" + (end - start) + "ms");
	}

}
