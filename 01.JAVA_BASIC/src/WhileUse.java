
public class WhileUse {

	public static void main(String[] args) {

		System.out.println("-------------i=0-------------");
		int i = 0;//반복횟수변수
		while( i < 10 ) {
			System.out.println("stmt:i= "+i);
			i++;
		}
		System.out.println("----------------i=1------------");
		i=1 ;
		while(i<=10) {
			System.out.println("stmt:i="+i);
			i++;
		}
		System.out.println(">> 1~10사이의 정수출력(10회)");
		i = 0 ;
		while ( i<10 ) {
			System.out.print((i+1)+" ");
			i++ ;
		}
	System.out.print("\n");
	i=1;
	while(i<=10) {
		System.out.print(i + " ");
		i++ ;
	}
	System.out.println();
	System.out.println(">> 1~10[홀수]");
	i = 1 ;
	while( i<=10 ) {
		if(i%2==1) {
		System.out.print(i+" ");
		}
		i++ ;
	}
	System.out.println();
	System.out.println(">> 1~100[4의배수]");
	i=1 ;
	while(i<=100) {
		if(i%4==0) {
			System.out.print(i+" ");
		}
		i++;
	}
	System.out.println();
	System.out.print("1900년에서 2030년까지 윤년을 출력하세요");
	int year=1900 ;
	while(year<=2023) {
		if(year%4 ==0 && year%100!=0 || year%400==0){
			System.out.print(year+"\t");
		}
		year++;
	}
	System.out.println();
	System.out.println(">>1~100 사이의 정수합[누적]");
	
	int tot = 0 ;//누적합
	int oddTot=0;//홀수합
	int evenTot=0;//짝수합
	i=1;
	while(i<=100) {
		//tot = tot+i;
		tot+=i;//연산후대입연산자
		
		if(i%2==0) {
			evenTot+=i;
		}else {
			oddTot+=i;
		}
		i++;
	}

	System.out.println(">>1~100사이의 정수합:" + tot);
	System.out.println(">>1~100사이의 짝수합:" + evenTot);
	System.out.println(">>1~100사이의 홀수합:" + oddTot);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
