package byteStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.xml.crypto.Data;

public class FileCopyMain {

	public static void main(String[] args) throws Exception {
		long startTime=System.currentTimeMillis();
		
		String originalFileName="image.jpg";
		String copyFileName="image_copy.jpg";
		FileInputStream fis=new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(copyFileName);
	
			int byteCount=0;
		while(true) {
			int readByte=fis.read();
			if(readByte==-1)break; 
			byteCount++;
			if(byteCount%50 ==0) {
				System.out.print(" * ");
			}
			fos.write(readByte);
		}
	fis.close();
	fos.close();
	System.out.println();
	System.out.println("FileCopy : "+byteCount + "bytes copy!!");

	long endTime=System.currentTimeMillis();
	long duration= endTime-startTime;
	System.out.println(duration+"ms...");
	
	}

}
