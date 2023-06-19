package charstream;

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
	}

}
