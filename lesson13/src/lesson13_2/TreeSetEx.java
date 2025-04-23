package lesson13_2;

import java.util.Set;
import java.util.TreeSet;

//TreeSet
//중복 불가, 정렬순서가 중요 -> 비교 interface 필요하다

public class TreeSetEx {
	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		set.add("새똥이");
		set.add("말똥이");
		set.add("개똥이");
		set.add("1");
		set.add("2");
		set.add("9");
		set.add("10");
		
		System.out.println(set);	//사전나열순으로 자동 정렬된 상태
		//결과값 : [1, 10, 2, 9, 개똥이, 말똥이, 새똥이]  -> String 타입이라 char
		
		Set<Integer> set2 = new TreeSet<>();
		set2.add(1);
		set2.add(2);
		set2.add(10);
		set2.add(9);
		
		System.out.println(set2);
		//결과값 : [1, 2, 9, 10]   -> integer 타입이라 숫자 대소비교
		
		Set<Addr> set3 = new TreeSet<>();
		set3.add(new Addr("개똥이", "1234"));
		set3.add(new Addr("새똥이", "5678"));
		System.out.println(set3);
		//[Addr [name = 개똥이 , tel = 1234], Addr [name = 새똥이 , tel = 5678]]  -> 이름순으로 정렬
	}
}
