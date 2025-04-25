package lesson17;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class FileEx {
	public static void main(String[] args) throws Exception {
		//1GB
		// 1024 * 1024 * 1024
//		File file = new File("1GB.txt");
//		FileWriter writer = new FileWriter(file);
//		BufferedWriter bw = new BufferedWriter(writer);
//		for(int i = 0; i < 1024 * 1024 * 1024 ; i++) {
//			writer.write('A');
//		}
//		bw.close();
//		writer.close();
		
		File folder = new File("1000files");
		folder.mkdirs();
		
		for(int i = 0; i < 1024; i++) {
			File file = new File("1000files\\" + i + ".txt");
			FileWriter writer = new FileWriter(file);
			BufferedWriter bw = new BufferedWriter(writer);
			for(int j = 0; j < 1024 * 1024 ; j++) {
				writer.write('B');
			}
			bw.close();
			writer.close();
			System.out.println(file + "생성됨");
		}
	}
}
