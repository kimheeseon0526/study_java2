package lesson18;

import java.io.FileOutputStream;

public class OutputStreamEx {
	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("output.txt", true);
//		fos.write('A');
//		fos.write('B');
//		fos.write('C');
//	
//		byte[] bs = { ' ', 48, 49, 50, 51};
//		fos.write(bs);
//		
//		fos.write(13);
//		fos.write(10);
//		fos.write(97);
//		fos.write(98);
//		fos.write(99);	//여기까지 26byte
//		
//		fos.close();
		
		
		//A~Z까지
		//a~z까지
		//0-9까지
		//각 개행문자는 \n
		
		FileOutputStream fos2 = new FileOutputStream("output2.txt");
		
		for(int i = 'A'; i <= 'Z'; i++){
			fos2.write(i);	
		}
		fos2.write(10);
//		fos2.write('\n');
		for(int i = 'a'; i <= 'z'; i++){
			fos2.write(i);	
		}
		fos2.write('\n');
		for(int i = '0'; i <= '9'; i++){
			fos2.write(i);	
		}
		fos2.close();
	}
}
