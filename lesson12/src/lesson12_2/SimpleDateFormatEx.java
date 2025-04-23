package lesson12_2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatEx {
	public static void main(String[] args) throws Exception {
		//문자열 >> 시간정보로 
		String str = "2025-12-25";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date date  = sdf.parse(str);
		System.out.println(date);
	}
}
