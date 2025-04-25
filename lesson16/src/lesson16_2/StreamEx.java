package lesson16_2;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		//1.스트림 생성 방법
		//of(), builder(), generate() 배열로부터, 컬랙션으로부터
		
		//2.스트림 종류
		//Stream<T>, IntStream, DoubleStream, LongStream
		
		//3.스트림의 연산
		//최종연산
		//forEach()
		//중간연산
		//filter(), distinct(), map(), flatMap()
		
		List<Integer> list = IntStream.rangeClosed(1, 10).boxed().sorted((o1, o2)->o2 - o1).collect(Collectors.toList());
//		List<Integer> list = IntStream.rangeClosed(1, 10).boxed().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(list);
		
		List<Integer> list2 = new Random().ints(10,0,10).boxed().peek(System.out::println).collect(Collectors.toList());
		System.out.println(list2);
		
		boolean result = Stream.of(1, 3, 5, 7).allMatch(i -> i%2==1);
		System.out.println(result);
		
		boolean result2 = Stream.of(1, 3, 5, 7).anyMatch(i -> i%2==1);
		System.out.println(result);
	}
}
