
public class AcademyMemberTypeCastingMain {

	public static void main(String[] args) {
		AcademyStudent st1=new AcademyStudent(1, "KIM", "ANDROID");
		
		AcademyMember m1=st1;
		AcademyMember m2=new AcademyStudent(2, "LEE", "JAVA");
		AcademyMember m3=new AcademyStudent(3, "JIM", "OFFICE");
	
		AcademyMember m4=new AcademyGangsa(4, "박강사", "보안");
		AcademyMember m5=new AcademyGangsa(5, "정강사", "빅데이터");
	
		AcademyMember m6=new AcademyStaff(6, "박원장", "원장");
		AcademyMember m7=new AcademyStaff(6, "나대리", "교무");
		/***** AcademyMember에 정의되지않은 메쏘드가 호출불가능 *****/
		/*
		String ban = m1.getBan();
		The method getBan() is undefined for the type AcademyMembe
		*/
		/**** AcademyMember에 정의된 메쏘드중 재정의된 메쏘드 호출가능 
			- AcademyMember타입에 정의된 print메쏘드를 호출하면
			- AcademyMember의 자식타입객체의 재정의된 print메쏘드가호출된다 
		***/
		
		m1.print();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
