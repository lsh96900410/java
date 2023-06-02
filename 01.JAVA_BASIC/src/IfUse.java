
public class IfUse {

	public static void main(String[] args) {
		
		/*
		 * 짝수 , 홀수판별
		 */
		int no1 =  54 ;
		
		if(no1 % 2 == 0) {
			System.out.println(no1 + "은 짝수입니다.");
		}else {
			System.out.println(no1 + "은 홀수입니다.");
		}
		/*
		 * 4의배수판별
		 */
		int no2=4000;
		if(no2%4==0) {
			System.out.printf("%d 는 4의배수\n",no2);
		}else {
			System.out.printf("%d 는 4의배수아님\n",no2);
		}
		/*
		 * 점수의 유효성체크
		 */
		int kor=90;
		if(kor>=0 && kor<=100) {
			System.out.printf(" %d 는 유효한점수입니다.\n",kor);
		}else {
			System.out.printf(" %d 는 유효한점수 아닙니다.\n",kor);
		}
		
		/*
		 * 윤년여부출력
		 */
		int year= 2000;
		String msg="";
		if(year%4==0 && year%100!=0 || year%400==0) {
			msg="윤년";
		}else {
			msg="평년";
		}
		System.out.printf("%d년은 %s입니다.\n",year,msg);
		
		/*
		 * 문자판단
		 */
		char c='9';
		if(c>='A'&& c<='Z') {
			System.out.printf(" %c 는 알파벳 대문자 입니다.\n",c);
		}
		if(c>='a'&& c<='z') {
			System.out.printf(" %c 는 알파벳 소문자 입니다.\n",c);
		}
		if(c>='0'&& c<='9') {
			System.out.printf(" %c 는 숫자형태 문자 입니다.\n",c);
		}
		/*
		 Quiz:
		 다음문자는 아이디의 첫글자입니다. 
		 이문자가 아이디의 첫글자로 유효한지판단후출력하세요 
		   - 아이디의첫글자는 알파벳대문자 이거나 소문자이다
		 */
		char idFirstLetter = '&';
		if((idFirstLetter>='A' && idFirstLetter<='Z')||(idFirstLetter>='a' && idFirstLetter<='z')) {
			System.out.printf("%c 는 유효한아이디 첫문자입니다.\n",idFirstLetter);
		}else {
			System.out.printf("%c 는 유효안한아이디 첫문자입니다.\n",idFirstLetter);
		}
	}

}
