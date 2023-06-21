
public class OuterClass {
	/*
	 *  인스턴스 멤버필드
	 */
	public int outer_member_field=8888;
	
	/*
	 *  인스턴스 멤버메소드
	 */
	public void outer_member_method() {
		System.out.println(" OuterClass.member_method() ");
	}
	
	/*
	 * 	인스턴스 멤버클래스(nested class, inner class,)
	 * 	   - 작성이유 : 내부클래스에서 외부클래스의 멤버접근을 손쉽게하기위해서 
	 */
	public class InnerClass{
		public int inner_member_field=3333;
		
		public void inner_member_method() {
			System.out.println(" InnerClass.inner.member_method() ");
		}
		
	}
	
	
	
}
