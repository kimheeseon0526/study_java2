package lesson16_2;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class AggrEx {
	public static void main(String[] args) {
		//갯수, 합계, 평균, 최대, 최소
		List<Student> list = List.of(new Student("새똥이", 100),new Student("갸똥이", 90),new Student("말똥이", 80));
		
		//80점 이상의 학생의 인원 구하기
		long count = list.stream().filter(s ->s.score >= 80).count();
		System.out.println(count);
		//합계(학생들이 가지고 있는 점수들의 합) -> mapToInt
		int sum = list.stream().mapToInt(s->s.score).sum();
		System.out.println(sum);
		//평균
		OptionalDouble od = list.stream().mapToInt(s->s.score).average();
		System.out.println(od.getAsDouble());
		//이름의 최대값
		Optional<Student> optional = list.stream().max((s1,s2)->s1.name.compareTo(s2.name));
		System.out.println(optional);
		
		long min = list.stream().mapToLong(s -> s.score).min().getAsLong();
		System.out.println(min);
		
		//Stream.concat(null, null)
		"abcd".concat("1234");
	}
}
