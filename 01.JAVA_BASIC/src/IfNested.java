
public class IfNested {

	public static void main(String[] args) {
		/*
		 * 학점계산(A,B,C,D,F)
		 */

		int kor = 75;
		char hakjum = 'F';
		System.out.println("-------- nested if --------");

		if (kor >= 90 && kor <= 100) {
			// A학점
			hakjum = 'A';
		} else {
			/***** B,C,D,F ******/
			if (kor >= 80 && kor < 90) {
				// B학점
				hakjum = 'B';
			} else {
				/***** C,D,F *****/
				if (kor >= 70 && kor < 80) {
					// C학점
					hakjum = 'C';
				} else {
					if (kor >= 60 && kor < 70) {
						hakjum = 'D';
					} else {
						hakjum = 'F';

					}
				}
			}
		}
		System.out.printf("1. 학점은 %c 입니다. \n", hakjum);
		System.out.println("-------------- else if --------------");
		
		hakjum = 'F' ;
		if(kor >= 90 && kor <=100) {
			hakjum ='A' ;
		}else if ( kor >=80 && kor < 90) {
			hakjum = 'B' ;
		}else if ( kor >=70 && kor < 80) {
			hakjum = 'C' ;
		}else if ( kor >=60 && kor < 70) {
			hakjum = 'D' ;
		}else {
			hakjum = 'F' ;
		}
		
		System.out.printf("2. 학점은 %c 입니다.\n ", hakjum );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
