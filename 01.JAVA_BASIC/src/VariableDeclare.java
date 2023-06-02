/*
		 값(데이타)
			- 문자  : 김 , A , z
			- 문자열: "김경호", "JAMES" , "Student"
			- 숫자  : 1, 2 , 3 , 3.14159
		 */
		/*
		변수의선언
           	   - 의미:JVM 에게메모리를할당해달라고 요청하는작업
		   - 형태:
		        데이타타입 이름(식별자);
		         ex> int number;

		   - 변수식별자규직(클래스이름,변수이름,메쏘드이름)
			   - 영문이나,한글로시작
			   - 특수문자사용불가(_,$ 는 사용가능)
			   - 키워드 사용금지
		*/
public class VariableDeclare {

	public static void main(String[] args) {
			int score1 ; // 변수 선언 
		    score1 = 78 ;  // 변수에 값(정수형 리터럴)을 할당
		    System.out.println(score1);
		    score1 = 89;
		    System.out.println(score1);
		 
		 	int score2 = 90 ;
		 	System.out.println(score2);
		    score2 = 99;
		    System.out.println(score2);
		  
		   int _number = 333 ;
		   int $number = 444 ; 
		   int 번호 = 55 ;
		   System.out.println(_number);
		   System.out.println($number);
		   System.out.println(번호);
		   
		   int kor , eng , math ;
		   kor = 90 ;
		   eng = 89 ;
		   math = 99 ;
		   System.out.println(kor) ;
		   System.out.println(eng) ;
		   System.out.println(math);
		   
		     // int kor = 99 ;
		     // Duplicate local variable kor
		   
		     // history = 88 ;
		     // history cannot be resolver to a variable
		     // 변수 선언 X
		   
		     // int 7up ;   
		     // int my-score ;
		     // int youre-score ;
		   
		   String name; 
		   name = "이승현";
		   System.out.println(name);
		}
}
