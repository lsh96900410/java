public class WhileNested {

	public static void main(String[] args) {
		/*
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		★★★★★
		 */
		System.out.println("-------------------------------");
		System.out.print("★★★★★\n★★★★★\n★★★★★\n★★★★★\n★★★★★");
		System.out.println("-------------------------------");

		System.out.print("★★★★★\n");
		System.out.print("★★★★★\n");
		System.out.print("★★★★★\n");
		System.out.print("★★★★★\n");
		System.out.print("★★★★★\n");
		System.out.println("-------------------------------");
		int i =0 ;
		while(i<5) {
			System.out.print("★★★★★\n");
			i++;
		}
		System.out.println("1.-------------------------");
				/*★[0,0]★[0,1]★[0,2]★[0,3]★[0,4]
				★[1,0]★[1,1]★[1,2]★[1,3]★[1,4]
				★[2,0]★[2,1]★[2,2]★[2,3]★[2,4]
				★[3,0]★[3,1]★[3,2]★[3,3]★[3,4]
				★[4,0]★[4,1]★[4,2]★[4,3]★[4,4]
				*/
		
		
		i=0;
		while(i<5) {
			int j =0;
			while(j<5) {
				System.out.printf("%s[%d,%d]","★",i,j);
				j++;
			}
			System.out.print("\n");
			i++;
		}
		System.out.println("1.-------------------------");
	/*
	 * ☆★★★★
	 * ★☆★★★
	 * ★★☆★★
	 * ★★★☆★
	 * ★★★★☆
	 */
		i=0 ;
		while(i<5) {
			int j=0;
			while(j<5) {
				if(i==j) {
					System.out.print("☆");
				}else {
					System.out.print("★");
				}
				j++;
		}
			System.out.print("\n");
			i++;
		}
	System.out.println("3.----------------------------");
	/*
	 * ☆☆☆☆☆
	 * ★☆☆☆☆
	 * ★★☆☆☆
	 * ★★★☆☆
	 * ★★★★☆
	 */
	i=0 ;
	while(i<5) {
		int j=0;
		while(j<5) {
			if(i<=j) {
				System.out.print("☆");
			}else {
				System.out.print("★");
			}
			j++;
	}
		System.out.print("\n");
		i++;
	}
	System.out.println("4.[Quiz]-------------------------");
	/*
	 * ★★★★★
	 * ☆★★★★
	 * ☆☆★★★
	 * ☆☆☆★★
	 * ☆☆☆☆★
	 */
	System.out.println("5.[Quiz]-------------------------");
	/*
	 * ★
	 * ★★
	 * ★★★
	 * ★★★★
	 * ★★★★★
	 */
	i=0;
	while(i<5) {
		int j =0;
		while(j<=i) {
			System.out.printf("%s","★");
			j++;
		}
		System.out.print("\n");
		i++;
	}
	System.out.println("6.[Quiz]-------------------------");
	/*
	 * ★★★★★
	 * ★★★★
	 * ★★★
	 * ★★
	 * ★
	 */
	i=5;
	while(i>=0) {
		int j =0;
		while(j<=i) {
			System.out.printf("%s","★");
			j++;
		}
		System.out.print("\n");
		i--;
	}
	}//end main

} //end class
