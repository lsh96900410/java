
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
	/***************** OuterClass에서 InnerClass객체생성사용 ********************/
	public void outer_inner_class_use () {
		InnerClass ic=new InnerClass();
		ic.inner_member_field=31232;
		ic.inner_member_method();
		System.out.println(ic);
		System.out.println(ic.inner_member_field);
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
		/************** 내부클래스에서 외부클래스의 멤버접근**********************/
		public void inner_outer_member_access() {
			
			/*
			System.out.println(InnerClass.this.inner_member_field);
			InnerClass.this.inner_member_method();
			*/
			
			System.out.println(OuterClass.this.outer_member_field);
			OuterClass.this.outer_member_method();
			
			System.out.println(outer_member_field);
			outer_member_method();
			
			
		}
	}
}
