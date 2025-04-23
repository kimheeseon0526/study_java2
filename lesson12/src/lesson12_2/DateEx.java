package lesson12_2;

import java.text.SimpleDateFormat;
import java.util.Date;

@Deprecated
public class DateEx {
	public static void main(String[] args) {
		DateEx ex = new DateEx();
		Date now = new Date();
		System.out.println(now.toString());	//Tue Apr 22 11:10:02 KST 2025
		System.out.println(now.toLocaleString());	//한국 형식에 맞춰서 출력 2025. 4. 22. 오전 11:10:02
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E a");	//내가 원하는 형식으로
		System.out.println(sf.format(now));
	}
}
