public class AcademyGangSa extends AcademyMember {
	public String subject; //과목
	
	public AcademyGangSa() {
		
	}
	public AcademyGangSa(int no,String name, String subject) {
		this.no=no;
		this.name=name;
		this.subject=subject;
	}
	
	public void GangSaPrint() {
		this.print();
		System.out.println(this.subject);
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
}
