package lesson11;

public class ExceptionEx3 {
	public static void main(String[] args) {
		
		try{
			m();
		}catch(NoClassDefFoundError e) {
			System.out.println("main catch");
		}
	}
	static void m() {
		try {
			System.out.println(1);
			System.out.println(2/0);	//catch가 없어서 처리 못함. m()이 try에 쌓여져 있는지 확인
			System.out.println(3);
		}finally {
			System.out.println(4);			
		}
		System.out.println(5);
	}
}
