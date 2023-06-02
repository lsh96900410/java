
public class SwitchTest {

	public static void main(String[] args) {
		
		int level = 5 ; //게임레벨 1~5사이의 정수
		switch(level) {
		case 1 :
			// 명령문기술위치
			System.out.println(" 초보 ");
			break ;
			/*
			 * break --> switch block을 빠져나간다. 
			 */
		case 2 :
			System.out.println(" 중수 ");
			break ;
		case 3 :
			System.out.println(" 고수 " + level + "단계");
			break ;
		case 4 :
			System.out.println(" 고수 " + level + "단계");
			break ;
		case 5 :
			System.out.println(" 고수 " + level + "단계");
			break ;
		default :
			System.out.println( " 레벨은 1~5사이의 정수입니다. ");
		}
		
		
	}

}
