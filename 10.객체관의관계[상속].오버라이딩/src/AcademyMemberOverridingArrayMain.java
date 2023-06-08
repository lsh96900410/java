import java.util.Iterator;

public class AcademyMemberOverridingArrayMain {

	public static void main(String[] args) {
		AcademyStudent[] students = new AcademyStudent[3];
		AcademyGangSa[] gangsas = new AcademyGangSa[2];
		AcademyStaff[] staffs = new AcademyStaff[2];

		students[0] = new AcademyStudent(1, "KIM", "JAVA");
		students[1] = new AcademyStudent(2, "LEE", "IOS");
		students[2] = new AcademyStudent(3, "PARK", "CLOUDE");

		gangsas[0] = new AcademyGangSa(4, "김강사", "JAVA");
		gangsas[1] = new AcademyGangSa(5, "정강사", "안드로이드");
		
		staffs[0]=new AcademyStaff(6, "천상용", "마케팅");
		staffs[1]=new AcademyStaff(7, "김나영", "회계");
		
		System.out.println("--------- AcademyMember 전체출력 --------------");
		System.out.println("------------- Student [for] ---------------");
		for (int i = 0; i < students.length; i++) {
			AcademyStudent academyStudent=students[i];
			academyStudent.print();
		}
		System.out.println("------------- Student [for] ---------------");
		for (AcademyStudent academyStudent : students) {
			academyStudent.print();
		}
		
		System.out.println("--------------- GangSa --------------------");
		for(AcademyGangSa academyGangSa : gangsas) {
			academyGangSa.print();
		}
		
		System.out.println("--------------- Staff --------------------");
		for(AcademyStaff academyStaff : staffs) {
			academyStaff.print();
		}
		
	}

}
