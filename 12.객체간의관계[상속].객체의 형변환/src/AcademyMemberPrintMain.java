
public class AcademyMemberPrintMain {

	public static void main(String[] args) {
		AcademyMemberPrint academyMemberPrint = new AcademyMemberPrint();
		/******************** Case1 
		academyMemberPrint.academyStudentPrint(new AcademyStudent(1, "KIM", "자바"));
		academyMemberPrint.academyGangsaPrint(new AcademyGangsa(2, "KIM", "자바"));
		academyMemberPrint.academyStaffPrint(new AcademyStaff(3, "KIM", "자바"));
		*********************/
		/******************** Case2 *********************/
		academyMemberPrint.academyMemberPrint(new AcademyStudent(1, "KIM", "자바"));
		academyMemberPrint.academyMemberPrint(new AcademyGangsa(2, "KIM", "자바"));
		academyMemberPrint.academyMemberPrint(new AcademyStaff(3, "KIM", "자바"));
		
	}

}
