
public class IfScorePrintReturn {

	public static void main(String[] args) {

		/*
		 *  점수 유효성체크
		 */
		int kor = -90;
		if( ! (kor>=0 && kor <= 100) ) {
			//유효하지않은 점수 -> ! ( 유효한 점수범위 ) 
			System.out.println(kor + " 은 유효한 점수가 아닙니다.");
			return ;
		}
		/*
		 * 학점 계산 
		 */
		char hakjum = ' ' ;
		if(kor >= 90) {
			hakjum = 'A' ;
		}else if (kor >= 80) {
			hakjum = 'B' ;
		}else if (kor >= 70) {
			hakjum = 'C' ;
		}else if (kor >= 60) {
			hakjum = 'D' ;
		}else {
			hakjum = 'F' ;
		}
		System.out.println("학점은 " + hakjum + "입니다.");
	}

}
