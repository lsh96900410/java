import java.util.Iterator;

public class AcademyMemberArrayMain {

	public static void main(String[] args) {
		AcademyStudent[] students = new AcademyStudent[3]; // AcademyStudent 배열 타입 배열객체 생성( students = 객체 주소값,참조변수) 배열의 길이는 3 (index 0,1,2)
		AcademyGangSa[] gangsas = new AcademyGangSa[2]; // AcademyGangSa 배열 타입 길이 2인 배열객체 생성 (gangsas = 배열객체 주소값,참조변수) 배열객체에 저장되는 값 : AcademyGangSa 타입
		AcademyStaff[] staffs = new AcademyStaff[2]; // AcademyStaff 배열 타입 길이2인 배열객체 생성 (staffs = 배열객체 주고밧,참조변수) 

		students[0] = new AcademyStudent(1, "KIM", "JAVA"); //students 0번 인덱스에 AcademyStudent 타입 값 대입 
		students[1] = new AcademyStudent(2, "LEE", "IOS"); //students 1번 인덱스에 AcademyStudent 타입 값 대입
		students[2] = new AcademyStudent(3, "PARK", "CLOUDE"); // students 2번 인덱스에 AcademyStudent 타입 값 대입

		gangsas[0] = new AcademyGangSa(4, "김강사", "JAVA"); //gangsas 0번 인덱스에 AcademyGangSa 타입 값 대입
		gangsas[1] = new AcademyGangSa(5, "정강사", "안드로이드"); // gangsas 1번 인덱스에 AcademyGangsa 타입 값 대입
		
		staffs[0]=new AcademyStaff(6, "천상용", "마케팅"); //staffs 0번 인덱스에 AcademyStaff 타입 값 대입
		staffs[1]=new AcademyStaff(7, "김나영", "회계"); //staffs 1번 인덱스에 AcademyStaff 타입 값 대입
		
		System.out.println("--------- AcademyMember 전체출력 --------------");
		System.out.println("------------- Student [for] ---------------");
		for (int i = 0; i < students.length; i++) {
			AcademyStudent academyStudent=students[i];
			academyStudent.print();
		} // students[]  전체출력
		System.out.println("------------- Student [for] ---------------");
		for (AcademyStudent academyStudent : students) {
			academyStudent.studentPrint();
		}//향상된 for문 : for( 타입 변수 : 배열 ){ 실행문}
		
		System.out.println("--------------- GangSa --------------------");
		for(AcademyGangSa academyGangSa : gangsas) {
			academyGangSa.GangSaPrint();
		}// gangsas[] 전체출력
		
		System.out.println("--------------- Staff --------------------");
		for(AcademyStaff academyStaff : staffs) {
			academyStaff.StaffPrint();
		}// staffs [] 전체출력
		
	}//메인메쏘드 종료

}
