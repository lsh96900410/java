package generic;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMain {

	public static void main(String[] args) {
		Account acc1=new Account(1111,"BING",33000,0.3);
		Account acc2=new Account(2222,"KING",12000,1.2);
		Account acc3=new Account(3333,"KING",89000,5.6);
		Account acc4=new Account(4444,"HING",45000,4.8);
		Account acc5=new Account(5555,"PING",99000,2.9);
		
		ArrayList<Account> accountList=new ArrayList<Account>();
		int size = accountList.size();
		System.out.println("#size:"+size);
		System.out.println("------------ 1. add[맨마지막 index 에 객체저장]--------");
		accountList.add(acc1);
		System.out.println("#size:"+accountList.size());
		accountList.add(acc2);
		accountList.add(acc3);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("----------- 2. add(index,element)[지정된 index에객체저장]--");
		accountList.add(1,new Account(1112, "NEW", 30000, 3.3));
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("----------- 3. set(index,element)[지정된 index에객체저장]--");
		Account previousAccount=
				accountList.set(accountList.size()-1, new Account(9999, "NINE",90000, 9.9));
		System.out.println(">>> 이전객체");
		previousAccount.print();
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("----------- 4. get(index)[지정된 index에객체참조변수반환]--");
		Account getAccount=accountList.get(accountList.size()-1);
		System.out.println(getAccount);
		System.out.println("----------- 5. remove(index)[지정된 index에객체삭제]--");
		Account removeAccount =accountList.remove(accountList.size()-1);
		System.out.println(removeAccount);
		System.out.println("#size:"+accountList.size());
		System.out.println(accountList);
		System.out.println("%%%%%%%%%%%%%%%%%%   업무실행  %%%%%%%%%%%%%%%%%%%");
		System.out.println("*****************1.계좌전체출력*******************");
		Account.headerPrint();
		for(int i=0;i<accountList.size();i++) {
			Account tempAccount = accountList.get(i);
			tempAccount.print();
		}
		Account.headerPrint();
		for(Account account:accountList) {
			account.print();
		}
		
		System.out.println("**************2.계좌번호3333번 한개찾기*****************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			if(tempAccount.getNo()==3333) {
				tempAccount.print();
				break;
			}
		}
		System.out.println("**************3.계좌주이름 KING인계좌 여러개찾기********");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				tempAccount.print();
			}
		}
		System.out.println("**************4.계좌번호 4444번 계좌한개삭제************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount=accountList.get(i);
			if(tempAccount.getNo()==4444) {
				System.out.println(">>삭제전 size:"+accountList.size());
				Account removeAcc = accountList.remove(i);
				removeAcc.print();
				System.out.println(">>삭제후 size:"+accountList.size());
				break;
			}
		}
		System.out.println("**************5.계좌주이름 KING인계좌 여러개삭제***");
		for(int i=0;i<accountList.size();i++) {
			if(((Account)accountList.get(i)).getOwner().equals("KING")) {
				Account rAccount=accountList.remove(i);
				rAccount.print();
				i--;
			}
		}
		System.out.println("*****************1.계좌전체출력*******************");
		Account.headerPrint();
		for(int i=0;i<accountList.size();i++) {
			accountList.get(i).print();;
		}
		/*%%%%%%%%%%%%%%%%%%%%%%%%%%%%%전체출력[iteration]%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%*/
		System.out.println("%%%%%%%%%%%%%%%%%%전체출력[iteration]%%%%%%%%%%%%%");
		Iterator<Account> accountIterator = accountList.iterator();
		while(accountIterator.hasNext()) {
			Account tempAccount=accountIterator.next();
			tempAccount.print();
		}
		//accountIterator.next();
		
		

	}

}
