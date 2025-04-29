package practice;

public class InnerMain {
	//Outer 클래스 안에 Inner 내부 클래스 생성
	//2.내부클래스에서 외부클래스의 값 출력
	public static void main(String[] args) {
		
	
//	new Outer().new Inner().m();
	new Outer().new Inner().m();
	
	}
}	
class Outer{
	int i = 10;	//인스턴스변수
	class Inner{
		void m() {
			System.out.println(i);
		}
	}

}
