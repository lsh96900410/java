
public class OverridingParentChildMain {

	public static void main(String[] args) {
		OverridingChild oc=
				new OverridingChild();
		oc.method1();
		oc.method2();
		/*
		 * oc.method2()호출시에는
		 * 자식에서 재정의된메쏘드가 호출
		 */
		oc.method3();
	}

}
