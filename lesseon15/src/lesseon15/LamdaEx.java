package lesseon15;
//람다식
//조건 : 단 한개의 추상메서드 선언
//함수적 인터페이스를 자료형으로 사용 -> 함수적 인터페이스는 아래  선언

public class LamdaEx {
	public static void main(String[] args) {
		MyInter inter = i -> i + i;
		
		System.out.println(inter.la(10));		
	}
		Object o2 = (MyInter) i -> i * i;
		Runnable runnable = () -> {
			System.out.println("runnable");
		};	//파라미터도 반환규칙도 없음
		
}
//함수적 인터페이스 : 추상메서드가 오로지 한개만 존재하는 인터페이스 
//-> 람다식 사용하기 전에 먼저  선언해줘야한다
@FunctionalInterface
interface MyInter{
	int la(int i);
}
