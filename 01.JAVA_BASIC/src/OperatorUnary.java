
public class OperatorUnary {

	public static void main(String[] args) {
		int a = 1 ;
		int b = 2 ;
		
		int ar = -a ; // 부호 변경 
		int br = +b ; //+는 상관 x
		System.out.println(a);
		System.out.println(ar);
		System.out.println(b);
		System.out.println(br);
		
		boolean myTurn = true ;
		System.out.println(myTurn);
		myTurn = !myTurn ; 
		System.out.println(myTurn);
		
		int kor = 90 ;
		System.out.println( "국어점수의 유효한지여부 = " +( kor >= 0 && kor <= 100 ));
		System.out.println( "국어점수의 유효안한지여부 = " +!( kor >= 0 && kor <= 100 ));
		// 부정할때 조건 범위 바꾸기 = ! 
		System.out.println("----------[++i ,--j]-----------");
		int i = 5 ;
		int j = 5 ;
		++i ; // i= i+1
		--j ; // j= j+1
		System.out.println(i);
		System.out.println(j);
		
		System.out.println("----------[i++ ,--j]-----------");
		 i = 5 ;
		 j = 5 ;
		 i++ ; // i= i+1
		 j-- ; // j= j+1
		System.out.println(i);
		System.out.println(j);
	
	
		System.out.println("----------[++i , j++]-----------");
		i = 5;
		j = 5;
		System.out.println(++i); 
		System.out.println(j++); 
		i = 5;
		j = 5;
		int ir = ++i ;
		int jr = j++ ;
		
		System.out.println(ir); 
		System.out.println(jr); 
		
		
		
		System.out.println(i);
		System.out.println(j);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
