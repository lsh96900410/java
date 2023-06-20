package file;

import java.io.File;

public class FileMain {
	
	public static void main(String[] args) throws Exception{
		System.out.println("escape character는 \\이다. ==> \\축 \"결혼\" "); 
		
		/*
		현재파일경로 [기준경로]	
		 	 eclipse -->  C: \ 2023-05-JAVA-DEVELOPER \ workspaceSE \ 20.입출력[IO] (자바프로젝트 파일)
		 	
		 	- 상대경로(relative path)
		 			현재 경로를 기준으로 경로를 기술
		 			  sample \ a.txt
		 			  . \ sample
		 	- 절대경로(absolute path)
		 			C:, D: 드라이브를 기준으로 경로기술
		 			  ex) C: \ 2023-05-JAVA-DEVELOPER \ workspaceSE \ 20.입출력[IO] \ src \ file \ FileMain.java => file 패키지 FileMain 클래스의 절대경로
		 */
		 
		  File file1=new File("C: \\ 2023-05-JAVA-DEVELOPER \\ workspaceSE \\ 20.입출력[IO] \\ 데미안.txt"); //절대경로 
		  File file2=new File(" 죄와벌.txt"); //상대경로 
		  File file3=new File("sample / image1.jpg"); //상대경로 
		  File file4=new File("sample / subSample1 / 00.VariableDeclare.txt"); //상대경로 
		  File file5=new File("sample / subSample2 / 11.OOP.txt"); //상대경로 
		  
		  
		  System.out.println("---------- 1. file path[relative] -----------------");
		  System.out.println(file1.getPath());
		  System.out.println(file2.getPath());
		  System.out.println(file3.getPath());
		  System.out.println(file4.getPath());
		  System.out.println(file5.getPath());
		  System.out.println("---------- 2. file path[absolute] -----------------");
		  System.out.println(file1.getAbsolutePath());
		  System.out.println(file2.getAbsolutePath());
		  System.out.println(file3.getAbsolutePath());
		  System.out.println(file4.getAbsolutePath());
		  System.out.println(file5.getAbsolutePath());
		  System.out.println("---------- 3. file name -----------------");
		  System.out.println(file1.getName());
		  System.out.println(file2.getName());
		  System.out.println(file3.getName());
		  System.out.println(file4.getName());
		  System.out.println(file5.getName());
		  
		  File dir0 = new File("sample");
		  File dir1 = new File("sample");
		  File dir2 = new File("sample/subSample1");
		  File dir3 = new File("sample/subSample2");
		  System.out.println("---------------------isDirectory,isFile -------------------");
		  System.out.println(dir0.isDirectory());
		  System.out.println(dir1.isDirectory());
		  System.out.println(dir2.isDirectory());
		  System.out.println(dir3.isDirectory());
		  System.out.println(dir0.isFile());
		  System.out.println(dir1.isFile());
		  System.out.println(dir2.isFile());
		  System.out.println(dir3.isFile());
		  System.out.println(file1.isFile());
		  System.out.println(file3.isFile());
		  
		  System.out.println("------------------- 디텍토리안에 파일(디렉토리) 목록 (String[]) -----------------------");
		  
		  String[] fileNameList=dir1.list();
		  for (String fileName : fileNameList) {
			System.out.println("\t"+fileName);
		  }
		  
		  System.out.println("------------------- 디텍토리안에 파일(디렉토리) 목록 (String[]) -----------------------");
		  File[] fileList=dir1.listFiles();
		  for (File file : fileList) {
			if(file.isDirectory()) {
				System.out.println("D:"+file.getName());
				//Directory
				File[] subFileList=file.listFiles();
				for (File subFile : subFileList) {
					System.out.println("\t"+subFile.getName());
				}
			}else {
				System.out.println("F:"+file.getName());
			//File
			}
		}
		  System.out.println("---------- 디렉토리생성 ---------------");
		  File newDir1 = new File("newDir1");
		  File newDir2 = new File("newDir2");
		  File newDir3 = new File("newDir3");
		  File newDir4 = new File("sample /subsample1");
		  
		  System.out.println(">> newDir1 디렉토리 생성여부 : " + newDir1.mkdir());
		  System.out.println(">> newDir2 디렉토리 생성여부 : " + newDir2.mkdir());
		  System.out.println(">> newDir3 디렉토리 생성여부 : " + newDir3.mkdir());
		  System.out.println(">> newDir4 디렉토리 생성여부 : " + newDir4.mkdir());
		  
		  
		  System.out.println("---------- 디렉토리이름변경 ---------------");
		  newDir2.renameTo(new File("renameDir2"));
		  
		  System.out.println("---------- 디렉토리삭제 ---------------");
		  /*
		   *  deleteOnExit - 있으면 삭제
		   *  delete - 삭제
		   */
		  newDir3.deleteOnExit(); 
		  
		  System.out.println("------- 파일생성,삭제,이름변경 --------");
		  
		  File newFile1=new File("newDir1","newFile1.txt");
		  File newFile2=new File("newDir1/newFile2.txt");
		  File newFile3=new File("newDir1/newFile3.txt");
		  File newFile4=new File("C:\\2023-05-JAVA-DEVELOPER\\workspaceSE\\20.입출력[IO]\\sample\\subSample2\\14.Overloading[다중정의].txt");
		  
		  System.out.println("newFile1.txt 생성여부:"+newFile1.createNewFile());
		  System.out.println("newFile2.txt 생성여부:"+newFile2.createNewFile());
		  System.out.println("newFile3.txt 생성여부:"+newFile3.createNewFile());
		  System.out.println("newFile4.txt 생성여부:"+newFile4.createNewFile());
		  
		  newFile2.renameTo(new File("renameNewFile1.txt"));
		  
		  System.out.println("newFiele2.txt 삭제여부 : "+ newFile2.delete());
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
	}

}
