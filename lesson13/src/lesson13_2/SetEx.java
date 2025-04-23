package lesson13_2;

import java.util.HashSet;
import java.util.Set;
//Set : 무작위 집합
//중복 허용x, 저장 순서 기억ㄴㄴ -> 그래서 조회 순서 확인 불가능하고 전체 조회만 가능

public class SetEx {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("사과");
		set.add("메론");
		set.add("맹고");
		
		Set<String> set2 = new HashSet<>();
		set2.add("사과");
		set2.add("포도");
		set2.add("맹고");
		
		System.out.println(set);
		System.out.println(set2);
		
		System.out.println(set.contains("포도"));	//contains : 포함 여부 확인 //결과값 false
		System.out.println(set.contains("사과"));	//결과값 true
		
		Set<String> result = new HashSet<>(set);
		
		//합집합(addAll) , 교집합(retainAll)
		//result set2 교집합 
		result.retainAll(set2);
		System.out.println("교집합");
		System.out.println(result);	//결과값 : [맹고, 사과]
		
		result = new HashSet<String>(set); //초기화
		//result set2 합집합	
		result.addAll(set2);
		System.out.println("합집합");
		System.out.println(result); 	//결과값 : [맹고, 포도, 사과, 메론]
		
		//result - set2 차집합
		result.removeAll(set2);
		System.out.println("차집합");
		System.out.println(result); 	//결과값 : [메론]
	}
}
