public class AcademyGangSa extends AcademyMember {
	private String subject; //과목 //캡슐화,멤버변수 선언
	
	public AcademyGangSa() {//기본생성자 
		
	}
	public AcademyGangSa(int no,String name, String subject) { // int no, String name, String subject 갖는 생성자
		super(no,name); // 부모클래스의 변수 두개 호출가능.
		this.subject=subject; 
	}
	
	public void GangSaPrint() { //프린트 메쏘드
		super.print(); //부모 클래스 프린트메쏘드 
		System.out.println(this.subject);
	}
	
	// 캡슐화 했기때문에 변수에 접근 못하기에 필요함
	public String getSubject() { // subject 변수 값 불러오는 용도
		return subject;
	}
	public void setSubject(String subject) { // subject 변수 값 재할당 하는 용도
		this.subject = subject;
	}
	
}
