
public class TypeCasting {

	public static void main(String[] args) {
		
		/*
		 * 자동형변환
		 */
		System.out.println("-----------자동형변환-------------");
		int i1 = 56 ;
		long l1 = i1 ;
		double d1 =l1 ;
		System.out.println(i1);
		System.out.println(l1);
		System.out.println(d1);
		/*
		 * 강제형변환
		 */
		System.out.println("-----------강제형변환-------------");
		double avgd = 89.34 ;
		//Type mismatch: cannot convert from double to int 
		//int avgi = avgd ;
		int avgi = (int) avgd ;
		System.out.println( "double avg : " + avgd );
		System.out.println( "int avg : " + avgi );
		
		char cc = '힣' ;
		System.out.println("char cc : " + cc);
		int ci = cc ;
		System.out.println("int ci : " + ci);
		char cc2 = (char) ci ;
		System.out.println("char cc2 : " + cc2);
		System.out.println("int --> char : " + (char)44230) ;
		/*
		 * 연산시의 형변환
		 *  -연산항들중 가장큰타입으로 모든항이 자동형변환된다.
		 */
		int ii = 100 ;
		long ll = 234334 ;
		double dd = 3.14159 ;
		
		double result = ii + ll + dd ;
		System.out.println("double result : " + result);
		// 형변환으로 데이터 손실 X
		double dresult1 = 1.0/2 ; 
		System.out.println(dresult1);
		double dresult2 = (double) 1/2 ;
		System.out.println(dresult2);
	}

}
