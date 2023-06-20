package charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class PrintWriterBufferedReaderMain {

	public static void main(String[] args) throws Exception {
		
		PrintWriter pw =
				new PrintWriter(
						new FileWriter("printWriterBufferedReader.txt"));
		
		pw.println("첫번째줄");
		pw.println("두번째줄");
		pw.println("세번째줄");
		pw.println("네번째줄");
		pw.println("다섯번째줄");
		pw.println("여섯번째줄");
		pw.println("일곱번째줄");
		pw.println("여덟번째줄");
		pw.flush();
		pw.close();
		System.out.println("PrintWriter.println() --> printWriterBufferedRedaer.txt");
		
		BufferedReader br= 
				new BufferedReader(
						new FileReader("printWriterBufferedReader.txt"));
		
		
		
		/*
		public String readLine() throws IOException
			Reads a line of text. 
			A line is considered to be terminated by 
				any one of a line feed ('\n'), 
				a carriage return ('\r'),
				or a carriage return followed immediately by a linefeed(\r\n).
		Returns:
			A String containing the contents of the line,
			  not including any line-termination characters, 
		   or null if the end of the stream has been reached
		*/
		String readLine = br.readLine();
		System.out.println("1.readLine:"+readLine);
		readLine = br.readLine();
		System.out.println("2.readLine:"+readLine);
		while(true) {
			readLine=br.readLine();
			if(readLine==null)break;
			System.out.print(readLine+"\n");
		}
		br.close();
		System.out.println("BufferedReader.readLine() <--- bufferedWriter.txt");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
