package lang;

public class StringCompareMain {

	public static void main(String[] args) {
		System.out.println("-------------- String객체 내용비교는 반드시 equals메쏘드를 사용해야함 --------------------");
		/*
		 	<< public boolean equals(String otherString) >>
		 	 - 스트링객체의 문자열 otherString객체의 문자열이 같은지비교해서
		 		true(같은 경구) ,false(다른 경우)를 반환
		 */
		String name1="Kim";
		String name2="Kim";
		String name3="Lim";
		if(name1.equals(name2));{
			System.out.println( "동일하다");
		}
		if(!name1.equals(name3)) {
			System.out.println("문자열이 동일하지않다,");
		}
		if(name1.equals("Kim")) {
			System.out.println("name1객체의 문자열과 \"kim\" 객체의 문자열이 동일하다");
		}
		if(!name1.equals("SIM")) {
			System.out.println("name1객체의 문자열과 \"Sim\" 객체의 문자열이 동일하다");
		}
		
	}
	

}
