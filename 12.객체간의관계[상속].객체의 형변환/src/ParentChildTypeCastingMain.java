/*
 객체주소변수의 타입(형) 변환
   1. 상속관계에있는 클래스 들에서만 가능하다.
      ex> 자식타입객체의주소를 부모타입객체의 주소로 형변환(주소변경절대안됨,타입만변경)
      ex> 부모타입객체의주소를 자식타입객체의 주소로 형변환(주소변경절대안됨,타입만변경)
        
   2. 자식클래스타입의 객체주소를 부모클래스타입의 객체주소로 형변환
       - 자동으로 이루어진다(묵시적)
       Child c = new Child();
       Parent pppp = c; 
   3. 부모타입객체의주소를 자식타입객체의 주소로 형변환
       - 원칙적으로는 불가능하다
       - 부모의 탈을쓴 자식객체 는 가능하다.
       Parent p=new Parent();
       Child cccc = p;(X)
    public class Parent{}
    public class Child extends Parent{}
 */


class Parent{
	public void method1() {
		System.out.println("Parent.method1()");
	}
	public void method2() {
		System.out.println("Parent.method2()");
	}
	public void method3() {
		System.out.println("Parent.method3()");
	}
}
   
class Child extends Parent{
	/*
	 public void method3() {
		System.out.println("Parent.method3()");
	  }
	 */
	@Override
	public void method3() {
		System.out.println("Child.method3() --> Parent.method3()를 재정의 [오버라이딩]");
	}
	
	public void method4() {
		System.out.println("Child.method4()");
	}
}





public class ParentChildTypeCastingMain {

	public static void main(String[] args) {
		System.out.println("--------------< Child > --------------");
		Child c1 = new Child();
		c1.method1();
		c1.method2();
		c1.method3(); //Child객체 재정의메쏘드호출
		c1.method4();
		System.out.println("-----------< Child --> Parent > ------------");
		/*
		 2. 자식타입객체의주소를 부모타입객체의 주소로 형변환
		  	-자동으로 이루어진다(묵시적)
		 */
		Parent p1=c1;
		if(p1==c1) {
			System.out.println(p1 +"==" + c1 +"[p1과 c1의 주소가 동일하다]");
		}
		p1.method1();
		p1.method2();
		p1.method3(); //Child 객체의재정의된메쏘드호출
		//p1.method4();

		/*
		   3. 부모타입객체의주소를 자식타입객체의 주소로 형변환
       		- 자동으로 이루어지지않는다. 
       		- 원칙적으로는 불가능하다
       		- 부모의 탈을쓴 자식객체 는 가능하다.
		 */
		Parent p2 = new Parent();
		/*
			Child c2=p2;
		 1. compile 시 
		  << Type mismatch: cannot convert from Parent to Child >>
		*/
	
		/*
		  	Child c2=(Child) p2;
		2. runtime시
		<< ClassCastException : Parent cannot be cast to Child >>
		*/
		
		Parent p3 =  new Child();
		System.out.println("-------- Child 객체를 Paretn타입변수로호출 --------");
		p3.method1();
		p3.method2();
		p3.method3(); //Child 객체의재정의된메쏘드호출
		//p3.method4();
		Child c3=(Child) p3;
		System.out.println("-------- Child객체를 Child타입변수로호출 --------");
		c3.method1();
		c3.method2();
		c3.method3(); //Child 객체의재정의된메쏘드호출
		c3.method4();
		
		
	}

}
