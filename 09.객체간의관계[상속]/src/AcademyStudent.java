public class AcademyStudent extends AcademyMember { // AcademyMember 클래스를 상속받은 AcademyStudent 클래스
	public String ban; //반
	// String 타입 변수 ban 선언
	public AcademyStudent() { // AcademyStudent 클래스의 기본생성자 생성 -> 객체 생성시 사용
		
	}
	public AcademyStudent(int no,String name,String ban) { // int타입 변수 no ,String 타입변수 name ,String 타입변수 ban 을 인자로 가지는 생성자 생성
		super(no,name); // 부모클래스의 인자 두개 생성자 호출
		this.ban=ban; 
	}
	public void studentPrint() { //프린트 메쏘드
		//System.out.println(this.no+"\t"+this.name+"\t"+this.ban);
		super.print(); //부모클래스의 프린트메쏘드 호출
		System.out.println(this.ban);//부모클래스 프린트메쏘드에 빠진 인자 출력
	}
	//get ,set
	public String getBan() {
		return ban;
	}
	public void setBan(String ban) {
		this.ban = ban;
	}
	
}
