package lesson14;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class Ex250423 {
	public static void main(String[] args) {
		//과제
//	    Map을 사용한 문자 빈도수 계산
		String str = "aaaaabbbbcccddddd";
		Map<String, Integer> map = new HashMap<String, Integer>();
		//{a:5 ,b:4 c:3, d:5}
		//선택 정렬 -> 석차순 정렬  comperator 사용해라
		//문자열, 문자배열, 문자열배열
		
		String[] strs = str.split("");
		
		Stream.of(strs).forEach(s ->{
			Integer i = map.get(s);
			map.put(str, i == null? 1 : i + 1);
			System.out.println(map);
		});
		
		
//		for(String s : strs) {
//			System.out.println(s);
//			Integer i = map.get(s);	//반환타입 Integer  -> 왜?
//			System.out.println(i);
//			if(i == null) {
//				map.put(s, 1);
//			}
//			else {
//				map.put(s, i + 1);
//			}
			
		
	}
}
