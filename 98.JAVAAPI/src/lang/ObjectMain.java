package lang;

public class ObjectMain {

	public static void main(String[] args) {
		Object o1 =new Object();
		Object o2 =new Object();
		Object o3 =o1;
		
		/*
		 * 
		 */
		String str1 = o1.toString();
		System.out.println(str1);
		System.out.println(o2.toString());
		System.out.println(o2);
		
		if(o1.equals(o2)) {
			System.out.println("o1 과 o2의 주소가 동일하다.[equals]");
		}else {
			System.out.println("o1 과 o2의 주소가 동일하지않다.[equals]");
			
		}
		if(o1.equals(o3)) {
			System.out.println("o1과 o3의 주소가 동일하다.[equals]");
		}else { 
			System.out.println("o1과 o3의 주소가 동일하지않다.[equals]");
		}	
		
		if(o1==o2) {
			System.out.println("o1 과 o2의 주소가 동일하다.[비교연산자]");
		}else {
			System.out.println("o1 과 o2의 주소가 동일하지않다.[비교연산자]");
			
		}
		if(o1==o3) {
			System.out.println("o1과 o3의 주소가 동일하다.[비교연산자]");
		}else { 
			System.out.println("o1과 o3의 주소가 동일하지않다.[비교연산자]");
		}	
	
	}
		

}
