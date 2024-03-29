
	/*
제한자(final)
	1. 클래스앞에 붙일경우
	   상속금지 
       ex> public final class Test{}
    2. 멤버메쏘드앞에 붙일경우 
       오버라이딩 금지
       ex> public final void print(){}
    3. 멤버변수 앞에붙일경우--> 상수
       ex> public final int PORT_NUMBER=80;
       상수화된다.    
       변경금지
*/
public class FinalFieldClass {
	public  final int PORT_NUMBER=80;
	public static final double PI=3.14159;
	public static final int EARTH_RADIUS= 6400;
	public  final double INCENTIVE_RATE;
	/*
	public final Product product = new Product(1, "새우깡");
	product = 변하지 않는 주소값
	*/
	
	public FinalFieldClass() {
		
		
		
		INCENTIVE_RATE=0.1;
	
		
		/*
		this.PORT_NUMBER=88;
		The final field FinalFieldClass.PORT_NUMBER cannot be assigned
		*/
		System.out.println(INCENTIVE_RATE);
		System.out.println(PORT_NUMBER);
		System.out.println(PI);
		System.out.println(Math.PI);
		System.out.println(EARTH_RADIUS);
	}
}
