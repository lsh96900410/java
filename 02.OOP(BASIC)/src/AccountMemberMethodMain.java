
public class AccountMemberMethodMain {

	public static void main(String[] args) {
		/********************* case1 **************************/
		Account acc1=new Account();
		acc1.setAccountData(1111, "KIM", 10000, 3.0);
		
		/*
		 * 계좌 잔고 8000증가
		 */
		 acc1.deposit(8000);    
		 /*
		  *  2.1111 계좌정보출력
		  */
		 acc1.headerPrint();
		 acc1.print();
		
		 /********************* case2 **************************/
		 /*
			 *  1.은행 모든계좌의 잔고 50원 증가
			 */
			/*
			 *  1-1 전체계좌 생성
			 *  1-2 계좌데이타 대입 
			 */
		 Account a1 = new Account();
		 Account a2 = new Account();
		 Account a3 = new Account();
		 a1.setAccountData(1000, "KIM", 70000, 2.0);
		 a2.setAccountData(2000, "LEE", 98000, 3.5);
		 a3.setAccountData(3000, "SIM", 34000, 2.8);
		 
		 /*
			 *  1-3.모든계좌잔고 50원증가
			 */
		 a1.deposit(50);
		 a2.deposit(50);
		 a3.deposit(50);
	
		 /*
			 *  2.은행계좌 전체정보출력
			 */
		a1.headerPrint();
		a1.print();
		a2.print();
		a3.print();
		 
	
	
	
	
	
	}

}
