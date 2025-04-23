package lesson11;

public class ExceptionEx5 {
	public static void main(String[] args) {
		//throw : 직접 예외를 만드는 것
		System.out.println("프로그램 시작");
		try {
			throw new Exception("예외발생");
		}catch (Exception e) {
//			System.out.println(e.getMessage());
//			e.printStackTrace();
			System.out.println(e.getMessage());
			StackTraceElement[] ste = e.getStackTrace();
			for(StackTraceElement st : ste) {
				System.out.println(st.getLineNumber());
			}
		}
		System.out.println("프로그램 종료");
		int[] arr = {1,2,3,4};
		int[] arr2 = arr.clone();
	}
	static void m() throws Exception {
		System.out.println(1);
		throw new Exception("m의 예외");
	}
	static void m2() /*throws Exception*/{
		try{m();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
//throws로 예외 던지거나, m()를 try 안에 가둬서 catch 직접 처리하던가