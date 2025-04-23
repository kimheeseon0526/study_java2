package lesson12;

import java.util.Arrays;

public class Ex250421 {
	public static void main(String[] args) {
	
		String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=%EA%B3%A0%EC%96%91%EC%9D%B4&ackey=u5kh9aje";

		//Protocol ://Domain/FileName?QueryString(parameter)
		//1. Cut down the url into the parts listed above.	
		//QuesryString Key1 = value1 & key2=value2 &

//		String[] list = url.split("://");
//		String pt = list[0];
//		System.out.println("프로토콜은 : " + pt); //https
//		
//		url = list[1];
//		list = url.split("/");
//		String dm = list[0];
//		System.out.println("도메인은 : " + dm);	//search.naver.com
//
//		url = list[1];
//		list = url.split("\\?");
//		String fn = list[0];
//		url = list[1];
//		System.out.println("파일 이름은 : "+ fn);		//search.naver
//		list = url.split("&");
//
//		//subString
//
//		for(int i = 0 ; i < list.length ; i++) {
//			if(list[i].indexOf("=") != -1) {
//				String[] qs = list[i].split("=");			
//				System.out.println("쿼리스트링 " + (i +1) + "은 : " +Arrays.toString(qs));
//			}
//		}
		//풀이
		
//		String protocol = url.substring(0, url.indexOf("://"));
//		System.out.println(protocol);
//		url = url.substring(url.indexOf("://") + "://".length());
//		
//		String domain = url.substring(0, url.indexOf("/"));
//		System.out.println(domain);
//		url = url.substring(url.indexOf("/") + "/".length());
//		
//		String fileName = url.substring(0, url.indexOf("?"));
//		System.out.println(fileName);
//		url = url.substring(url.indexOf("?") + "?".length());
//		
//		String queryString = url;
//		System.out.println(queryString);
		
		MyUrl myUrl = new MyUrl(url);
		System.out.println(myUrl);

	}
}
class MyUrl{
	String protocol;
	String domain;
	String fileName;
	String queryString;
	Param[] params;

	
	public MyUrl(String url) {
		protocol = url.substring(0, url.indexOf("://"));
		url = url.substring(url.indexOf("://") + "://".length());

		
		domain = url.substring(0, url.indexOf("/"));
		url = url.substring(url.indexOf("/") + "/".length());

		
		fileName = url.substring(0, url.indexOf("?"));
		url = url.substring(url.indexOf("?") + "?".length());
		
		queryString = url;
		String[] tmps = queryString.split("&");
		params = new Param[tmps.length];
		for(int i = 0 ; i < tmps.length; i++) {
//			System.out.println(tmps[i]);
			String[] t = tmps[i].split("=");
			params[i] = new Param(t[0], t[i]);
			
		}

		//code 자주 사용되는 기능 > 자동생성
	}

	@Override
	public String toString() {
		return String.format("MyUrl [protocol=%s, domain=%s, fileName=%s, params=%s]", protocol, domain, fileName,
				Arrays.toString(params));
	}


	//이 안에서만 내부 클래스 생성(key, value)
	class Param{
		String key;
		String value;
		public Param(String key, String value) {
			super();
			this.key = key;
			this.value = value;
		}
		@Override
		public String toString() {
			return String.format("[key=%s, value=%s]", key, value);
		}
		
	}
}
