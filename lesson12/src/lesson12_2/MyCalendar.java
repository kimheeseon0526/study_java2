package lesson12_2;

import java.util.Calendar;
import static java.util.Calendar.*;

import java.text.SimpleDateFormat;

public class MyCalendar {
	public static void main(String[] args) {
		//숫자 <> 문자열
		//숫자 >> 문자열 : format
		//문자열 >> 숫자 : parse
		
		//날짜 <> 문자열
		//날짜 >> 문자열 : format
		//문자열 >> 날짜 : parse
		
		
		Calendar cal = Calendar.getInstance();	//인스턴스 생성 방법
		cal.set(DATE, 1);	//시작날짜 1일로 지정
		cal.add(MONTH,  -1);
		int lastDate = cal.getActualMaximum(DATE);	//마지막 날짜	
		int startDay = cal.get(DAY_OF_WEEK);
		System.out.println(startDay-1 );
		int d = startDay-1;
		System.out.println(new SimpleDateFormat("yyyy/MM 달력").format(cal.getTime()));
		
		for(int i = 1-d ; i <= lastDate; i++) {
			if(i < 1 ) {
				System.out.printf("%3c", ' ');
			}
			else {
				System.out.printf("%3d", i);	
			}
			if(i % 7 == ((7 - d) % 7)) { //?
				System.out.println();
			}
		}
	}

}
