
public class WhileUseChar {

	public static void main(String[] args) {
		/*
		 * 문자출력
		 */
		char c1 = 0;
		while(c1 < 10) {
			System.out.print(c1);
			c1++;
			if(c1%100 == 0) {
				System.out.print("\n");
			}
		}
		System.out.println();
		
		/*
		 * -영문 소문자 출력
		 */
		char c2= 'a';
		while(c2<='z') {
			System.out.print(c2+ " ");
			c2++;
			if (c2%5 ==0) {
				System.out.println();
			}
		}
		System.out.println();
	/*
	 * -영문소문자출력
	 * 다섯 묶음씩
	 */
	/*
	 * 한글출력
	 */
	char han = '가' ;
	while(han<='힣') {
		System.out.print(han);
		han++;
		if(han % 100==0)
		System.out.println();
	}
	System.out.println();
	/*
	 * 숫자형문자(0~9)
	 */
	char c3='0';
	
	while(c3<='9') {
		System.out.print(c3+" ");
		c3++;
	}
	System.out.println();
	
	}

}
