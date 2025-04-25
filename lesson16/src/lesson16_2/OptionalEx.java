package lesson16_2;

import java.util.Optional;

public class OptionalEx {
	public static void main(String[] args) {
		Optional<Integer> optional = Optional.ofNullable(null);
		//null처리에 추가 연산
		
		if(optional.isPresent()) {
			System.out.println(optional.get());
		}else {
			System.out.println(50);
		}
		
		System.out.println(optional.orElse(20));
		//orElse : 값이 null 일때 괄호 안의 값으로 대체하겠다
		
		System.out.println(optional.isPresent());	//false
		System.out.println(optional.isEmpty());	//TRUE
		
		optional.ifPresent(System.out::println);	//ifPresent : 존재하면~
		
		optional.orElseThrow(()->new RuntimeException("값이 없음"));	//초기값이 null이었을 때 동작
		System.out.println(optional.orElseGet(()->30));
		
	}
}
