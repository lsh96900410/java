import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JOptionPane;

public class NotRuntimeExceptionCatchMain2 {

	public static void main(String[] args) {
	try {
			System.out.println("stmt1");
			/*
			 * 예외발생예상코드( IDException )
			 *  1.예외발생시 IOException객체생성 
			    IOException객체가 던져짐
			  2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 IOException객체대입)  
			  3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
			 */
			 
			Socket socket = new Socket("www.daun.net",80);
			System.out.println(socket);
			System.out.println("stmt2");
			/*
			 * 예외발생예상코드( ClassNotFoundException )
			 * 1.예외발생시 ClassNotFoundException객체생성 
			    ClassNotFoundException객체가 던져짐
			  2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 ClassNotFoundException객체대입)  
			  3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
			 */
			Class.forName("BClass");   
			
			/*
			 *  예외발생예상코드( ArithmaticException[RuntimeException] )
			 *  1.예외발생시 ArithmeticException객체생성 
			    	ArithmeticException객체가 던져짐
			  	2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 ArithmeticException객체대입)  
			  	3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
			 */
			int result=3/0;
			
			System.out.println("stmt1");
	}catch(Exception e) {
		System.err.println("catch Exception msg: "+e.getMessage());
		JOptionPane.showMessageDialog(null, "에로사항발생 : "+ e.getMessage());
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
