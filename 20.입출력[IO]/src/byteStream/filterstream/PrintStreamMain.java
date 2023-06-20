package byteStream.filterstream;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception{
		PrintStream pout = new PrintStream(new FileOutputStream("printStream.txt"));
		
		pout.println(1234);
		pout.println('김');
		pout.println(true);
		pout.println(3.141592);
		pout.println("1234");
		pout.println("김");
		pout.println("true");
		pout.println("3.141592");
		System.out.println("------------- PrintStream.print() --------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
