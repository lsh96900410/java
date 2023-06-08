
public class AccountConstructorMain {

	public static void main(String[] args) {
		Account account1=
				new Account();
		account1.setAccountData(1111, "KIM", 7800, 2.3);
		account1.deposit(8000);
		account1.headerPrint();
		account1.print();
		
		System.out.println();
		Account account2=new Account(2222, "Lee", 5600, 3.3);
		account2.withDraw(678);
		account2.headerPrint();
		account2.print();
		/*
		 * 객체재사용
		 */
		/*
		account2.setAccountData(3333, "SAN", 3000, 3.4);
		account2.deposit(333);
		account2.headerPrint();
		account2.print();
		*/
		System.out.println(account1);
		System.out.println(account2);
		//toString 재정의 x = 주소값
		//toString 재정의 o = 재정의된값 ( alt sft s ->s)
		
		
		
		
		
		
		
		
	}

}
