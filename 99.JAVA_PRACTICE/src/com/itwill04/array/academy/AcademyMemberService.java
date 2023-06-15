package com.itwill04.array.academy;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */

public class AcademyMemberService {

	private AcademyMember[] members;

	public AcademyMemberService() {
		members = new AcademyMember[9];
		members[0] = new AcademyStudent(1, "KIM", "자바");
		members[1] = new AcademyStudent(2, "LEE", "리눅스");
		members[2] = new AcademyStudent(3, "KIM", "자바");
		members[3] = new AcademyStudent(4, "LEE", "IOT");
		members[4] = new AcademyGangsa(5, "CHOI", "프로그래밍");
		members[5] = new AcademyGangsa(6, "KIM", "DB");
		members[6] = new AcademyGangsa(7, "DIM", "OS");
		members[7] = new AcademyStaff(8, "AIM", "영업");
		members[8] = new AcademyStaff(9, "QIM", "생산");

	};

	/*
	 * 1.AcademyMember 전체출력
	 */
	public void print() {
		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}
	}
	
	
	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 * 
	 */
	public AcademyMember findBynumber() {
		AcademyMember returnMember=new AcademyMember();
		for (int i = 0; i < members.length; i++) {
			if(members[i].getNo()==1) {
			returnMember=members[i];
			}
		}return returnMember;
	}
	
	
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember findByName() {
		AcademyMember returnMember =new AcademyMember();
		for (int i = 0; i < members.length; i++) {
			if(members[i].getName().equals("KIM")) {
				returnMember=members[i];
			}
		}return returnMember;
	}
	
	
	
	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public AcademyMember find() {
		AcademyMember academyStudent = new AcademyMember();
		for (int i = 0; i < members.length; i++) {
			if(members[i]instanceof AcademyStudent) {
				academyStudent=members[i];
			}
		}return academyStudent;
	}
	public AcademyMember find1() {
		AcademyMember academyStaff = new AcademyMember();
		for (int i = 0; i < members.length; i++) {
			if(members[i]instanceof AcademyStaff) {
				academyStaff=members[i];
			}
		}return academyStaff;
	}
	public AcademyMember find2() {
		AcademyMember academyGangsa = new AcademyMember();
		for (int i = 0; i < members.length; i++) {
			if(members[i]instanceof AcademyGangsa) {
				academyGangsa=members[i];
			}
		}return academyGangsa;
	}
	
	
	
	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	 */
	/*
	public AcademyMember java() {
		AcademyMember java=new AcademyMember();
		//AcademyMember stu=new AcademyStudent();
		for (int i = 0; i < members.length; i++) {
			if(members[i] instanceof AcademyStudent) {
				if(){
					java=members[i];
				}
			}
		}return java;
	}
	*/
	/*
	public AcademyMember staff() {
		AcademyMember staff=new AcademyMember();
		for (int i = 0; i < members.length; i++) {
			if(members[i]. && members[i]instanceof AcademyStudent) {
				staff=members[i];
			}
		}return staff;
	}
	
	public AcademyMember gangsa() {
		AcademyMember java=new AcademyMember();
		for (int i = 0; i < members.length; i++) {
			if(members[i].getClass().equals("자바") && members[i]instanceof AcademyStudent) {
				java=members[i];
			}
		}return java;
	}
	*/
	/*
	 * 5.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘[OPTION]
	 * 5.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘[OPTION] 
	 * 5.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘[OPTION]
	 */
	
}
