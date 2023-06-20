package charstream;

import java.io.FileReader;
import java.io.FileWriter;

public class FileWriterReaderMain {

	public static void main(String[] args) throws Exception {
		FileWriter fw=new FileWriter("fileWriter.txt");
		fw.write(44356);
		fw.write('A');
		fw.write('김');
		
		for(int i=0 ;i <65536;i++) {
			fw.write(i);
			if(i%100 ==0) {
				fw.write('\n');
			}
		}
		fw.write("\n");
		fw.write("문자열을 맘대로 막써요");
		fw.write("\n");
		fw.write("한라인\n");
		fw.write("두라인\n");
		fw.write("세라인\n");
		fw.write("네라인\n");
		fw.write("오라인\n");
		/*
		 * 채워지지않은 버퍼에있는 데이타를 출력스트림에쓴다. 
		 */
		fw.flush();
		fw.close();
		System.out.println("FileWriter.write() --> fileWriter.txt");
		
		FileReader fr=new FileReader("fileWriter.txt");
		
		int charCount=0;
		int readChar=fr.read();
		charCount++;
		System.out.println("1.readChar : " + (char)readChar);
		readChar=fr.read();
		charCount++;
		System.out.println("2.readChar : " + (char)readChar);
		readChar=fr.read();
		charCount++;
		System.out.println("3.readChar : " + (char)readChar);
		while(true) {
			readChar=fr.read();
			if(readChar==-1)break;
			charCount++;
			System.out.print((char)readChar);
		}
		System.out.println();
		System.out.println(charCount+"글자 읽음");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}

}
