package charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.security.sasl.RealmCallback;

public class BufferedReaderWriterMain {

	public static void main(String[] args) throws Exception{

		BufferedWriter bw=
				new BufferedWriter(
						new FileWriter("bufferedWriter.txt"));
		
		bw.write("첫번째줄\n");
		
		bw.write("두번째줄");
		bw.newLine();
		bw.write("세번째줄");
		bw.newLine();
		bw.write("네번째줄");
		bw.newLine();
		bw.write("다섯번째줄");
		bw.newLine(); //라인종결자 필요
		bw.flush();
		bw.close();
		System.out.println("BufferedWriter.write() , BufferedWriter.newLine() --> bufferedWriter.txt");
		
		BufferedReader br=
				new BufferedReader(
						new FileReader("bufferedWriter.txt"));
		/*
		 * public String readLine()
                throws IOException
			Reads a line of text. 
			A line is considered to be terminated by 
			any one of a line feed ('\n'), a carriage return ('\r'), 
			or a carriage return followed immediately by a linefeed.
		Returns:
			A String containing the contents of the line, not including any line-termination characters,
			 or null if the end of the stream has been reached
		 */
		String readLine=br.readLine();
		System.out.println("1.readLine : "+readLine);
		readLine=br.readLine();
		System.out.println("2.readLine : "+readLine);
		
		while(true) {
			readLine=br.readLine();
			if(readLine==null)break;
			/*
			System.out.print(readLine);
			1.readLine : 첫번째줄
			2.readLine : 두번째줄
			세번째줄네번째줄다섯번째줄
			*/
			System.out.print(readLine+"\n");
		}
		br.close();
		System.out.println("BufferedReader.readLine() <-- bufferedWriter.txt");
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
