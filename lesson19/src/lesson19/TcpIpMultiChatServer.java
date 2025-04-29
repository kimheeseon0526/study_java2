package lesson19;


import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;



public class TcpIpMultiChatServer {
	HashMap<String, DataOutputStream> clients;
	
	public static void main(String[] args) {
		new TcpIpMultiChatServer().start();
	}
	
	public TcpIpMultiChatServer() {
		clients = new HashMap<>();
		Collections.synchronizedMap(clients);
	}
	
	void sendToAll(String msg) {
		Iterator<String> it = clients.keySet().iterator();
		while(it.hasNext()) {
			try {
				clients.get(it.next()).writeUTF(msg);
			}
			catch(Exception e) {}
		}
	}
	public void start() {	//호출하기
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		try {
			serverSocket = new ServerSocket(7777);
			System.out.println("서버가 시작되었습니다.");
			
			while(true) {
				socket = serverSocket.accept();
				System.out.println("[" + socket.getInetAddress() + "] 에서 접속했다리");
				new ServerReceiver(socket).start();
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	class ServerReceiver extends Thread{
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		public ServerReceiver(Socket socket) {
			this.socket = socket;
			try {
				in = new DataInputStream(socket.getInputStream());
				out = new DataOutputStream(socket.getOutputStream());
			}
			catch(IOException e) {}
		}
		public void run() {
			String name = "";
			try {
				name = in.readUTF();
				sendToAll(name + "이 등장");
				clients.put(name, out);
				System.out.println("현재 접속자 수는 : " +  clients.size() + "이다");
				while(in != null)sendToAll(in.readUTF());
			}
			catch (Exception e) {}
			finally {
				sendToAll(name + "이 나갔다리");
				clients.remove(name);
				System.out.println("현재 접속중인 사람은 " + clients.size());
			}	//try
		}	//run
	}	//ReceiverThread
}	//class
