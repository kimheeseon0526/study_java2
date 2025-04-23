package lesson12_2;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import static java.util.Calendar.*;

import java.text.SimpleDateFormat;

import static java.lang.System.*;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal1 = Calendar.getInstance();
		Calendar cal2 = new GregorianCalendar();
//		System.out.println(cal1);
//		System.out.println(cal2);
		Scanner scanner = new Scanner(in);

		
		System.out.println(cal1.get(ERA));	//1
		System.out.println(cal1.get(YEAR));	//2025	
		System.out.println(cal1.get(MONTH)); //3
		System.out.println(cal1.get(DATE));
		System.out.println(cal1.get(HOUR));
		System.out.println(cal1.get(MINUTE));
		System.out.println(cal1.get(SECOND));
		System.out.println(cal1.get(DAY_OF_WEEK));
		System.out.println(cal1.getActualMaximum(DATE));
//		cal1.set(0, 0);
		
		//150개월 뒤는 며칠인가~                 -- roll
		cal1.add(MONTH, -10);	
		printCal(cal1);
		
	}
	static void printCal(Calendar cal) {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime()));
	}
}
