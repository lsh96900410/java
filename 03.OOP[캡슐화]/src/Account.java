/*
 * 계좌 객채를 생성하기 위한 클래스 ( 틀,타입 )
 */
public class Account {
	
	/*
	 *  1.속성 [멤버필드(변수)] 
	 */
	
	private int no ; //계좌번호
	private String owner; //계좌주 이름
	private int balance; //계좌잔고
	private double iyul; //계좌이율
	/*
	 *   2. 기능[멤버메쏘드]
	 */
	/*
	 *  계좌데이타를 대입하는 메쏘드
	 */
	public void setAccountData(int no , String owner , int balance , double iyul) {
		this.no=no;
		this.owner=owner;     
		this.balance=balance;  //this : 변수 구분 힘듬(자신의 멤버변수 찾기위해)
 		this.iyul=iyul;
	}
	/*
	 *  입금
	 */
	public void deposit(int money) {
		this.balance+=money;
	}
	/*
	 * 출금
	 */
	public void withDraw(int money) {
		this.balance=this.balance - money ;
		//this.balance-=money; 
	}
	/*
	 * 출력
	 */
	
	/*
	 * 계좌헤더출력
	 */
	public void headerPrint() {
		System.out.println("-----------------------");
		System.out.printf("%s  %s  %4s   %s\n" , "번호" , "이름" ,"잔고 " , "이율");
		System.out.println("-----------------------");
	}
	/*
	 * 계좌객체정보출력
	 */
	public void print() {
		System.out.printf("%d  %s  %7d   %.1f\n",this.no,this.owner,this.balance,this.iyul);
	}
	/* << getter,setter 메쏘드생성단축키 >>
	 * alt + s			-->r
	 * alt + shift + s	-->r
	 */
	// getter, setter
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public double getIyul() {
		return iyul;
	}
	public void setIyul(double iyul) {
		this.iyul = iyul;
	}
	
	

}
