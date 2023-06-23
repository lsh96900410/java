
public class OuterClassOverridingInnerClass {

	private int outer_member_field;
	public void outer_memeber_method() {
		System.out.println("OuterClassOverridingInnerClass.outer_member_method()");
	}
	
	
	/******************* OuterClass에서 InnerClass 객체생성사용 ************************/
	public void outer_inner_class_user() {
		/********************** member inner class[CASE1] ******************************/
		ChildParentFirstConcreteClass childParentFirstConcreteClass1=new ChildParentFirstConcreteClass();
		ChildParentSecondAbstractClass childParentSecondAbstractClass1 =new ChildParentSecondAbstractClass();
		ChildParentThirdInterface childParentThirdInterface1=new ChildParentThirdInterface();
		childParentFirstConcreteClass1.method();
		childParentSecondAbstractClass1.method();
		childParentThirdInterface1.method();
		/********************** anonymous local inner class[CASE2] ******************************/
		/*
			특정클래스의 메쏘드를 재정의해야할때
			1. local위치에 이름이없는 클래스를정의
			2. local위치에서 객체를생성
		*/
		
		ParentFirstConcreteClass childParentFirstConcreteClass2=new ParentFirstConcreteClass() {
			@Override
			public void method() {
				System.out.println("ParentFirstConcreteClass을 상속받는 "
						+ "이름없는 로칼내부클래스에서 재정의한 method()");
			}
		};
		childParentFirstConcreteClass2.method();
		ParentSecondAbstractClass childParentSecondAbstractClass2 =new ParentSecondAbstractClass() {
			@Override
			public void method() {
				System.out.println("ParentSecondAbstractClass을 상속받는 "
						+ "이름없는 로칼내부클래스에서 재정의한 method()");
			}
		};
		childParentSecondAbstractClass2.method();
		
		ParentThirdInterface childParentThirdInterface2 =new ParentThirdInterface() {
			@Override
			public void method() {
				System.out.println("ParentThirdInterface을 상속받는 "
						+ "이름없는 로칼내부클래스에서 재정의한 method()");
			}
		}; //$no 형식으로 존재
	childParentThirdInterface2.method();
	
	Object objectChild = new Object() {
		@Override
		public String toString() {
			return "난 재정의한메쏘드";
		}
	};
	System.out.println(objectChild);
	
}  
	
	
	public static void main(String[] args) {
		OuterClassOverridingInnerClass outerClassOverridingInnerClass = new OuterClassOverridingInnerClass();
		outerClassOverridingInnerClass.outer_inner_class_user();
	}
	
	
	
	/************************** member inner class *************************************/
	public class ChildParentFirstConcreteClass extends ParentFirstConcreteClass{
		@Override
		public void method() {
			System.out.println("ParentFirstConcreteClass을 상속받는 "
					+ "ChildParentFirstConcreteClass1에서 재정의한 method");
		}
	}
	
	public class ChildParentSecondAbstractClass extends ParentSecondAbstractClass{
		@Override
		public void method() {
			System.out.println("ParentSecondAbstractClass을 상속받는 "
					+ "ChildParentSecondAbstractClass1에서 재정의한 method");
		}
	}
	
	public class ChildParentThirdInterface implements ParentThirdInterface{
		@Override
		public void method() {
			System.out.println("ParentThirdInterface을 상속(구현)받는 "
					+ "ChildParentThirdInterface1에서 재정의한 method");
		}
	}
	
}
