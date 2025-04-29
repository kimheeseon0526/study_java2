package lesson18;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BrEx {
	public static void main(String[] args) throws Exception{
		//특정 파일을 문자 기반 스트림으로 입력
		
		FileReader fr = new FileReader("output2.txt");
		//버퍼 기반의 보조 스트림 사용(보조스트림으로 메인스트림 사용)
		BufferedReader br = new BufferedReader(fr);
//		String str = br.readLine();
//		System.out.println(str);
		
//		str = br.readLine();
//		System.out.println(str);
//		
//		str = br.readLine();
//		System.out.println(str);
//		
//		str = br.readLine();
//		System.out.println(str);	//null
		
		String s ;
		while(((s = br.readLine()) != null)) {
			System.out.println(s);
		}
		br.close();
		
		//문자 <> 바이트
//		InputStreamReader isr;	
		//입력시 외부에 있던 바이트 > 문자로 입력될 때
		FileInputStream fis = new FileInputStream("ouotput2.txt"); //외부 파일
		InputStreamReader isr = new InputStreamReader(fis);	
		BufferedReader br2 = new BufferedReader(isr);	
		
		OutputStreamWriter osw;
		//출력시 내부에 있던 문자 > 바이트
		
	}
}
