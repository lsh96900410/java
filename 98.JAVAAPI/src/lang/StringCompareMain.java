package lang;

public class StringCompareMain {

	public static void main(String[] args) {
		/*
		 * String객체의 생성
		 * 	1.생성자호출 ( 명시적생성 )
		 * 	2. "" 으로생성 ( 암시적생성 )
		 */
		String name1 = new String("KIM");
		String name2 = new String("KIM");
		String name3 = "KIM";
		String name4 = "KIM";
		
		System.out.println("---- String 객체의 내용비교는 반드시 equals메쏘드를 사용하여야한다 ----");
		/*
		 	<< public boolean equals (String otherString) >>
		 */
		if(name1.equals(name2)) {
			System.out.println("naem1객체의 문자열과 name2의 문자열이 동일하다.");
		}
		if(name1.equals(name3)) {
			System.out.println("naem1객체의 문자열과 name3의 문자열이 동일하다.");
		}
		if(name1.equals(name4)) {
			System.out.println("naem1객체의 문자열과 name4의 문자열이 동일하다.");
		}
		if(name1.equals("KIM")) {
			System.out.println("name1객체의 문자열과 \"KIM\"객체의 문자열이 동일하다");
		}
		if("KIM".equals(name4)) {
			System.out.println("\\\"KIM\\\"     객체의 문자열과 \"KIM\"객체의 문자열이 동일하다");
		}
		
		int unicodeGap = "aaa".compareTo("aaa"); 
		System.out.println(unicodeGap);
		unicodeGap = "aaa".compareTo("aab");
		System.out.println(unicodeGap);
		unicodeGap = "aab".compareTo("aaa");
		System.out.println(unicodeGap);
		
		String irum1="홍경호";
		String irum2="김경호";
		
		if(irum1.compareTo(irum2) > 0) {
			System.out.println("irum1,irum2교환[오름차순]");
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
