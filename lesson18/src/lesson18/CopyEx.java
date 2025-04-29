package lesson18;

import java.io.FileInputStream;
import java.io.FileOutputStream;



public class CopyEx {
	public static void main(String[] args) throws Exception {
		//output2.txt 파일을 output3.txt 로 복사
		//FileInputStream, FileOutputStream  사용 -> 읽어서 복사
		
		FileInputStream fis = new FileInputStream("output2.txt");
		FileOutputStream fos = new FileOutputStream("output3.txt");
		
		//1번
//		fos.write((fis.readAllBytes()));
		//2번
//		int b = 0;
//		while((b = fis.read()) != -1) {
//			fos.write(b);
//		}
		//3번
		byte[] bs = new byte[10];
		int length = 0;
		while((length = fis.read(bs)) != -1) {
			fos.write(bs, 0 , length);
		}
		fis.close();
		fos.close();
	}
}
