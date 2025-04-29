package lesson18;

import java.io.FileInputStream;
import java.util.Arrays;

public class InputStreamEx {
	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("file.txt");
//		fis.read();
//		int b = fis.read();
//		System.out.println(b);
//		b = fis.read();
//		System.out.println(b);
		
//		for(int i = 0; i < 24; i++) {
//			int b = fis.read();
//			System.out.println(b + " :: " + (char)b);
//		}
//		System.out.println(fis.read());		//-1 : 읽을게 없어서 
		
		//EOF(End Of File)에 도달하면 -1 
		
		//utf-8
		//영문, 숫자, 특문 - 1byte
		//한글 / 3byte
		
		//1234 4byte + 2byte(줄바꿈)
		//ABCD 4byte + 2byte(줄바꿈)
		//가나다라 12byte
		
//		int b = 0;
//		while((b = fis.read()) != -1) {
//			System.out.println(b + "::" + (char)b);
//			
//		}	
		//byte 타입 : -128 ~ 127
		
//		byte[] bs = new byte[50];		
//		int ret = fis.read(bs, 5, 10);	//[0, 0, 0, 0, 0, 49, 50, 51, 52, 13, 10, 65, 66, 67, 68, 0, 0, ...]
//		System.out.println(Arrays.toString(bs));	//[49, 50, 51, 52, 13]
//		System.out.println(ret);	//5		
		
		byte[] bs = fis.readAllBytes();	//
		System.out.println(Arrays.toString(bs)); 	//바이트만큼 만들어주는거
		
		fis.close(); //사용 후 닫아주기

	}
}
