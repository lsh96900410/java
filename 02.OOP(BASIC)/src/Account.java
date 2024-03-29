/*
 * 계좌 객채를 생성하기 위한 클래스 ( 틀,타입 )
 */
public class Account {
	
	/*
	 *  1.속성 [멤버필드(변수)]
	 */
	
	int no ; //계좌번호
	String owner; //계좌주 이름
	int balance; //계좌잔고
	double iyul; //계좌이율
	/*
	 *   2. 기능[멤버메쏘드]
	 */
	/*
	 *  계좌데이타를 대입하는 메쏘드
	 */
	void setAccountData(int no , String owner , int balance , double iyul) {
		this.no=no;
		this.owner=owner;     
		this.balance=balance;  //this : 변수 구분 힘듬(자신의 멤버변수 찾기위해)
 		this.iyul=iyul;
	}
	/*
	 *  입금
	 */
	void deposit(int money) {
		this.balance+=money;
	}
	/*
	 * 출금
	 */
	void withDraw(int money) {
		this.balance=this.balance - money ;
		//this.balance-=money; 
	}
	/*
	 * 출력
	 */
	
	/*
	 * 계좌헤더출력
	 */
	void headerPrint() {
		System.out.println("-----------------------");
		System.out.printf("%s  %s  %4s   %s\n" , "번호" , "이름" ,"잔고 " , "이율");
		System.out.println("-----------------------");
	}
	/*
	 * 계좌객체정보출력
	 */
	void print() {
		System.out.printf("%d  %s  %7d   %.1f\n",this.no,this.owner,this.balance,this.iyul);
	}
	
	

}
