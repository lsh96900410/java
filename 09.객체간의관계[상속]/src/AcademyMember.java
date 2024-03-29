
public class AcademyMember {
	//멤버변수 선언
	private int no;  //int 타입 변수 no
	private String name;  //String 타입 변수 name  
	
	//기본생성자 선언
	public AcademyMember() {
	}
	// int no , String name 인자로 가지는 생성자 선언 -> 객체 생성시 사용가능 오버로딩
	public AcademyMember(int no, String name) {
		this.no = no;
		this.name = name;
	}
	//프린트 메쏘드
	public void print(){
			System.out.print(this.no+"\t"+this.name+"\t");
	}
	//각 변수 캡슐화로 접근 불가 -> get : 값 받는 용도  , set : 값 재할당 용도
	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}