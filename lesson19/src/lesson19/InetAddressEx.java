package lesson19;

import java.net.InetAddress;
import java.net.UnknownHostException;	//호스트 이름의 IP 주소를 확인할 수 없음을 나타낸다


public class InetAddressEx {
	public static void main(String[] args) {
		
		try {
		InetAddress ip = InetAddress.getByName("www.naver.com");
		System.out.println("hostName : " + ip.getHostName());
		System.out.println("ip : " + ip.getHostAddress());	//호스트의 IP주소를 반환(도메인주소)
		
		InetAddress[] ips = InetAddress.getAllByName("www.naver.com");	//byte배열을 통해 IP주소를 얻는다.
		for(InetAddress i : ips) {
			System.out.println("ip주소 : " + i);
		}
		byte[] ipAddr = ip.getAddress();
		for(byte b : ipAddr) {
			System.out.print(((b < 0) ? b + 256 : b) + ".");
		}
		System.out.println();
		InetAddress local = InetAddress.getLocalHost();	//지역호스트의 IP주소를 반환
		System.out.println("내 컴퓨터 ip : " + local);
		
		InetAddress ip2 = InetAddress.getByAddress(ips[0].getAddress());
		System.out.println(ips[0].getHostAddress() + "주소 : " + ip2);
		}
		catch(UnknownHostException e ) {
			System.out.println(e.getMessage());
		}
				
	}
}
