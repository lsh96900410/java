package charstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderWriterCopyMain {

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new FileReader(new File("죄와벌.txt")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("C:\\2023-05-JAVA-DEVELOPER","죄와벌[copy].txt")));
		int lineCount=0;
		while(true) {
			String readLine=br.readLine(); 
			if(readLine==null)break;
			lineCount++;
			readLine=readLine.replace("해럴드","김경호");
			bw.write(readLine);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
		System.out.println("---------------BufferedReaderWriterCopyMain"+lineCount+"line copy..------------------------");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
