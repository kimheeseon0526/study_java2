package lesson13_2;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {
	public static void main(String[] args) {
		
		Set<Addr> set = new HashSet<>();
		set.add(new Addr("새똥이", "1234"));
		System.out.println(set);
		Addr addr = new Addr("개똥이", "5677");
		set.add(addr);
		set.add(addr);
		System.out.println(set);	//[Addr [name = 새똥이 , tel = 1234], Addr [name = 개똥이 , tel = 5677]]
		
		Addr addr2 = new Addr("말똥이", "1234");
		set.add(addr2);
		System.out.println(set); //순차적으로 쌓인다
		
		for(Addr a : set) {
			System.out.println(a.hashCode()); // set에 들어있는 새똥이, 개똥이의 tel hashcode 출력
		}
		System.out.println(addr2.hashCode());	//새똥이와 말똥이의 tel이 동일하니 같은 같은 hashcode 출력
		
		//equals(), hashcode() 가지고 같은 객체인지 확인
			
	}

}

class Addr implements Comparable<Addr>{
	String name;
	String tel;
	
	public Addr(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
		
	}

	@Override	//toString  안하면 주소값이 출력된다
	public String toString() {
		return String.format("Addr [name = %s , tel = %s]", name, tel);
	}

	@Override
	public int hashCode() {	//tel이 가지고 있는 hashcode 가지고 온다
		return tel.hashCode();	
	//말똥이와 새똥이의 전화번호가 "1234"로 같아서 나중에 추가된 말똥이의 정보 출력되지 않는다(Set은 중복미허용)
	}

	@Override
	public boolean equals(Object obj) {	//Object obj : 파라미터로 전달받은 tel 값
		return tel.equals(((Addr)obj).tel);	//결과를 boolean 타입으로 반환
	}

	@Override
	public int compareTo(Addr o) {	
		return -name.compareTo(o.name) ;
	//내가 가지고 있는 필드값과 파라미터로 가지고 온 필드값의 차이값만 비교
	//반환타입이 int 타입이라 정렬 순서 뒤집으려면(내림차순) '-' 기호 붙이면 된다
	}	
	
	
	
}
