package lesson16;

import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.DoubleBinaryOperator;
import java.util.function.Function;
import java.util.stream.IntStream;

public class RandomToStream {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("int형 난수");
		IntStream is = random.ints(3);
//		is.forEach(s -> System.out.println(s));
		is.forEach(System.out::println);	//인스턴스 변수 참조
		
		System.out.println("=============================");		
		is = random.ints(10, 0, 3);
		is.forEach(System.out::println);
		
		System.out.println("long형 난수");
		random.longs(3,0,10).forEach(System.out::println); //0 ~ 10까지 3개
		
		System.out.println("double형 난수");
		random.doubles(3).forEach(System.out::println);
		
		"ABCD".chars().forEach(i -> System.out.println((char)i));	//char 타입으로 형변환 후 출력
	
		
//		Math.max(10d, 5d);
//		DoubleBinaryOperator dbo = ( x, y) -> Math.max(x, y);
		DoubleBinaryOperator dbo = Math::max;	//정적메서드참조
//		DoubleBinaryOperator<10,20> dbo = Math::max;  -> 이건 안되냐..?
		dbo.applyAsDouble(10, 20);
		//String을 String으로 	//매개변수메서드 참조
//		BiPredicate<String, String> pre = (s1, s2) -> s1.equals(s2);
		BiPredicate<String, String> pre = String::equals;
		//String을 Integer로
//		Function<String, Integer> fn = s -> Integer.parseInt(s);	람다식
		Function<String, Integer> fn = Integer::parseInt;
		//메서드 참조형일 때
//		Function<String, Data2> fn2 = s -> new Data(s);
		Function<String, Data2> fn2 = Data2::new;
		
	}
}
class Data2{
	String name;

	public Data2(String name) {
		super();
		this.name = name;
	}
	
}
