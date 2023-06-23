package client;

import java.net.InetAddress;
import java.net.Socket;

public class ClientSocketMain {

	public static void main(String[] args) throws Exception {
		/*
		Socket socket =new Socket("www.naver.com",80);
		System.out.println(socket);
		*/
		Socket socket=
		new Socket("223.130.195.95",80);
		
		System.out.println("clinet 쪽 socket : " + socket);
		InetAddress remoteAddress = socket.getInetAddress();
		InetAddress localAddress=socket.getLocalAddress();
		
		System.out.println("remot ip : "+ remoteAddress.getHostAddress());
		System.out.println("remote port : " + socket.getLocalPort());
		System.out.println("local ip : " + localAddress.getHostAddress());
		System.out.println("remote port : " + socket.getLocalPort());
		
	}

}
