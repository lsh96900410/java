
public class OverridingChild extends OverridingParent{
	/*
	 * public void method1(){
			System.out.println("OverridingParnet.method1()");
	}
	
	<< 부모로부터 상속받은 자식메쏘드 method2 >>
	- 숨겨진다. (외부에서 호출안된다.)
	public void method2(){
		System.out.println("OverridingParnet.method2()");
	}
	 */
	
	/*
	 * << 자식에서 재정의한 자식메쏘드 >>
	 * - 자식에서재정의한 메쏘드만 호출된다.
	 */
	//super = 내부에서 부모에게 상속받은 것(숨겨짐) 사용할때
	@Override
	public void method2() {
		System.out.println("---- 재정의된 method2 start ----");
		super.method2();
		/*
		 * super
		 *  -this와 같은 self 참조변수
		 *  -this와 같은 주소값이다
		 *  -재정의에의해서 숨겨진 메쏘드(멤버)를 호출할때사용
		 */
		System.out.println("OverridingChild.meethod2()");
		System.out.println("---- 재정의된 method2 end ----");
	}
	
	public void method3() {
		System.out.println("OverridingChild.method3()");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
