package socket.chat;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class MyServer {
	public static void main(String[] args) {
		 BufferedReader in = null;  
		 PrintWriter out = null;		
		 
		 ServerSocket serverSocket=null;
		 Socket socket=null;
		 Scanner scanner=new Scanner(System.in);

		 try {
			 serverSocket=new ServerSocket(2869);
			 System.out.println("[서버 실행] Client 연결 대기중 ");
			 
			 socket=serverSocket.accept();  
			 System.out.println("client 연결됨");
			 
			 in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			 
			out=new PrintWriter(socket.getOutputStream()); 
			 
			 while(true) {
				 String inputMessage = in.readLine();
				 if("quit".equalsIgnoreCase(inputMessage))break;
				 
				 System.out.println(" From Client : "+inputMessage);
				 System.out.print("전송하기 >>");
				 
				 String outputMessage =scanner.nextLine();
				 out.print(outputMessage);
				 out.flush();
				 if("quit".equalsIgnoreCase(outputMessage))break;
			 }
			 
		 }catch (Exception e) {
			 e.printStackTrace();
		 }finally {
			try {
				scanner.close();
				socket.close();
				serverSocket.close();
				System.out.println("연결종료");
			}catch (Exception e) {
				System.out.println("소켓통신 에러 ");
			}
		}
	
	
	
	}
	
	
	
}
