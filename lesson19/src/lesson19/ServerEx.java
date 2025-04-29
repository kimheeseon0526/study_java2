package lesson19;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerEx {
	public static void main(String[] args) {
		//소켓 생성
		ServerSocket server = null;
		try {
			
		server = new ServerSocket(9999);	//로컬호스트 주소
		
		while(true) {
			System.out.println("클라이언트 접속 대기");
			Socket client = server.accept();	//accept : 클라이언트의 요청이 있을 때만 
			System.out.println("스레드 생성");
			HttpThread ht = new HttpThread(client);
			ht.start();
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {				
				server.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
				}
			}
		}
	}
class HttpThread extends Thread {
	private Socket client;
	BufferedReader br;	
	PrintWriter pw;	//생성자 코드로 위 세개 초기화
	HttpThread(Socket client){
		this.client = client;
		try {
			br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			pw = new PrintWriter(client.getOutputStream());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	@Override
	public void run() {
		BufferedReader fbr = null;
		DataOutputStream outToClient = null;
		try {
			String line = br.readLine();	//실제 요청자가 가지고 있던 요청 헤더 정보 전체 읽기
			System.out.println("Http Header : " + line);
			int start = line.indexOf("/") + 1;
			int end = line.lastIndexOf("HTTP") - 1;
			String fileName=line.substring(start, end);
			if(fileName.equals("")) {
				fileName="Index.html";
			}
			System.out.println("사용자 요청 파일 " + fileName);
			fbr = new BufferedReader(new FileReader(fileName));
			String fileLine = null;
			pw.println("Http/1.0 200 Document Follows \r\n");
			while((fileLine = fbr.readLine())!= null) {
				pw.println(fileLine);
				pw.flush();
			}
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}
		finally {
			try {
				if (br != null) br.close();
				if (pw != null) pw.close();
				if(client != null) client.close();
			}
			catch(IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}
