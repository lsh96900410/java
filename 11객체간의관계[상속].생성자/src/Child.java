
public class Child extends Parent {
	private int member3;
	/*
	 * 클래스생성자 첫번째라인에서는 부모클래스의 생성자가 반드시 호출되어야합니다.
	 * -부모클래스의 생성자호출을 생략할경우에는 부모클래스의 기본생성자가 자동으로 호출된다.
	   -매개변수를 가진 부모생성자를 호출할수있다.(명시적으로 호출코드를 기술하여야한다)

	 */
	public Child() {
		super();
		System.out.println("Child() 기본생성자");
	}
	public Child(int member1, int member2, int member3) {
		/*
		 * 클래스생성자 첫번째라인에서는 부모클래스의 생성자가 반드시 호출되어야합니다.
		 * -부모클래스의 생성자호출을 생략할경우에는 부모클래스의 기본생성자가 자동으로 호출된다.
		   - 매개변수를 가진 부모생성자를 호출할수있다.(명시적으로 호출코드를 기술하여야한다)
		 */
		 super(member1,member2);
		// this.member1=member1;
		//this.member2=member2;
		 this.member3=member3;
		 System.out.println("3.Child(int member1, int member2, int member3)의 생성자");
	}
	public void method3() {
		System.out.println("Child.method3()");
	}
	public void print() {
		super.print();
		System.out.println(member3);
	}
}
