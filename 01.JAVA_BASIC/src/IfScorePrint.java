
public class IfScorePrint {

	public static void main(String[] args) {
		int kor = 100;
		/*
		 * 점수의 유효성체크
		 */
		if(kor >= 0 && kor <= 100) {
			/******유효한점수*******/
			/*
			 * 학점계산  
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
			
		}else {
			/**********유효하지않은 점수**********/
			System.out.println(kor + "은 유효한 점수가아닙니다. [0~100 사이의 숫자를 입력해주세요");
		}
		
		
		
	}

}
