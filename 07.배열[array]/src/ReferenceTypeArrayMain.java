
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		/*
		int a = 345;
		int[] ia;
		Account acc;
		Account[] accArray;
		*/
		Account[] accountArray = new Account[5] ;
		accountArray [0] = new Account(1, "KIM", 30000, 0.3);
		accountArray [1] = new Account(2, "LEE", 45000, 4.2);
		accountArray [2] = new Account(3, "MIN", 78000, 3.8);
		accountArray [3] = new Account(4, "NIM", 92000, 2.9);
		accountArray [4] = new Account(5, "OIM", 81000, 1.7);
		
		Account.headerPrint();
		accountArray[0].print();
		accountArray[1].print();
		accountArray[2].print();
		accountArray[3].print();
		accountArray[4].print();
		
		System.out.println("---------------------for loop ------------------------");
		for(int i=0 ; i<accountArray.length ; i++){
			accountArray[i].print();
		}
		
	}

}
