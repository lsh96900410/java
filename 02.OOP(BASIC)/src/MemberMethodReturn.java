
public class MemberMethodReturn {
	
	/*
	 *  멤버필드
	 *   -멤버필드선언시 값을 대입할수있다.
	 */
	int memberField1 =10 ;
	int memberField2 =20 ;
	int memberField3 =30 ;
	
	/* 
	 * 멤버메쏘드 	
	 */
	int method1(){
		System.out.println("\t--- method1 실행-----");
		int result = 1 + 2;
		System.out.println("\t--- method1 실행종료후 실행흐름과 int 타입 데이타 반환-----");
		/*
		 * return << 호출한 클래스(객체)에게 반환할값 (변수,리터럴,연산의결과)>>;
		 * 	-호출한곳으로 실행흐름을 반환
		 *	-호출한곳으로 데이타 반환
		 *	-반환할 데이터가 없는경우에는 (void) return문은 생략가능   
		 *	-반환할 데이터가 있는경우에는 (int, ...) return문 반드시 기술하여야합니다.   
		 */
		return result ;//실행흐름 , 데이터 반환
	}
	boolean method2() {
		System.out.println("\t --- boolean method2() 실행 ---");
		boolean isMarried = false ;
		System.out.println("\t --- boolean method2() 실행후 boolean 데이타&실행흐름 반환 ---");
		return isMarried ;
	}
	/*
	 * 두개의정수를 파라메타로 받아서 더한결과(정수)를 반환하는 메소드
	 */
	int add(int a , int b) {
		System.out.println("\t--- int add(int a, int b)---실행 ");
		int result = a+b;
		System.out.println("\t--- int add(int a, int b)---종료 후 데이타반환 ");
		return result ;
	}
	/*
	 * 이름을매개변수로 입력받아서 인사말을 만들어서 문자열로 반환하는 메소드
	 */
	String hello(String name ) {
		String msg = name + "님 안녕하세요";
		return msg;//return 반환 데이터는 무조건 타입 하나.
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
