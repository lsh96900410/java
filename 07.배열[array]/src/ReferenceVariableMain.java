
public class ReferenceVariableMain {

	public static void main(String[] args) {
		
		Account account1 = new Account(2351, "아론", 90000, 3.6);
		Account account2 = account1;
		Account account3 = new Account(8989, "김경록", 89000, 5.6);
		
		System.out.println("account1의 주소: "+account1);
		System.out.println("account2의 주소: "+account2);
		account1.print();
		account2.print();
		account1.setOwner("김야론");
		account1.print();
		account2.print();
		
		System.out.println("---------------- Reference Variable Compare ( ==,!= )---------------");
		if(account1 == account2) {
			System.out.println("주소값이 동일하다."+account1+"=="+account2);
		}
		if(account1 != account3) {
			System.out.println("주소값이 동일하지않다."+account1+"!="+account3);
		}
		
		System.out.println(" -------------------Reference Variable swap[주소교환] ------------------------");
		Account a1 = new Account(1000, "일천", 30000, 3.0);	             //멤버 교환 가능
		Account a2 = new Account(2000, "이천님", 80000, 2.0);			 //멤버가 많으면 불편함
		System.out.println("-- swap 전 --");
		a1.print();
		a2.print();
		
		Account tempAccount = a2;
		a2=a1;
		a1=tempAccount;
		
		System.out.println("-- swap 후 --");
		a1.print();
		a2.print();
		
		System.out.println("--------------- Reference Variable null value -------------------");
		/*
		 * null : 객체주소리터럴값
		 *  - 객체주소초기화의 용도로사용
		 *  - null주소 사용시 NullPointerException
		 */
		Account a =null;
		if(a==null) { //방어코드 실제 null일수도있으니까
			a=new Account(9090, "구공이", 565678, 1.3624);
		}
		a.print();
		
		
		
		
	}

}
