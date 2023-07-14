package OOP;

class Animal{ 
	String name = "chu";
	int age=8; 
	// 멤버필드(속성)
	
	public void cry() {
		System.out.println("멍");
	}
	// 멤버메쏘드 
	
} // animal 객체를 만들기 위한 틀

public class ClassSelf {
	public static void main(String[] args) {
		Animal dog=new Animal();
		/*
			dog = 객체 ,참조변수 , 주소값
				= Animal의 인스턴스화
		*/
		System.out.println(dog.age);  // =8
		System.out.println(dog.name); // =chu
	}
}
