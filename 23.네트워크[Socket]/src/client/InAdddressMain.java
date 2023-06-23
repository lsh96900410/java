package client;

import java.net.InetAddress;

public class InAdddressMain {

	public static void main(String[] args) throws Exception {
		System.out.println(" ------------------ local address(IP) ----------------------");
		InetAddress localAddress =InetAddress.getLocalHost();
		System.out.println("local host name : " + localAddress.getHostName());
		System.out.println("local host address : " + localAddress.getHostAddress());
		
		System.out.println("--------------------- remote address -----------------------");
		InetAddress remoteAddress = InetAddress.getByName("www.aladin.co.kr");
		System.out.println("remote host name : " + remoteAddress.getHostName());
		System.out.println("remote host address : " + remoteAddress.getHostAddress());
	
		InetAddress[] remoteAddresses = InetAddress.getAllByName("www.naver.com");
		for (InetAddress inetAddress : remoteAddresses) {
			System.out.println(inetAddress);
		}
	
	
	
	
	
	
	}

}
