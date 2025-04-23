package lesson13_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class HashMapEx {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("A", 10);
		Integer j = map.put("B", 20);
		int i = map.put("B", 30);	//키값이 겹치면 그 위에 값을 덮어쓴다
		map.put("C", 50);
//		System.out.println(map);
//		System.out.println(i);
//		System.out.println(j);
		//반환타입은 value의 제네릭 타입
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		List<Integer> v1 = new ArrayList<Integer>(map.values());
		Set<Integer> v2 = new HashSet<Integer>(map.values());
		
		System.out.println(v1);
		System.out.println(v2);
		
		//Entryset() : 키와 값의 모든 요소를 set으로 리턴
		Set<Entry<String,Integer>> s =  map.entrySet();
		for(Entry<String, Integer> e : s) {
			System.out.println(e.getKey() + "::" + e.getValue());
		}
		Properties properties = new Properties();
		
		
	}
}
