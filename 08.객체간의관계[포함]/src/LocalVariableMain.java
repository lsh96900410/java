
public class LocalVariableMain {

	public static void main(String[] args) {
		/*
		 * 지역변수(local variable)
		 * 	 - 메쏘드 블록안에서 선언된변수(매개변수)
		 * 멤버변수(필드)
		 * 	 - 클래스블록안에 선언된변수
		 */
		/*
		 * local 변수(기본형변수)
		 */
		/*
		int a ;
		int b ;
		System.out.println("a="+a);
		System.out.println("b="+b);
		*/
		/*
		 * 모든변수는 반드시 초기화하여야 사용할수 있다.
		 */
		/* 
		<< 1. The local variable tot may not have been initialized >>
		int tot;
		System.out.println(tot);
		*/
		/* 
		<< 2. The local variable tot may not have been initialized >>
		int tot;
		boolean condition=true;
		if(condition) {
			tot=0;
		}
		System.out.println(tot);
		*/
		
		/*
		<< 3. The local variable tot may not have been initialized >>
		int tot;
		tot=tot+1;
		*/
		
		int tot1;
		tot1=1;
		System.out.println(tot1);
	
		int tot2;
		tot2=0;
		boolean condition=true;
		if(condition) {
			tot2=2;
		}
		System.out.println("tot2 =" + tot2);
	
		int tot3 ;
		tot3=0;
		tot3=tot3+3;
		System.out.println("tot3 = "+tot3);
		 /*
		 * 	local변수(참조형변수)
		 */
		/*
		<< 4. The local variable order1 may not have been initialized >>
		Order order1;
		order1.print();
		*/
		Order order1;
		order1=new Order(1, "아이패드외3종", "2023-06-02", 56000);
		order1.print();
		
		/*
		< 2. The local variable order2 may not have been initialized >>
		Order order2;
		boolean condition2=true;
		if(condition2) {
			order2=new Order(1, "바지외4종", "2023-06-02", 23000);
		}
		order2.print(); //if문 거짓일때 값 X
		*/
		Order order2;
		boolean condition2=true;
		if(condition) {
			order2=new Order(20, "Tv외 2종", "2023-06-02", 560000);
		}else {
			order2 =new Order(21, "NoteBook외 1종", "2023-06-02", 34000);
		}
		order2.print();
		
		/*
		 * 참조변수 초기화시 기본값
		 * 	 - null(참조변수리터럴)
		 */
		Order order3 =null;
		if(order3==null) {
			order3=new Order(3, "시계외2종",  "2023-06-02", 80000 );
		}
		order3.print();
	
	}
		
}
