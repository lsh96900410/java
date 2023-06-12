package lang;

public class StringUseMain {

	public static void main(String[] args) {
			System.out.println("--------------length-----------------");
			String str1 ="Hava a nice day";
			String str2 ="오늘은 금요일 String 클래스를 공부해요";
			int length1 = str1.length();
			int length2 = str2.length();
			int length3 = "자바가 재미있네요".length();
			String emptyStr="";
			System.out.println("empty string length : " + emptyStr.length());
			
			System.out.println(length1);
			System.out.println(length2);
			System.out.println(length3);
			
			System.out.println("--------------null-------------------");
			String id = null;
			if(id==null || id.equals("")) {
				System.out.println("아이디를 입력하세요");
			}
			
			System.out.println("--------------charAt-----------------");
			String userId="testST$^#!3467";
			char firstChar = userId.charAt(0);
			char lastChar = userId.charAt(userId.length()-1);
			System.out.println(firstChar);
			
			System.out.println(">> 아이디는 영문대(소)문자,숫자여야한다.");
			System.out.println(">> 아이디의 첫글자는 영문대(소)문자여야한다.");
			if((firstChar >='a' && firstChar <='z')||(firstChar>='A'&& firstChar<='Z')) {
				System.out.println(firstChar+"는 아이디의 첫글자로 유요합니다.");
			}else {
				System.out.println(firstChar+"는 아이디의 첫글자로 유요하지않습니다.");
			}
			
			System.out.println("[Quiz] --------- id 유효성체크----------");
			boolean isValid=false;
			for (int i = 0; i < userId.length(); i++) {
			 char tempChar = userId.charAt(i);
			 System.out.print(tempChar+" ");
			} //문자열 모든 문자 개별출력
			System.out.println();
			
			
			System.out.println("--------------subString--------------"); // 원하는 문자열출력
			System.out.println("Hava a nice day".substring(7));
			System.out.println("Hava a nice day".substring(7,11)); //시작인덱스 포함 o ,마지막인덱스 포함 x
			System.out.println("오늘은 금요일 String 클래스를 공부해요".substring(4,7));
			System.out.println("오늘은 금요일 String 클래스를 공부해요".substring(4));
			
			
			System.out.println("--------------indexOf----------------"); //몇번째인지
			String email="guard@gmail.com";
			int atSighnPosition = email.indexOf("@");    
			System.out.println(atSighnPosition);
			System.out.println(email.substring(atSighnPosition+1));
			System.out.println(email.substring(0,atSighnPosition));
			
			
			System.out.println("--------------split------------------"); // 문자열 분리
			String phoneNo="010-5624-5621";
			String[] phoneNoArray=phoneNo.split("-");
			for (String tempNo : phoneNoArray) {
				System.out.println(tempNo);
			}
			
			
			System.out.println("--------------replace----------------"); //문자, 문자열 교체
			String str3 ="자바는 객체지향언어입니다.우리는 자바를 공부합니다.";
			String result3=str3.replace('자', '날');
			System.out.println(result3);
			System.out.println(str3.replace("자바", "파이썬"));
			
			
			System.out.println("--------------toUpperCase,toLowerCase"); //대소문자 변경
			System.out.println("jAvA".toUpperCase());
			System.out.println("jAvA".toLowerCase());
			System.out.println("equals --> " + "java".equals("JAVA"));
			System.out.println("equalsIgnoreCase -->" +"java".equalsIgnoreCase("JAVA"));
			
			
			System.out.println("--------------startsWith-------------"); // 첫 문자열 ,문자형 찾음
			String name="김수한";
			if(name.startsWith("김")) {
				System.out.println("김씨인사람 : " + name);
			}
			String[] names = {"정경호" ,"김미숙" ,"최경녀","김은희","신명숙"};
			for (int i = 0; i < names.length; i++) {
				if(names[i].startsWith("김")) {
					System.out.println("김씨인사람 : " + names[i]);
				}
			}
			/*
			 * Quiz:김씨를찾아 새로운배열에 담아보세요
			 */
			int count=0;
			for (String tempName : names) {
				if(tempName.startsWith("김")) {
					count++;
				}
			}
			String[] kimArray=new String[count];
			int kimIndex=0;
			for (String tempName : names) {
				if(tempName.startsWith("김")) {
					kimArray[kimIndex] = tempName;
					kimIndex++;
				}
			}
			System.out.println("----------kim---------");
			for (String kimName : kimArray) {
				System.out.println(kimName);
			}
			
			System.out.println("--------------endsWith---------------");
			String[] fileNameArray= {
					"a.jpg","s.txt","d.gif","zz.doc","nn.java"
			};
			for (int i = 0; i < fileNameArray.length; i++) {
				if(fileNameArray[i].endsWith(".gif") || fileNameArray[i].endsWith(".jpg")) {
					System.out.println(fileNameArray[i]);
				}
			}
			System.out.println("--------------trim-------------------");
			String id2="  guar d   ";
			System.out.println(id2.length());
			System.out.println(id2.trim().length());
			String chatMessage="                   ";
			if(chatMessage.trim().length()==0) {
				System.out.println("전송안함");
			}
	}

}
