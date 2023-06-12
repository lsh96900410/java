
public class FinalMethodClassChild extends FinalMethodClass{
	public void method1() {
		System.out.println("FianlMethodClassChild에서 상속받은"
				+ "FinalMethodClass.method1()을 재정의");
	}
	/*
	public void method2() {
	}
	- Cannot override the final method from FinalMethodClass
	*/
}
