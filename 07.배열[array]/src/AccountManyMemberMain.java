
public class AccountManyMemberMain {

	public static void main(String[] args) {
		AccountManyMember accountManyMember=
				new	AccountManyMember();
		System.out.println(accountManyMember);
		
		accountManyMember.acc0 = new Account(1, "KIM", 30000, 0.3);
		accountManyMember.acc1 = new Account(2, "LEE", 45000, 4.2);
		accountManyMember.acc2 = new Account(3, "MIN", 78000, 3.8);
		accountManyMember.acc3 = new Account(4, "NIM", 92000, 2.9);
		accountManyMember.acc4 = new Account(5, "OIM", 81000, 1.7);
		accountManyMember.length=5;
		
		Account.headerPrint();
		accountManyMember.acc0.print(); 
		accountManyMember.acc1.print();
		accountManyMember.acc2.print();
		accountManyMember.acc3.print();
		accountManyMember.acc4.print();
		
		
	}

}
