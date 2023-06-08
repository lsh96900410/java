
public class AcademyMemberMain {

	public static void main(String[] args) {
		/***************** 존재하지않는 개체생성 ******************
		AcademyMember academyMember = new  AcademyMember(0,"누구게");
		academyMember.print();
		***********************************************************/
		
		AcademyStudent st1=new AcademyStudent(1, "Kim", "LINUX");  //AcademyStdunet 타입객체  생성 후 값 대입. 
		AcademyStudent st2=new AcademyStudent(2, "SIM", "JAVA");   //AcademyStudent 타입객체  생성 후 값 대입
		AcademyStudent st3=new AcademyStudent(3, "LIM", "OFFICE"); //AcademyStudnet 타입객체  생성 후 값 대입
		
		AcademyGangSa gs1=new AcademyGangSa(4, "BOGUS", "JAVA");   //AcademyGangsa 타입객체  생성 후 값 대입
		AcademyGangSa gs2=new AcademyGangSa(5, "JAMES", "OFFICE"); //AcademyGangSa 타입객체  생성 후 값 대입
		
		AcademyStaff sf1=new AcademyStaff(6, "LEE", "MARKETING");   //AcademyStaff 타입객체  생성 후 값 대입
		AcademyStaff sf2=new AcademyStaff(7, "PARK", "ACCOUNTING"); //AcademyStaff 타입객체  생성 후 값 대입
		
		System.out.println("---------------------- Student ---------------------");
		/******** 호출되면안되는 메쏘드호출*******
		st1.print();
		******************************************/
		st1.studentPrint(); // st1( 참조변수 ,주소값 ) . (객체접근연산자) studentPrint() (메쏘드 호출)
		st2.studentPrint();
		st3.studentPrint();
		System.out.println("----------------------- GangSa --------------------------");
		gs1.GangSaPrint();
		gs2.GangSaPrint();
		System.out.println("----------------------- Staff ---------------------------");
		sf1.StaffPrint();
		sf2.StaffPrint();
		
		
	}

}
