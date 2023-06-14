import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class NotRuntimeExceptionThrowMain {

	public static void main(String[] args) throws   UnknownHostException, IOException, ClassNotFoundException   {

		System.out.println("stmt1");
		/*
		 * 예외발생예상코드( IDException )
		 */
		Socket socket = new Socket("www.daun.net",80);
		System.out.println(socket);
		System.out.println("stmt2");
		/*
		 * 예외발생예상코드( ClassNotFoundException )
		 */
		Class.forName("AClass");   
		
		/*
		 *  예외발생예상코드( ArithmaticException[RuntimeException] )
		 */
		int result=3/0;
		
		System.out.println("stmt1");
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
