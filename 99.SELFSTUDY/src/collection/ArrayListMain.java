package collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMain {

	public static void main(String[] args) {
		Account a1 = new Account(1, "KI", 1000, 1.0);
		Account a2 = new Account(2, "LI", 2000, 2.0);
		Account a3 = new Account(3, "GI", 3000, 3.0);
		
		
		// ArrayList 선언 
		// ArrayList<타입> 이름 = new ArrayList<타입>();
		
		ArrayList list = new ArrayList(); // 타입설정 x , object로 사용
		ArrayList<Account> arrayList=new ArrayList<Account>(5); //타입설정 o  , Account 객체로 사용 , 크기 5로 지정
		
		Account[] acar=new Account[2];
		
		/*
		 ArrayList add 메소드
			.add( Object ) = 맨 끝부분에 대입
			.add( 번호 , Object ) : 번호 인덱스에 대입
		*/
		arrayList.add(a3);  // a3 객체 ArrayList 마지막에 대입
		arrayList.add(a2);  
		/*
		 *  a2 객체 ArrayList 마지막에 대입 ==> [ Account [no=3, owner=GI, balance=3000, iyul=3.0] 
		 *  									 ,Account [no=2, owner=LI, balance=2000, iyul=2.0] ]
		 */
		arrayList.add(0, a1); // a1 객체 arrayList 0번 인덱스에 대입
		/*
			[Account [no=1, owner=KI, balance=1000, iyul=1.0], 
			 Account [no=3, owner=GI, balance=3000, iyul=3.0], 
			 Account [no=2, owner=LI, balance=2000, iyul=2.0]]

		 ==> 0번 인덱스 뒷 번호 인덱스들은 자연스럽게 밀려남
		*/
		
		arrayList.add(1, a2); // ArrayList 1번 인덱스에 a2 객체 대입
		/*
			[Account [no=1, owner=KI, balance=1000, iyul=1.0],
			 Account [no=2, owner=LI, balance=2000, iyul=2.0],
			 Account [no=3, owner=GI, balance=3000, iyul=3.0], 
			 Account [no=2, owner=LI, balance=2000, iyul=2.0]]
		
		==> a3가 한칸 밀려남, 중복 허용이기에 a2 객체 2군데 존재
		
		*/
		
		arrayList.add(3, new Account(4, "JO", 4000, 4.0));  // ArrayList 3번 인덱스에 새로운 객체 생성,대입  Account 클래스에 생성자 사용
			
		arrayList.add(new Account(5, "RO", 5000)); //ArrayList 마지막 인덱스에 새로운 객체 생성 인자 3개
		/*
			[Account [no=1, owner=KI, balance=1000, iyul=1.0], 
			 Account [no=2, owner=LI, balance=2000, iyul=2.0], 
			 Account [no=3, owner=GI, balance=3000, iyul=3.0], 
			 Account [no=4, owner=JO, balance=4000, iyul=4.0], 
			 Account [no=2, owner=LI, balance=2000, iyul=2.0],
			 Account [no=5, owner=RO, balance=5000, iyul=0.0]]
		
		==> ArrayList 초기 선언시 크기 5로 선언, 크기 자동적으로 늘어남 
			5번 인덱스 객체는 iyul 값 인자로 안받음=> double타입 null 값인 0.0 으로 자동대입
		*/
		
		
		
		
		
		
		
		
		
		//  ArrayList 값 set 메쏘드 사용해서 변경하기 [ set(int index, Object) ]
		// ==> 변경하기 위해서는 변경 희망값의 인덱스 번호를 알아야함
		
		
		
		
		arrayList.set(4, arrayList.get(5)); //4번 인덱스 arrayList 5번인덱스 값 대입
		
		/*
		[Account [no=1, owner=KI, balance=1000, iyul=1.0], 
		 Account [no=2, owner=LI, balance=2000, iyul=2.0], 
		 Account [no=3, owner=GI, balance=3000, iyul=3.0], 
		 Account [no=4, owner=JO, balance=4000, iyul=4.0], 
		 Account [no=5, owner=RO, balance=5000, iyul=0.0],
		 Account [no=5, owner=RO, balance=5000, iyul=0.0]]
		
		==> get 메쏘드 사용해서 5번 인덱스 값 호출 후 set 메쏘드를 통해 4번 인덱스에 대입
		*/
		
		
		
		
		/* ArrayList 값 삭제하기
		 	= remove(), clear() 메쏘드 존재
			clear()  : 모든값 삭제 시 사용
			remove() : 값 하나씩 삭제시사용
			  - remove( Object ) : 해당 arrayList에 인자로 받은 Object와 같은 값을 서치후 삭제함
			  - remove ( int index ) : 해당 arrayList의 index에 해당하는 값 삭제
		*/
		
		
		
		
		arrayList.remove(5); // 5번 인덱스 삭제
		
		/*
		[Account [no=1, owner=KI, balance=1000, iyul=1.0], 
		 Account [no=2, owner=LI, balance=2000, iyul=2.0], 
		 Account [no=3, owner=GI, balance=3000, iyul=3.0], 
		 Account [no=4, owner=JO, balance=4000, iyul=4.0], 
		 Account [no=5, owner=RO, balance=5000, iyul=0.0]]
		
		*/
		
		arrayList.remove(a1); //arrayList 중 a1객체와 같은값을 서치후 삭제
		/*
		[Account [no=2, owner=LI, balance=2000, iyul=2.0], 
		 Account [no=3, owner=GI, balance=3000, iyul=3.0], 
		 Account [no=4, owner=JO, balance=4000, iyul=4.0], 
		 Account [no=5, owner=RO, balance=5000, iyul=0.0]]
		*/
		 // arrayList.remove(new Account(5, "RO", 5000,0.0)); // 5, "RO" , 5000 값을 가지는 새로운객체 서치후 삭제 ?
		
		
		
		
		
		
		//ArrayList 크기 구하기 ==> size() 메쏘드
		System.out.println(arrayList.size()); // ==> 4
		
		//ArrayList 값 get 메쏘드 사용해서 구하기 ( for문 , 향상 for 문 사용 ) 
		
		System.out.println(arrayList.get(1)); // 1번 인덱스 값 출력
		
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}
		// for 문을 통해서 arrayList 모든값 출력
		
	/*
		for (Account list : arrayList) {
			System.out.println(arrayList);
		}
		*/
		
		
		
		
		
		
		
		
		
		/*
		 
		 	ArrayList 값 검색하기 ==> contain() , indexOf()	
			contain() : 값이 있는지 여부만 파악
			indexOf() : 값이 있는 인덱스 위치를 알려주고 없으면 -1 
		*/
		
		arrayList.contains(a2); // ==> true
		System.out.println(arrayList.indexOf(a2)); // ==> 0 
		arrayList.remove(0); 
		System.out.println(arrayList.indexOf(a2)); // 0번인덱스 삭제후 a2 검색 ==> -1 : 
		
		
		 
		
		// 번호 3번인 계좌 찾은 뒤 출력
		for (Account account : arrayList) {
			if(account.getNo()==3) {
				System.out.println(account);
			}
				
		}
		
		
		
		ArrayList<String> colors =new ArrayList<>(Arrays.asList("Black","Red","BLUE","GREEN")); 
		/*
		Arrays.asList()는 Arrays의 private 정적 클래스인 ArrayList를 리턴한다.
		java.util.ArrayList 클래스와는 다른 클래스이다.
		 set(), get(), contains()  ok    ,   add() x
		 
		*/
		System.out.println(colors);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//System.out.println(arrayList);
	}

}
