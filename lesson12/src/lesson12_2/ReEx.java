package lesson12_2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReEx {
	public static void main(String[] args) {
		//pattern 클래스
		String regex = "\\d";	//숫자
		regex = "[0-9]";	//숫자
		regex = "\\D";	//숫자아님
		regex = "[^0-9]";	//숫자아님
		
		
		//이메일 주소 패턴
		//휴대전화번호 패턴
		
		Pattern p = Pattern.compile("b[A-Za-z]+");	//b: 시작글자 + a-z 사이 아무거나 / * : a-z가 0개이상, + : 1개이상
		Matcher m;
		String[] strs = {"bat", "cat", "bed", "bAt", "Bat", "b", ""};	//결과값 true or false
		//					t  ,  f ,   t ,   t     ,  t    ,t    f
		for(String s : strs) {
			m = p.matcher(s);
			System.out.println(s + " = " + m.matches());
		
			
			//반복되서 위처럼 반복문 사용	
//		m= p.matcher("bat");
//		System.out.println("bat = " + m.matches());
//	
//		m= p.matcher("cat");
//		System.out.println("cat = " + m.matches());
//
//		m= p.matcher("bed");
//		System.out.println("bed = " + m.matches());
		
			
		}
		String tel = "01[0-9]-[0-9]{3,4}-[0-9]{4}";
		String p1 = "010-1010-1111";
		System.out.println(p1.matches(tel));
		
		System.out.println("abcd1234abcd".replaceFirst("a","e"));	//첫글자만
		System.out.println("abcd1234abcd".replace("a","e"));
		System.out.println("abcd1234abcd".replaceAll("a", "e"));
	}
}
