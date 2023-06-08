
public class AcademyMemberOverridingMain {

	public static void main(String[] args) {
		/***************** 존재하지않는 개체생성 ******************
		AcademyMember academyMember = new  AcademyMember(0,"누구게");
		academyMember.print();
		***********************************************************/
		
		AcademyStudent st1=new AcademyStudent(1, "Kim", "LINUX");
		AcademyStudent st2=new AcademyStudent(2, "SIM", "JAVA");
		AcademyStudent st3=new AcademyStudent(3, "LIM", "OFFICE");
		
		AcademyGangSa gs1=new AcademyGangSa(4, "BOGUS", "JAVA");
		AcademyGangSa gs2=new AcademyGangSa(5, "JAMES", "OFFICE");
		
		AcademyStaff sf1=new AcademyStaff(6, "LEE", "MARKETING");
		AcademyStaff sf2=new AcademyStaff(7, "PARK", "ACCOUNTING");
		
		System.out.println("---------------------- Student ---------------------");
		/******** 호출되면안되는 메쏘드호출*******
		st1.print();
		******************************************/
		st1.print();
		st2.print();
		st3.print();
		System.out.println("----------------------- GangSa --------------------------");
		gs1.print();
		gs2.print();
		System.out.println("----------------------- Staff ---------------------------");
		sf1.print();
		sf2.print();
		
		
	}

}
