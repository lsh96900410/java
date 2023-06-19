package generic;
public class Account {
	
	private int no ; //계좌번호
	private String owner; //계좌주 이름
	private int balance; //계좌잔고
	private double iyul; //계좌이율
	/**
	 * 기본값으로 초기화된 계좌객체생성
	 */
	public Account() {
	}
	/**
	 * 인자값으로 초기화된 계좌객체생성
	 * @param no		계좌번호
	 * @param owner		계좌주
	 * @param balance	계좌잔고
	 * @param iyul		계좌이율
	 */
	public Account(int no, String owner, int balance, double iyul) {
		this.no = no;
		this.owner = owner;
		this.balance = balance;
		this.iyul = iyul;
	}
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
	/**
	 * 입금메쏘드
	 * @param money 입금할돈 0보다큰수여야한다 
	 */
	void deposit(int money) {
		this.balance+=money;
	}
	/*
	 * 출금
	 */
	/**
	 * 출금메쏘드
	 * @param money 출금할돈
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
	/**
	 * 계좌헤더출력
	 */
	public static void headerPrint() {
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
	
	@Override
	public String toString() {
		return "Account [no=" + no + ", owner=" + owner + ", balance=" + balance + ", iyul=" + iyul + "]";
	}
	
	

}
