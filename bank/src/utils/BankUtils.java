package utils;

import java.util.Scanner;

public class BankUtils {
	private static final Scanner scanner = new Scanner(System.in);
	
	public static String nextLine(String msg) {	//클래스변수로 어디서든 사용 가능
		System.out.println(msg);
		return scanner.nextLine();		//입력 대기 상태의 값 반환
	}
	
	public static int nextInt(String msg) {
		return Integer.parseInt(nextLine(msg));
	}
	public static long nextlong(String msg) {
		return Long.parseLong(nextLine(msg)) ;
	}
	public static boolean nextConfirm(String msg) {
		String s = nextLine(msg);
		return s.equalsIgnoreCase("y") || s.equalsIgnoreCase("yes");
	}
}

