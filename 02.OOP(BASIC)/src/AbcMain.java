
public class AbcMain {

	public static void main(String[] args) {
		
		Abc abc;            //Abc 클래스변수 선언
		abc=new Abc();		//객체생성
		
		Abc abc1;			//형식 : 클래스변수 참조변수(객체의 주소값) = new 클래스변수();
		abc1=new Abc();
		
		Abc abc2;
		abc2=new Abc();
		
		abc.a =1 ;  		//객체의 멤버변수에 값을 대입
		abc.b =2 ;			// 형식 : 참조변수(객체의 주소값) . 멤버변수명 = 대입 값 ;
		abc.c =3 ;
		
		abc1.a =4 ;
		abc1.b =5 ;
		abc1.c =6 ;
		
		abc2.a =7 ;
		abc2.b =8 ;
		abc2.c =9 ;
		
		abc.bcAdd(2 , 3);	// 메소드 호출 형식 : 참조변수(객체의 주소값).메소드이름 ( 매개변수값 )
		abc.abAdd(1 , 2);  	//메소드 호출 = 실행흐름이 main 에서 Abc 클래스의 abAdd 메소드로 넘어감
		abc.acAdd(1 , 3);	// 메소드 흐름이 끝나고 실행흐름과 반환값이 같이 main으로 넘어옴
		
		abc1.abAdd(4 , 5);	
		abc1.bcAdd(5 , 6);	
		abc1.acAdd(4 , 6);
		
		abc1.abAdd(7 , 8);
		abc1.bcAdd(8 , 9);
		abc1.acAdd(7 , 9);
		
		abc.b(1);
		abc1.c(30);
		
		abc.setD("이름");    
		
		
		
		
		
		
	System.out.println(abc.a + " " + abc.b+" "+abc.c);
	System.out.println(abc1.a + " " + abc1.b+" "+abc1.c);
	System.out.println(abc2.a + " " + abc2.b+" "+abc2.c);
	

	
	}	
	
}
        