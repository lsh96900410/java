
public class LottoMain {

	public static void main(String[] args) {
		System.out.println("------------- 로또번호 6개생성 [중복 X] --------------");
		int[] lottoNumber = {0,0,0,0,0,0};
		/*
		 * 번호생성
		 * - Quiz 중복체크
		 */
		for(int i=0;i<lottoNumber.length ;i ++) {
			lottoNumber[i] = (int)(Math.random()*45)+1;
		}
		/*
		 * 번호출력
		 */
		for(int i=0;i<lottoNumber.length ;i ++) {
			System.out.print(lottoNumber[i]+"  ");
		}
	}

}
