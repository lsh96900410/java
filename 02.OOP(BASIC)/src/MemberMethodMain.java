
public class MemberMethodMain {

	public static void main(String[] args) {
		System.out.println("main block start");
		MemberMethod mm1= new MemberMethod() ;
		mm1.member1 = 123 ;
		System.out.println("main stmt1");
		/*
		 *	멤버메쏘드실행(호출)
		 *	 -  형식 : 참조변수.메쏘드이름();
		 *	 -	main실행흐름을 mm1주소에있는 객체의 method1이라는 이름의 메쏘드(실행코드블록)로 보낸다.
		 */
		mm1.method1();
		System.out.println("main stmt2");
		mm1.method2();
		System.out.println("main stmt3");
		mm1.method2();
		System.out.println("main stmt4");
		mm1.method3(1);
		System.out.println("main stmt5");
		mm1.method3(1) ;
		System.out.println("main stmt6");
		mm1.method4(" 안녕하세요 ", 3 );
		System.out.println("main stmt7");
		mm1.method4(" 오전수업 끝 식사맛있게하세요 ", 10 );
		System.out.println("main block end");
	
		return;//jvm으로
	}

}
