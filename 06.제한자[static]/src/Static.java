	/*
 * static (제한자,제어자,modifier)
 *   1.멤버필드(변수)나,멤버메쏘드 앞에 부칠수있다.
 * 	 2.static 제한자가 붙어있는 멤버필드(변수)나 멤버메쏘드는
 *     객체생성 없이도 사용이가능하다.
 *   3.클래스(틀)가 가지고있는 멤버변수나 멤버메쏘드이다.
 *   4.클래스로부터 생성되는 객체들이 공유하는 필드(변수),메쏘드 이다.      
 *     -->공용필드(공용메쏘드)라고도한다.
 *          
 *  -형식: 
 *  	멤버변수: public static int i;
 * 		멤버메쏘드:
 * 				- public static void print(){}
 * 				- public static int add(){}	
 * - 변수
 *  1.지역변수       : 메쏘드의 블록안에 선언된변수(매개변수)
 *  2.멤버필드(변수) : 클래스의 블록안에 선언된변수
 * 			2-1. 객체 필드(변수):인스턴스 생성되어야 사용할수있는 필드
 *          2-2. 정적 필드(변수):인스턴스 생성과 관계없이 사용가능한 필드
 *                               클래스로딩시 클래스에 생성되는 필드(변수)
 *                               
 * - 메쏘드
 *  1.멤버메쏘드
 *          1-1.객체 메쏘드:인스턴스 생성되어야 호출가능한메쏘드
 *          1-2.정적 메쏘드:인스턴스 생성과 관계없이 호출가능한 메쏘드
 *                          클래스로딩시 클래스에 생성되는 메쏘드                              
 */
public class Static {
	/**
	 * 객체필드
	 */
	public int instance_field;
	/**
	 * 정적필드
	 */
	public static int static_field;
	
	public void instance_method() {
		System.out.println(this + "난 인스턴스(객체) 메소드");
	}
	
	public static void static_method() {
		System.out.println("난 정적(static)메쏘드");
	}
	
	
	
	
	
	
	
	
	
}
