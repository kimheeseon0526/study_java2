package lesson18;

import java.io.FileReader;
import java.util.Arrays;

public class ReaderEx {
	public static void main(String[] args) throws Exception{
		
		FileReader fr = new FileReader("file.txt");
//		int c = 0;
//		int count = 0;
//		
//		while((c = fr.read()) != -1) {
//			System.out.println(c + "::" + (char)c);
//			count++;
//		}
//		System.out.println(count + " 글자 읽음");	//16  -> 줄바꿈(4개포함) 한 글자마다 읽는다
		
		
		//문자 배열
		char[] chs = new char[10];
		int ret = fr.read(chs);
		System.out.println(Arrays.toString(chs));	//[1, 2, 3, 4, , , A, B, C, D] 맨 앞에서부터 10개
		System.out.println(ret);	//10개 읽음
		
		ret = fr.read(chs);
		System.out.println(Arrays.toString(chs));	//[ , , 가, 나, 다, 라, A, B, C, D]
		System.out.println(ret);	//나머지 6번 추가로 읽음	
		fr.close();
	}
}
