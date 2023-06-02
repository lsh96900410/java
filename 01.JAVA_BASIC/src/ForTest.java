
public class ForTest {

	public static void main(String[] args) {
		System.out.println("-------------while---------------");
		int k = 0 ;		//1.반복변수 초기화
		while(k<10){	//2.반복변수비교(반복조건)
			System.out.println("k="+k);//3.반복문 실행
			k++;		//4.반복변수증가(감소)
		}
		System.out.println("-------------for i증가------------------");
		for(int i=0 ; i< 10 ; i++) {
			System.out.println("i="+i);
		}
		System.out.println("-------------for i감소------------------");
		for(int i = 10 ; i > 0 ; i--) {
			System.out.println("i=" + i);
		}
		System.out.println(">> 홀수만 출력[1~100]");
		for(int i=1 ; i<=100 ; i++) {
			if(i%2 == 1) {
			System.out.println(i+" ");
			}
			  
				  
		 }
		System.out.println();
		System.out.println(">> 4의배수출력[1~100]");
		  
		  for(int i=1 ; i<=100 ; i++) {
			  if(i%4==0) {
				  System.out.println(i + " ");
			  }
		}
		  System.out.println();
		  System.out.println(">> 3과4의 공통배수[1~100]");
		  for(int i =1 ; i<=100 ; i++) {
			  if(i%3==0 && i%4==0) {
				  System.out.println(i+" ");
			  }
		  }
		  System.out.println();
		  
		  System.out.println(">> 3과4의 최소공배수(break)[1~100]");
		  for(int i =1 ; i<=100 ; i++) {
			  if(i%3==0 && i%4==0) {
				  System.out.println(i+" ");
				  break;
				  /*
				   * break문
				   * 1.반복문에서 사용
				   * 2.break문 이후의 for블록코드를 실행하지않는다
				   * 3.다음반복코드블록도 실행하지않는다.(반복블록을 빠져나온다)
				   */
			  }//end if
		  }//end for loop
		  System.out.println();
		  System.out.println(">>4의배수가아닌수출력[continue]");
		  for(int i=1 ; i<=100 ; i++) {
			  if(i%4==0) {
				 /*
				  4의배수조건을 만족하면 continue문이 실행되고
				  현재실행중인 for블록의 continue문이후코드를 실행하지않고
				  다음횟수의 블록을 실행한다.
				  */
				  continue;
				  /*
				   0.반복 블록에서만 사용가능하다.
				   1.continue문 이후의 for블록코드를 실행하지 않는다.
				   2.다음반복을 계속실행한다(continue)
				   */
			  }
		  System.out.print(i+" ");
		  }
		  
		  System.out.println();
		  System.out.println(">> 홀수짝수합[1~100]");
		  
		  int oddTot=0 ;
		  int evenTot=0 ;
		  for (int i=1 ; i<=100 ; i++) {
			  if(i%2==0) 
				  		//짝수누적
				  evenTot+=i;
			  else 		//홀수누적
				  oddTot+=i;
			  
		  }
		  System.out.println("짝수합: " +evenTot);
		  System.out.println("홀수합: " +oddTot);
		  System.out.println("-------문자출력------"); 
		  
		  for(char c ='a' ; c<='z' ; c++) {
			  System.out.print(c);
			  if(c=='z') {
				  continue;
			  }
			  System.out.print(",");
		  }
		System.out.println();
		  
		  
		  
		  
		  
	}

}
