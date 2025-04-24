package lesson16;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamEx {
	public static void main(String[] args) {
		Stream<Integer> stream =  Stream.of(10, 30, 40, 20, 10, 20, 30);	//Integer stream. 즉 들어간 값에 의해 지정된다
		stream.forEach(i -> System.out.println(i)); //순환하면서 내부반복자를이용
		stream = Stream.of(10, 30, 40, 20, 10, 20, 30);	//Integer stream. 즉 들어간 값에 의해 지정된다
		stream.forEach(i -> System.out.println(i)); // java.lang.IllegalStateException
		//일회성이라 바로 위의 코드 사용시에는 재생성해야된다
		
		int[] arr = {1, 2, 3, 4, 5};
		IntStream is = Arrays.stream(arr);
		
		//배열을 이용한 스트림 생성
		List<String> list = List.of("새똥이", "개똥이");
		Stream<String> stream2 = list.stream();
		System.out.println("==========================");
		stream2.forEach(s -> System.out.println(s));
		
		
	 Stream<Object> stream3 = Stream 
	 .builder()
	 .add("까")
	 .add("나")
	 .add("다")
	 .build();
	 stream3.forEach(s -> System.out.println(s));
	 
	 Stream<String> stream4 = Stream.generate(() -> "abcd").limit(10);
	 //"abcd" 문자열이 10개가 들어간 stream4
	 stream4.forEach(s -> System.out.println(s));
	 Stream<Integer> stream5 =Stream.iterate(1, i -> i + 1).limit(10); //1~10까지의 Integer stream
	 stream5.forEach(s -> System.out.println(s));
	 
	}
}
