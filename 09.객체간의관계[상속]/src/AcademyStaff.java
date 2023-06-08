public class AcademyStaff extends AcademyMember { // AcademyMember 클래스를 부모클래스로 가짐.
	private String depart;  //부서
	// String 타입 변수 depart 선언(멤버변수)
	public AcademyStaff() {//기본생성자 선언
		
	}
	
	public AcademyStaff(int no,String name,String depart) {//int타입 변수 no ,String 타입 변수 name, String 타입변수 depart 를 인자로 가지는 생성자 생성
		super(no,name); // 부모클래스 AcademyMember int 타입변수 no ,String 타입변수 name을 인자로가는 생성자를 가져옴 ( 상속)
		this.depart=depart;
	}
	
	public void StaffPrint() { //프린트메쏘드
		super.print(); // 부모클래스 AcademyMember의 프린트메쏘드 호출
		System.out.println(this.depart); //자식 클래스의 나머지 변수 호출
	}

	// 멤버변수가 캡슐화로 접근 불가이기에 get,set 생성
	// get : 캡슐화된 변수의 값 읽기
	// set : 캡슐화된 변수의 값 재할당
	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}
	
}
