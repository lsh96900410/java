package lang;

public class MathMain {

	public static void main(String[] args) {
		/*
		 * Math 클래스
		 * 	 -수학계산함수를 가지고있는 클래스
		 * 	 -모든메쏘드 static
		 * 	 -객체생성이 불가능하다(생성자 접근제한자 private )
		 */
		/*
		Math math=new Math();
		*/
		
		double r = Math.abs(-127.421);
		System.out.println(r);
		System.out.println(Math.max(123213, 34343));
		System.out.println(Math.min(123213, 34343));
		System.out.println(Math.round(33.55555555));
		System.out.println(Math.round(33.55555555*10)/10.0);
		System.out.println(Math.sqrt(2));
		System.out.println(Math.sqrt(3));
		System.out.println(Math.pow(2,3));
		System.out.println("------------------Math.random()------------------");
		/*
		 * << public static double random() >>
		 * Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0.
		 */
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println(Math.random());
		System.out.println("1~10 사이의 정수5개 랜덤생성");
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println((int)(Math.random()*10)+1);
		System.out.println("1~45 사이의 정수6개 랜덤생성");
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
		System.out.println((int)(Math.random()*45)+1);
	}

}
