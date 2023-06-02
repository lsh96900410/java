
public class OperatorLogical {
	public static void main(String[] args) {
		boolean b1,b2,b3,b4 ;
		boolean result;
		b1 = true ;
		b2 = true ;
		b3 = false ;
		b4 = false ;
		
		result = b1 || b2 ;
		System.out.println("true || true = " + result);
		result = b1 || b3 ;
		System.out.println("true || false = " + result);
		result = b3 || b1 ;
		System.out.println("false || true = " + result);
		result = b3 || b4 ;
		System.out.println("fasle || false = "   + result);
		//false false 인 경우에만 false
		
		result = b1 && b2 ;
		System.out.println("true && true = " + result);
		result = b1 && b3 ;
		System.out.println("true && false = " + result);
		result = b3 && b1 ;
		System.out.println("false && true = " + result);
		result = b3 && b4 ;
		System.out.println("false && false = "   + result);
		//true true 인 경우에만 true
		
		/*
		 * 점수의 유효성체크 [0~100사이의 점수]
		 * 
		 */
		int kor = 67 ;
		int eng = 90 ;
		
		boolean condition1 = kor >=  0 ;
		boolean condition2 = kor <= 100;
		boolean isValidScore = condition1 && condition2 ;
		System.out.println("국어점수유효성체크 = " +isValidScore);
		
		boolean condition3 = kor >= 90 ;
		boolean condition4 = eng >= 90 ;
		
		System.out.println( "\nA대학 국어점수가 90점이상 이거나 영어점수가 90점이상이면 합격" );
		boolean isPass1 = condition3 || condition4 ;
		System.out.println( "A대학 합격여부 = " + isPass1 );
		System.out.println( "\n대학 국어점수가 90점이상 이고 영어점수가 90점이상이면 합격" );
		boolean isPass2	= condition3 && condition4 ;
		System.out.println( "B대학 합격여부 = " + isPass2);
	
		int math = 73 ;
		boolean isValidMathScore = (math >= 0) && (math <= 100) ;
		System.out.println("수학점수의 유효성여부 = " + isValidMathScore);
		boolean isInvalidMathScore = math < 0 && math > 100 ;
		System.out.println("수학점수의 유효하지않은지여부 = " + isInvalidMathScore);
		
		System.out.println("--------배수판별--------");
		int number = 12 ; 
		boolean isMultiple_3 = ( number % 3 ) == 0 ;
		System.out.println("3의 배수여부 =" + isMultiple_3);
		boolean isMultiple_4 = ( number % 4 ) == 0 ; 
		System.out.println("4의 배수여부 =" + isMultiple_4);
		boolean isMultiple_34 = isMultiple_3 && isMultiple_4 ;
		System.out.println("3과4의 공통배수(공배수)여부 = " + isMultiple_34 );
		
		int year = 2023 ;
		boolean isLeapYear = false ;
		System.out.println(year + "의 윤년여부 = " + isLeapYear);
		
		char c = '나' ;
		
		boolean isHangul = ( c >= '가' ) && ( c <= '힣' ) ;
		System.out.println("한글여부 = " + isHangul);
		
		
		/*
		 *  아이디의 첫 글자는 영문대문자 이거나 소문자여야한다.
		 */
		char idFirstLetter = 'w' ;
		boolean isValidIdFirstLetter = ( idFirstLetter >= 'a' )  || ( idFirstLetter <= 'Z' ) ;
		
		System.out.println(idFirstLetter + "의 적합성여부 = " + isValidIdFirstLetter);
	}

}
