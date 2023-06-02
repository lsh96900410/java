// 산술 연산자

public class OperatorArithmatic {

	public static void main(String[] args) {
		int a=1 ;
		int b=2 ;
		int result= 0 ;
		
		 result = a + b ;   
		 System.out.println("a + b = " + result);
		 result = a - b ;
		 System.out.println("a - b = " + result);
		 result = a * b ;
		 System.out.println("a * b = " + result);
		 System.out.println("------------연산시의 형변환----------------");
		 result = a / b ; //??????
		 
		 System.out.println("a / b = " + result);
		 double dresult = a/b ;
		 System.out.println("double dresult = a/b --> " + dresult);
		 double dresult2 = (double) a/b ;
		 System.out.println("double dresult =(double) a/b -->" + dresult2);
		 /*
		  * 나머지 연산자
		  * %
		  */
		 result = a % b ;
		 System.out.println("a % b = " + result);
		
		 int number = 16 ;
		 result = number % 4 ;
		 System.out.println("result 변수 값이 0 이면 4의 배수이다 : " +result );
		 
		
		 int year = 2023 ;
		 result = year % 4 ; //0 , 1 , 2 , 3
		 System.out.println("2023 % 4 = " + result);
		 result = year % 100 ;
		 System.out.println("2023 % 100 = " + result);
		 result = year % 400 ;
		 System.out.println("2023 % 400 = " + result);
		 
		 
		 /*
		  * 비트연산자 
		  *  << , >> 
		  *  
		  *  
		  */
		 int i = 1 ;
		 System.out.println("----->>,<<-------");
		 System.out.println(i);
		 result = i  << 1;
		 System.out.println(result);
		 result = i  << 2;
		 System.out.println(result);
		 result = i  << 3;
		 System.out.println(result);
		 result = i  << 4;
		 System.out.println(result);
	
		 i = 128 ;
		 System.out.println(i);
		 result = i >> 1 ;
		 System.out.println(result);
		 i = 128 ;
		 result = i >> 2 ;
		 System.out.println(result);
		 i = 128 ;
		 result = i >> 3 ;
		 System.out.println(result);
		 i = 128 ;
		 result = i >> 4 ;
		 System.out.println(result);
		 
		 System.out.println("-------문자연산--------");
		 char ca = 'A' ;
		 char cz = 'Z' ;
		 
		 int numberOfAlphabet = cz - ca + 1 ;
		 System.out.println("알파벳대문자수 :" + numberOfAlphabet);
		 int numberOfHangul = '힣' - '가' +1 ;
		 System.out.println("한글 글자수수 :" + numberOfHangul);
		
	
		 char hangul1 ='가' ;
		 System.out.println(hangul1);
		 char hangul2 ='가' + 2 ;
		 System.out.println(hangul2);
	}

}
