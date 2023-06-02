
public class SwitchUse {

	public static void main(String[] args) {
		
		/*
		 * 짝수홀수판별
		 */
		int num = 23 ;
		
		switch (num % 2 ) {
		case 0 : 
			System.out.println(" 짝수 입니다.");
			break ;
		case 1 : 
			System.out.println(" 홀수 입니다.");
			break ;
		}
	/*
	 * 1~6 사이의 정수발생
	 */
	
	int diceNo = (int) (Math.random() * 6) + 1 ;
	System.out.println(diceNo);
	switch(diceNo) {
	case 1 :
		System.out.println("dice number : "+diceNo);
		break ;
	case 2 :
		System.out.println("dice number : "+diceNo);
		break ;
	case 3 :
		System.out.println("dice number : "+diceNo);
		break ;
	case 4 :
		System.out.println("dice number : "+diceNo);
		break ;
	case 5 :
		System.out.println("dice number : "+diceNo);
		break ;
	case 6 :
		System.out.println("dice number : "+diceNo);
		break ;
	}
	/*
	 * 입력되는 키보드문자열에따라 게임캐릭터이동
	 */
	char direction = 'a' ;
	
	switch (direction) {
	case 'A'://케이스 두 가지 입력
	case 'a'://한 케이스로 인식 후 출력
		System.out.println("move left~");
		break;
	case 'W':
	case 'w':
		System.out.println("move up ~");
		break;
	case 'D':
	case 'd':
		System.out.println("move right ~");
		break;
	case 'X' :
	case 'x' :
		System.out.println("move down ~");
		break;
	case 'S':
	case 's':
		System.out.println("move rotate ~");
		break;
default:
		System.out.println("don`t move ~");
		break;
	}
	/*
	 * Quiz : 대소문자 구분없이 실행되도록 해보세요 
	 */
	
		
		
	}

}
